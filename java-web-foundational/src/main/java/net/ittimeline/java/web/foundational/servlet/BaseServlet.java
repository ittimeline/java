package net.ittimeline.java.web.foundational.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * Base Servlet
 * 子类继承该类
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/28 21:32
 * @since JDK11
 */
public class BaseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getParameter("method");
        //method参数名和方法名相同
        //而且所有的方法的参数都相同
        //因此可以反射调用，不需要写那么多if/else if
        if (null!=method&&method!=""){
            try {
                Method[] methods = this.getClass().getMethods();
                if (null != methods && methods.length > 0) {
                    for (Method currentMethod : methods) {
                        if (currentMethod.getName().equals(method)) {
                            currentMethod.invoke(this, request, response);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
