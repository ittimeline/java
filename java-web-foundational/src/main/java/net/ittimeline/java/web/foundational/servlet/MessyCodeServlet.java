package net.ittimeline.java.web.foundational.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 *
 *  POST 请求和POST响应乱码处理
 * @author tony 18601767221@163.com
 * @version 2021/7/17 17:22
 * @since JDK11
 */
@WebServlet("/messy/code")
public class MessyCodeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("客户端请求的方式是"+request.getMethod());


        //处理POST请求的乱码
        request.setCharacterEncoding("UTF-8");
        final String name = request.getParameter("name");
        System.out.println("请求参数 参数名为name的值是"+name);




        //处理POST响应的乱码
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().write("<h1>欢迎学习Java Web</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);

    }
}
