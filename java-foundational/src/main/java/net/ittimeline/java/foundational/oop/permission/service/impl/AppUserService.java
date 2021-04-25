package net.ittimeline.java.foundational.oop.permission.service.impl;

import net.ittimeline.java.foundational.oop.permission.service.CommonUserService;

/**
 * App端用户服务
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/19 8:03
 * @since JDK11
 */
public class AppUserService extends CommonUserService {


    @Override
    protected void register() {
        System.out.println("欢迎app用户注册淘宝网");
    }
}
