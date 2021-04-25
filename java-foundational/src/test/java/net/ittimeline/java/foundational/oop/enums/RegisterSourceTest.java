package net.ittimeline.java.foundational.oop.enums;


/**
 * 枚举的案例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/25 7:58
 * @since JDK11
 */
public class RegisterSourceTest {



    public static void main(String[] args) {
        RegisterSourceComponent registerSourceComponent=new RegisterSourceComponent();
        registerSourceComponent.handleRegisterSource(RegisterSource.ANDROID_APP);
    }
}
