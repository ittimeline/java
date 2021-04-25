package net.ittimeline.java.foundational.oop.permission.service;


/**
 * 通用的用户服务
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/19 7:52
 * @since JDK11
 */
public class CommonUserService {




    /**
     * 用户登录
     */
     void login(){
        System.out.println("欢迎登陆淘宝网");
        statistics();
}

    /**
     * 统计用户登录信息
     */
    private void statistics(){
        System.out.println("统计当前登录用户的登录信息  IP，地址，次数，PC/App");
    }


    /**
     * 用户注册
     * 继承访问权限
     */
    protected void register(){
        System.out.println("欢迎注册淘宝网");
    }



}
