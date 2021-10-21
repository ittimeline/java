package net.ittimeline.java.web.foundational.servlet;

import com.alibaba.fastjson.JSON;
import net.ittimeline.java.web.foundational.bean.request.UserLoginRequest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * 处理Axios发送的异步请求
 *
 * @author tony 18601767221@163.com
 * @version 2021/8/13 13:47
 * @since JDK11
 */
@WebServlet("/axios")
public class HandlerAxiosAsyncRequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("获取Content-Type:" + request.getContentType());
        UserLoginRequest userLoginRequest=null;
        // application/json;charset=UTF-8
        //请求参数格式是JSON
        if ("application/json;charset=UTF-8".equals(request.getContentType())) {
             userLoginRequest = JSON.parseObject(request.getInputStream(), UserLoginRequest.class);
            System.out.println("请求参数是 name :" + userLoginRequest.getName() + "password:" + userLoginRequest.getPassword());

        } else {
            //请求参数格式是普通文本
            String name = request.getParameter("name");
            String password = request.getParameter("password");
            System.out.println("请求参数是 name :" + name + "password:" + password);
            userLoginRequest=new UserLoginRequest(name,password);


        }
        String responseJSONString = JSON.toJSONString(userLoginRequest);
        response.getWriter().write(responseJSONString);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
