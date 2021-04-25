package net.ittimeline.java.foundational.oop.permission.service.impl;


/**
 * protected关键字的使用测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/19 8:04
 * @since JDK11
 */
public class ProtectedTest {

    public static void main(String[] args) {
        AppUserService appUserService=new AppUserService();
       // appUserService.login();
        appUserService.register();
    }
}
