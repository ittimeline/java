package net.ittimeline.java.web.foundational.service;

import net.ittimeline.java.web.foundational.entity.User;
import net.ittimeline.java.web.foundational.service.impl.UserServiceImpl;
import org.testng.annotations.Test;

/**
 * 用户业务逻辑测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/3 17:26
 * @since JDK11
 */

public class UserServiceTest {

    UserService userService=new UserServiceImpl();

    @Test
    public void testLogin(){
        String name =null;
        String password=null;
        User user =new User();
        user.setName(name);
        user.setPassword(password);
        boolean loginResult = userService.login(user);
        System.out.println(loginResult==true?"登录成功":"登录失败");
    }
}
