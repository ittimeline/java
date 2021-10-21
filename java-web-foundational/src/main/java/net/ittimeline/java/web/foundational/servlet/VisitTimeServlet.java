package net.ittimeline.java.web.foundational.servlet;

import net.ittimeline.java.web.foundational.util.CookieConfig;
import net.ittimeline.java.web.foundational.util.CookieUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Cookie实现记住用户上次访问的时间
 * @author tony 18601767221@163.com
 * @version 2021/7/19 11:25
 * @since JDK11
 */
@WebServlet("/visit")
public class VisitTimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        // 需求：如果用户是第一次访问网站，响应结果是你是第一次访问，如果用户不是第一次访问网站，响应结果是显示上次的访问时间。

        String cookieName="visitTime";
        Cookie cookie = CookieUtil.getCookie(request, cookieName);
        String responseText="";
        //没有获取到上次访问时间的Cookie
        if (cookie==null){
            responseText="<h1>你是第一次访问网站</h1>";
        }else{
            responseText="<h1>上次访问的时间是"+cookie.getValue()+"<h1>";
        }
        //每次访问网站都要更新访问时间的Cookie
        CookieConfig cookieConfig=new CookieConfig();
        cookieConfig.setPath(request.getContextPath());
        cookieConfig.setCookieName(cookieName);
        //Cookie的值不能有空格
        cookieConfig.setCookieValue(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd/HH:mm:ss")));
        CookieUtil.addCookie(cookieConfig,response);

        response.getWriter().write(responseText);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
