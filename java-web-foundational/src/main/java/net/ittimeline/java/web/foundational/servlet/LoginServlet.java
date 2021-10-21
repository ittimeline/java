package net.ittimeline.java.web.foundational.servlet;

import net.ittimeline.java.web.foundational.bean.entity.User;
import net.ittimeline.java.web.foundational.service.UserService;
import net.ittimeline.java.web.foundational.service.impl.UserServiceImpl;
import net.ittimeline.java.web.foundational.util.CookieConfig;
import net.ittimeline.java.web.foundational.util.CookieUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * @author tony 18601767221@163.com
 * @version 2021/7/18 11:19
 * @since JDK11
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    /**
     * Web层依赖Service层
     */
    private UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("LoginServlet接收到了客户端登录请求");

        //处理POST请求的请求乱码
        request.setCharacterEncoding("UTF-8");
        //处理POST请求的响应乱码
        response.setContentType("text/html;charset=UTF-8");
        //获取请求参数
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        //获取客户端输入的验证码
        String clientCaptcha = request.getParameter("captcha");

        //获取生成的验证码
        //Session的应用场景 将Servlet生成的验证码存储在Session中
        String serverCaptcha = (String) request.getSession().getAttribute("captcha");

        String errorMessage = null;
        if (null!=serverCaptcha){
            //校验验证是否正确 验证码不区分大小写
            if (serverCaptcha.equalsIgnoreCase(clientCaptcha)) {
                //请求参数校验
                if (name != null && name != "" && password != null && password != "") {
                    User user = new User();
                    user.setName(name);
                    user.setPassword(password);
                    boolean login = false;
                    try {
                        login = userService.login(user);
                    } catch (Exception e) {
                        e.printStackTrace();
                        errorMessage=e.getMessage();
                    }
                    if (login) {
                        //登录成功之后如果用户勾选了记住用户名和密码，就将用户名和密码写到浏览器的cookie中,并且保存15天
                        String remember = request.getParameter("remember");
                        if (remember!=null){
                            CookieConfig cookieConfigName=new CookieConfig();
                            cookieConfigName.setPath(request.getContextPath());
                            cookieConfigName.setCookieName("name");
                            cookieConfigName.setCookieValue(user.getName());
                            cookieConfigName.setMaxAge(15*24*60*60);
                            CookieUtil.addCookie(cookieConfigName,response);

                            CookieConfig cookieConfigPassword=new CookieConfig();
                            cookieConfigPassword.setPath(request.getContextPath());
                            cookieConfigPassword.setCookieName("password");
                            cookieConfigPassword.setCookieValue(user.getPassword());
                            cookieConfigPassword.setMaxAge(15*24*60*60);
                            CookieUtil.addCookie(cookieConfigPassword,response);
                        }else{
                            //用户没有勾选记住用户名和密码，就要删除cookie
                            CookieConfig nameCookieConfig =new CookieConfig();
                            nameCookieConfig.setPath(request.getContextPath());
                            nameCookieConfig.setCookieName("name");
                            nameCookieConfig.setCookieValue("");
                            CookieUtil.removeCookie(nameCookieConfig,response);

                            CookieConfig passwordCookieConfig =new CookieConfig();
                            passwordCookieConfig.setPath(request.getContextPath());
                            passwordCookieConfig.setCookieName("password");
                            passwordCookieConfig.setCookieValue("");
                            CookieUtil.removeCookie(passwordCookieConfig,response);
                        }


                        //登录成功之后跳转到success.jsp并且显示用户登录信息
                        //将用户的登录信息存储到Session中
                        request.getSession().setAttribute("user", user);
                        response.sendRedirect("pages/success.jsp");
                    } else {
                        errorMessage = "用户名或者密码错误";
                        //因为用户登录时每次都会访问Servlet，每次输入的参数可能不同，导致的失败原因就不一样
                        // ，而HttpServletRequest域对象刚好就是一次请求范围内有效。

                        request.setAttribute("errorMessage", errorMessage);
                        //HttpServletRequest域对象必须结合请求转发跳转
                        //登录失败之后必须跳转到login.jsp并且显示登录失败的原因
                        request.getRequestDispatcher("pages/login.jsp").forward(request, response);


                    }
                } else {
                    errorMessage = "用户名或者密码不能为空";
                    request.setAttribute("errorMessage", errorMessage);
                    //HttpServletRequest域对象必须结合请求转发跳转
                    //登录失败之后必须跳转到login.jsp并且显示登录失败的原因
                    request.getRequestDispatcher("pages/login.jsp").forward(request, response);

                }
            } else {
                errorMessage = "验证码输入错误";
                request.setAttribute("errorMessage", errorMessage);
                //HttpServletRequest域对象必须结合请求转发跳转
                //登录失败之后必须跳转到login.jsp并且显示登录失败的原因
                request.getRequestDispatcher("pages/login.jsp").forward(request, response);
            }
        }




    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}