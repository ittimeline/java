package net.ittimeline.java.web.foundational.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * 展示网站的访问人数
 * @author tony 18601767221@163.com
 * @version 2021/7/16 8:37
 * @since JDK11
 */
@WebServlet("/statistic/info")
public class StatisticInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Integer count =(Integer) getServletContext().getAttribute("count");
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write("<h1>当前网站的访问人数是"+count+"人</h1>");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
