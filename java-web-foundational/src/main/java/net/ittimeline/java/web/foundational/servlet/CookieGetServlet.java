package net.ittimeline.java.web.foundational.servlet;

import net.ittimeline.java.web.foundational.util.CookieUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * Cookie实现会话的数据共享
 * @author tony 18601767221@163.com
 * @version 2021/7/19 10:28
 * @since JDK11
 */
@WebServlet("/cookie/get")
public class CookieGetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*//获取浏览器带过的指定名称的Cookie
        //获取浏览器请求头中的名为Cookie的所有Cookie
        Cookie[] cookies = request.getCookies();
        //获取cookieName为courseName的Cookie信息
        String cookieName="courseName";
        if (cookies!=null&&cookies.length>0) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(cookieName)){
                    System.out.println("获取cookieName为courseName的Cookie信息 结果是"+cookie.getValue());
                }
            }
        }*/
        String cookieName="courseName";
        Cookie cookie = CookieUtil.getCookie(request, cookieName);
        if (cookie!=null){
            System.out.println("获取cookieName为courseName的Cookie信息 结果是"+cookie.getValue());

        }



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
