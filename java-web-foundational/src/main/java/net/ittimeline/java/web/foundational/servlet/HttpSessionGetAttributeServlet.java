package net.ittimeline.java.web.foundational.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * @author tony 18601767221@163.com
 * @version 2021/7/19 16:31
 * @since JDK11
 */
@WebServlet("/session/get")
public class HttpSessionGetAttributeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取HttpSession
        HttpSession session = request.getSession();
        //从HttpSession中获取指定name的数据
        String courseName =(String) session.getAttribute("courseName");
        if (null!=courseName&&courseName!=""){
            System.out.println("从Session作用域对象获取的courseName的结果是"+courseName);

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
