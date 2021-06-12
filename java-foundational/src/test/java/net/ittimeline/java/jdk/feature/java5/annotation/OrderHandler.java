package net.ittimeline.java.jdk.feature.java5.annotation;

/**
 *
 * @author tony 18601767221@163.com
 * @version 2021/6/12 20:32:18
 * @description
 * @since JDK11
 */

public class OrderHandler  {


    @Test
    public void register(){
        System.out.println("用户注册京东成功");

    }

    @Test
    public void login(){
        System.out.println("用户登录京东成功");

    }

    @Test
    public void broswer(){
        System.out.println("用户正在浏览商品");

    }

    @Test
    public void addShoppingCart(){
        System.out.println("用户添加商品到购物车");

    }
    @Test
    public void pay(){
        System.out.println("用户支付成功");

    }


    @Test
    public void commitOrder(){
        System.out.println("用户提交了订单");

    }
}
