package net.ittimeline.java.api.lang.reflect.proxy;

/**
 * 代理模式的代理角色
 * 买手
 *
 * @author tony 18601767221@163.com
 * @version 2021/6/13 14:43
 * @since JDK11
 */

public class Buyer implements Shopping{

    final User user;

    public Buyer(final User user){
        this.user=user;
    }

    @Override
    public void buyCellphone() {
        user.sendVerificationCode();
        System.out.println("买手:买手登录商城成功");
        System.out.println("买手:买手抢到了手机");
        user.buyCellphone();

    }
}
