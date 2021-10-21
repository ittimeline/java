package net.ittimeline.java.web.foundational.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * @author tony 18601767221@163.com
 * @version 2021/7/16 8:25
 * @since JDK11
 */
@WebServlet("/context/set")
public class ServletContextSetAttributeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().setAttribute("name", "tony");
        System.out.println("往ServletContext容器中存放数据");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
