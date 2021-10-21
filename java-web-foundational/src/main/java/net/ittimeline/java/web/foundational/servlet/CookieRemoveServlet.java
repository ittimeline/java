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
 * @author tony 18601767221@163.com
 * @version 2021/7/19 10:55
 * @since JDK11
 */
@WebServlet("/cookie/remove")
public class CookieRemoveServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String cookieName=request.getParameter("cookieName");
      /*  //目标 删除cookieName为 courseName的Cookie
        //设置一个同名的、同项目路径，有效期为0就可以删除Cookie

        String cookieName="courseName";
        //Cookie不会存储中文
        String cookieValue="Java";
        Cookie cookie= new Cookie(cookieName, cookieValue);
        cookie.setPath(request.getContextPath());
        cookie.setMaxAge(0);
        response.addCookie(cookie);
*/
        //调用CookieUtil工具类删除Cookie
        if (null!=cookieName&&cookieName!=""){
            CookieConfig cookieConfig=new CookieConfig();
            cookieConfig.setCookieName(cookieName);
            cookieConfig.setCookieValue(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd/HH:mm:ss")));
            cookieConfig.setPath(request.getContextPath());
            CookieUtil.removeCookie(cookieConfig,response);

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
