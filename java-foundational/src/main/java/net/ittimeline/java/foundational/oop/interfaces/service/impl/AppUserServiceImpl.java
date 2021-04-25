package net.ittimeline.java.foundational.oop.interfaces.service.impl;

import net.ittimeline.java.foundational.oop.interfaces.service.CommonUserService;
import net.ittimeline.java.foundational.oop.interfaces.service.LogService;
import net.ittimeline.java.foundational.oop.interfaces.service.UserService;

/**
 * app用户服务实现
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/21 8:28
 * @since JDK11
 */
public class AppUserServiceImpl extends CommonUserService implements UserService, LogService {
    @Override
    public void register() {
        log();
        System.out.println("app端用户注册成功");
    }

    @Override
    public void login() {
        log();
        System.out.println("app端用户登录成功");

    }



    @Override
    public void log() {
        System.out.println("记录App用户的操作日志成功...");
    }
}
