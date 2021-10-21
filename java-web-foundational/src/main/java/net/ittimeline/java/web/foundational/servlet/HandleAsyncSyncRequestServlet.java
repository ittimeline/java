package net.ittimeline.java.web.foundational.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * 处理客户端的同步和异步请求
 * @author tony 18601767221@163.com
 * @version 2021/8/6 18:12
 * @since JDK11
 */
@WebServlet("/handle")
public class HandleAsyncSyncRequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("name");
        System.out.println("HandleAsyncSyncRequestServlet接收到了请求，" +
                "请求的参数 name = "+name+"请求的方式"+request.getMethod());
       // System.out.println(1/0);
        response.setContentType("text/html");
        response.getWriter().write("响应数据"+name);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
