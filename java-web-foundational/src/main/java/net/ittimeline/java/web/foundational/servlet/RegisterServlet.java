package net.ittimeline.java.web.foundational.servlet;

import net.ittimeline.java.web.foundational.bean.entity.User;
import net.ittimeline.java.web.foundational.service.UserService;
import net.ittimeline.java.web.foundational.service.impl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Map;

/**
 * 用户注册Servlet
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/18 10:58
 * @since JDK11
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    /**
     * Web层依赖Service层
     */
    private UserService userService=new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //处理POST请求的请求乱码
        request.setCharacterEncoding("UTF-8");
        //处理POST请求的响应乱码
        response.setContentType("text/html;charset=UTF-8");
        //获取所有的请求参数
        Map<String, String[]> allRequestParameterMap = request.getParameterMap();
        //请求参数校验
        if (null!=allRequestParameterMap&&allRequestParameterMap.keySet().size()>0){
            User user = new User();
            try {
                //map的key必须和对象的属性名保持一致
                //底层就是反射设值
                BeanUtils.populate(user,allRequestParameterMap);
                boolean register = userService.register(user);
                if (register) {
                    response.getWriter().write("<h1>注册成功</h1>");
                }
            } catch (Exception e) {
                e.printStackTrace();
                response.getWriter().write("<h1>注册失败</h1>");

            }


        }else {
            response.getWriter().write("<h1>注册失败</h1>");
        }






    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
