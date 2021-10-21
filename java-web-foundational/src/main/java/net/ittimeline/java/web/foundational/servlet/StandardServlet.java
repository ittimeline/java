package net.ittimeline.java.web.foundational.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 标准Servlet的创建
 * @author tony 18601767221@163.com
 * @version 2021/7/15 20:58
 * @since JDK11
 */
@WebServlet("/standard")
public class StandardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //处理请求
        System.out.println("收到了Get请求");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //处理请求
        System.out.println("收到了Post请求");
    }
}
