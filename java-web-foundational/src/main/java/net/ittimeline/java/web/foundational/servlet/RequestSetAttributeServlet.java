package net.ittimeline.java.web.foundational.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * HttpServletRequest作为域对象共享数据
 * @author tony 18601767221@163.com
 * @version 2021/7/17 15:29
 * @since JDK11
 */
@WebServlet("/request/set")
public class RequestSetAttributeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                request.setAttribute("courseName","跟光磊学Java");
                //如果不使用请求转发，无法在request作用域获取courseName对应的值
                request.getRequestDispatcher("../request/get").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
