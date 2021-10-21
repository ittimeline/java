package net.ittimeline.java.web.foundational.service;

import net.ittimeline.java.web.foundational.bean.vo.UserVO;
import net.ittimeline.java.web.foundational.bean.entity.User;
import net.ittimeline.java.web.foundational.service.impl.UserServiceImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * 用户业务逻辑测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/3 17:26
 * @since JDK11
 */

public class UserServiceTest {

    UserService userService = new UserServiceImpl();

    @Test
    public void testLogin() {
        String name = null;
        String password = null;
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        boolean loginResult = false;
        try {
            loginResult = userService.login(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(loginResult == true ? "登录成功" : "登录失败");

        name = "admin";
        password = "111111";
        user = new User();
        user.setName(name);
        user.setPassword(password);
        try {
            loginResult = userService.login(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(loginResult == true ? "登录成功" : "登录失败");
    }

    @Test
    public void testRegister() {

        User user = new User();
        user.setName("jessica");
        user.setPassword("123456");

        boolean register = false;
        try {
            register = userService.register(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(register ? "用户注册成功" : "用户注册失败");

    }

    /**
     * 测试获取所有用户
     */
    @Test
    public void testFindAllUsers() {

        List<UserVO> allUsers = null;
        try {
            allUsers = userService.findAllUsers();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //遍历从数据库中查询所有用户的信息
        for (UserVO user : allUsers) {
            System.out.println(user);
        }
    }

    @Test
    public void testFindByName() {
        try {
            boolean flag = userService.findByName("Tony_CTO");
            Assert.assertEquals(flag, false);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
