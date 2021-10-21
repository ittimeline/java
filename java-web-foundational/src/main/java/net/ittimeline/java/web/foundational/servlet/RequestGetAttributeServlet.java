package net.ittimeline.java.web.foundational.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * HttpServletRequest作为域对象共享数据
 * @author tony 18601767221@163.com
 * @version 2021/7/17 15:31
 * @since JDK11
 */
@WebServlet("/request/get")
public class RequestGetAttributeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String courseName =(String) request.getAttribute("courseName");
        System.out.println("从request作用域获取courseName的值是"+courseName);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
