package net.ittimeline.java.web.foundational.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * HttpServletRequest实现请求转发
 * @author tony 18601767221@163.com
 * @version 2021/7/17 15:02
 * @since JDK11
 */
@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //绝对路径 是以/开头的路径 对应请求转发而言在完整URL基础之上省略项目路径,对于非请求转发而言在完整的URL基础之上省略服务器路径
        // 完整的URL   http://localhost:8080/javaweb/forward.html
        // 项目路径  http://localhost:8080/javaweb
        //服务器路径 http://localhost:8080/

        //绝对路径方式请求转发跳转
        request.getRequestDispatcher("/pages/forward.html").forward(request,response);




        //相对路径 不是以/开头的路径，是以目标资源路径相对于当前资源路径
        //浏览器请求资源的地址(当前资源路径) http://localhost:8080/javaweb/forward
        //目标地址（目标资源路径）是        http://localhost:8080/javaweb/pages/forward.html


        //相对路径方式请求转发跳转
        //request.getRequestDispatcher("pages/forward.html").forward(request,response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
