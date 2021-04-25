package net.ittimeline.java.foundational.oop.enums;

import net.ittimeline.java.foundational.oop.interfaces.service.UserService;
import net.ittimeline.java.foundational.oop.interfaces.service.impl.AndroidUserServiceImpl;
import net.ittimeline.java.foundational.oop.interfaces.service.impl.IOSUserServiceImpl;
import net.ittimeline.java.foundational.oop.interfaces.service.impl.PCUserServiceImpl;

/**
 * 注册组件
 * @author tony 18601767221@163.com
 * @version 2021/4/25 8:03
 * @since JDK11
 */
public class RegisterSourceComponent {
    UserService userService;
    /**
     * 处理注册来源
     * @param registerSource
     */
    public  void handleRegisterSource(RegisterSource registerSource){
        switch (registerSource){
            case PC:
                userService=new PCUserServiceImpl();
                break;
            case ANDROID_APP:
                userService=new AndroidUserServiceImpl();
                break;
            case  IOS_APP:
                userService=new IOSUserServiceImpl();
                break;
            case UNKONWN:
                System.out.println("不明来源的注册渠道，本系统不处理");
                break;
        }
        userService.register();
    }


}
