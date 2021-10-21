package net.ittimeline.java.web.foundational.servlet;

import net.ittimeline.java.web.foundational.util.CookieConfig;
import net.ittimeline.java.web.foundational.util.CookieUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 *
 * Session实现会话数据共享
 * @author tony 18601767221@163.com
 * @version 2021/7/19 16:29
 * @since JDK11
 */
@WebServlet("/session/set")
public class HttpSessionSetAttributeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取HttpSession
        HttpSession session = request.getSession();
        //往HttpSession中存储数据
        session.setAttribute("courseName","跟光磊学Java");
        // 设置保存在浏览器端的名为JESSSIONID的Cookie的maxAge改成30分钟
        CookieConfig cookieConfig=new CookieConfig();
        cookieConfig.setCookieName("JSESSIONID");
        cookieConfig.setCookieValue(session.getId());
        cookieConfig.setPath(request.getContextPath());
        cookieConfig.setMaxAge(30*60);
        CookieUtil.addCookie(cookieConfig,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
