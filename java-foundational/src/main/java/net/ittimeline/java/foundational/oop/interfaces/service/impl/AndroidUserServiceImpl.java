package net.ittimeline.java.foundational.oop.interfaces.service.impl;

/**
 * Android端用户服务实现
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/21 8:29
 * @since JDK11
 */
public class AndroidUserServiceImpl extends AppUserServiceImpl{

    @Override
    public void register() {
        System.out.println("Android app端用户注册成功");
    }

    @Override
    public void login() {
        System.out.println("Android app端用户登录成功");

    }


    public  String getDeviceInfo(){
        return "小米11Ultra";
    }
}
