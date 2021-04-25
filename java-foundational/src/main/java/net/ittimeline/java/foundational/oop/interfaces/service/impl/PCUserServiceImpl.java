package net.ittimeline.java.foundational.oop.interfaces.service.impl;

import net.ittimeline.java.foundational.oop.interfaces.service.CommonUserService;
import net.ittimeline.java.foundational.oop.interfaces.service.UserService;

/**
 *  PC端用户服务接口实现
 * @author tony 18601767221@163.com
 * @version 2021/4/20 17:16
 * @since JDK11
 */
public class PCUserServiceImpl  extends CommonUserService implements UserService {
    @Override
    public void login() {
        securityService.securityCheck();
        System.out.println("PC用户登录成功");
    }

    @Override
    public void resetPassword() {
        System.out.println("你的密码重置成功");
    }

    @Override
    public void register() {
        //组合+继承一起使用
        getSecurityService().securityCheck();
        boolean result=getValidationService().validation("jack");
        if(result){
            System.out.println("PC用户注册成功");

        }else{
            System.out.println("PC用户注册失败");
        }
    }
}
