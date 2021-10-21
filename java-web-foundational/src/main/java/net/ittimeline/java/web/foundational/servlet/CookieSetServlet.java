package net.ittimeline.java.web.foundational.servlet;

import net.ittimeline.java.web.foundational.util.CookieConfig;
import net.ittimeline.java.web.foundational.util.CookieUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * Cookie实现会话的数据共享
 * @author tony 18601767221@163.com
 * @version 2021/7/19 10:25
 * @since JDK11
 */
@WebServlet("/cookie/set")
public class CookieSetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    /*    //服务器给浏览器写指定名称的Cookie
        String cookieName="courseName";
        //Cookie不会存储中文
        String cookieValue="Java";
        Cookie cookie= new Cookie(cookieName, cookieValue);
        //由于Cookie在关闭浏览器之后就被删除了，如果想长久使用就需要改变它的有效时间，即使服务器重启也没事，因为Cookie存储在浏览器
        //例如这里的有效期是7天
        cookie.setMaxAge(7*24*60*60);

        //设置Cookie的有效路径  一般设置的是当前项目
        cookie.setPath(request.getContextPath());
        //通过Set-Cookie的响应头将Cookie写给浏览器
        response.addCookie(cookie);*/

        CookieConfig cookieConfig=new CookieConfig();
        cookieConfig.setCookieName("courseName");
        cookieConfig.setCookieValue("Java");
        cookieConfig.setPath(request.getContextPath());
        CookieUtil.addCookie(cookieConfig,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
