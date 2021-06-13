package net.ittimeline.java.api.lang.reflect;

/**
 * 代理模式的协议
 * 抢手机的接口
 *
 * @author tony 18601767221@163.com
 * @version 2021/6/13 14:42
 * @since JDK11
 */
public interface Shopping {

    /**
     * 买手机
     */
    void buyCellphone();

    /**
     * 发送验证码
     */
    default void sendVerificationCode(){
        System.out.println("普通用户:你的验证码是66666");
    }
}
