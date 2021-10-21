package net.ittimeline.java.web.foundational.servlet;

import net.ittimeline.java.web.foundational.bean.vo.UserVO;
import net.ittimeline.java.web.foundational.service.UserService;
import net.ittimeline.java.web.foundational.service.impl.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

/**
 * 展示用户列表
 * @author tony 18601767221@163.com
 * @version 2021/7/21 11:13
 * @since JDK11
 */
@WebServlet("/user/list")
public class UserListServlet extends HttpServlet {
    /**
     * 组合Service
     */
    private UserService userService=new UserServiceImpl();






    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //调用UserService的获取所有用户的方法
        List<UserVO> userVOList = null;
        try {
            userVOList = userService.findAllUsers();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (userVOList!=null) {
            //将用户数据存储到request域对象
            request.setAttribute("userVOList",userVOList);
            //请求转发跳转到user_list.jsp
            request.getRequestDispatcher("/pages/user_list.jsp").forward(request,response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
