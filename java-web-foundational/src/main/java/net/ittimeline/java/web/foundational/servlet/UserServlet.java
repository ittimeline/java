package net.ittimeline.java.web.foundational.servlet;


import com.alibaba.fastjson.JSON;
import net.ittimeline.java.web.foundational.bean.response.ResponseBean;
import net.ittimeline.java.web.foundational.exception.BusinessException;
import net.ittimeline.java.web.foundational.service.UserService;
import net.ittimeline.java.web.foundational.service.impl.UserServiceImpl;

import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author tony 18601767221@163.com
 * @version 2021/8/7 13:16
 * @since JDK11
 */
@WebServlet("/user")
public class UserServlet extends BaseServlet {

    UserService userService=new UserServiceImpl();

    /**
     * 客户端异步请求校验用户名
     * @param request
     * @param response
     * @throws IOException
     */
    public void checkName(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ResponseBean<Boolean> responseBean=new ResponseBean<>(Boolean.TRUE);

        try {
            String name = request.getParameter("name");
            //校验请求参数
            String errorMessage = validation(name);
            if (null==errorMessage){
                boolean isExists = userService.findByName(name);
                //用户名不存在
                if (!isExists){
                    //
                    responseBean.setData(true);
                }

            }
        }
        catch (BusinessException e) {
            e.printStackTrace();
            responseBean.setFlag(Boolean.FALSE);
            responseBean.setErrorMessage(e.getMessage());

        }
        catch (Exception e) {
            e.printStackTrace();
            responseBean.setFlag(Boolean.FALSE);
            responseBean.setErrorMessage("服务器异常");

        }

        //将展示在客户端(浏览器)的数据(Java对象)转换为JSON字符串
        String responseJSONString = JSON.toJSONString(responseBean);
        System.out.println("【客户端异步请求校验用户名】服务端响应给客户端的JSON字符串是"+responseJSONString);
        response.getWriter().write(responseJSONString);



    }

    /**
     * 校验用户名
     * @param name
     * @return
     */
    public String validation(String name){
        String errorMessage=null;
        if (null==name||name==""){
            errorMessage="用户名不能为空";
        }
        return errorMessage;
    }

}
