package net.ittimeline.java.api.lang.reflect;

/**
 *
 * 代理模式的被代理角色
 * 普通用户
 *
 * @author tony 18601767221@163.com
 * @version 2021/6/13 14:43
 * @since JDK11
 */

public class User implements Shopping{

    @Override
    public void buyCellphone() {
        System.out.println("普通用户:普通用户支付订单成功");

    }
}
