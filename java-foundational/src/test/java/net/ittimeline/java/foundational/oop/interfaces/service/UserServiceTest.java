package net.ittimeline.java.foundational.oop.interfaces.service;

import net.ittimeline.java.foundational.oop.interfaces.service.impl.AndroidUserServiceImpl;
import net.ittimeline.java.foundational.oop.interfaces.service.impl.PCUserServiceImpl;

/**
 * 用户服务接口测试用例
 * @author tony 18601767221@163.com
 * @version 2021/4/20 17:21
 * @since JDK11
 */
public class UserServiceTest {

    public static void main(String[] args) {
       // System.out.println("当前的网站名称是"+UserService.WEB_SITE_NAME);
        PCUserServiceImpl pcUserService=new PCUserServiceImpl();
      //  pcUserService.login();

        pcUserService.resetPassword();

        UserService.statistics();


        UserService userService=new PCUserServiceImpl();
        userService.login();

        userService=new AndroidUserServiceImpl();
        userService.login();


        if(userService instanceof AndroidUserServiceImpl){
            AndroidUserServiceImpl androidUserService=(AndroidUserServiceImpl) userService;
            System.out.println(androidUserService.getDeviceInfo());
        }












    }
}
