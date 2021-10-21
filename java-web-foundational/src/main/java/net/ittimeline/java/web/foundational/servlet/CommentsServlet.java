package net.ittimeline.java.web.foundational.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * @author tony 18601767221@163.com
 * @version 2021/7/23 13:32
 * @since JDK11
 */
@WebServlet("/comments")
public class CommentsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("request 类型信息"+request.getClass());
        String comments=request.getParameter("comments");
        response.setContentType("text/html");
        response.getWriter().write("评论的内容是"+comments);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
