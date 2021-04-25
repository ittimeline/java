package net.ittimeline.java.foundational.oop.abstracts.template;

/**
 * 淘宝购物
 * @author tony 18601767221@163.com
 * @version 2021/4/19 15:34
 * @since JDK11
 */
public class TaobaoShopping extends  AbstractShoppingTemplate{
    @Override
    protected void register() {
        System.out.println("欢迎注册淘宝");
        super.realName();
    }

    @Override
    protected void login() {
        System.out.println("欢迎登录淘宝");

    }

    @Override
    protected void search() {
        System.out.println("淘宝用户搜索淘宝商品");

    }

    @Override
    protected void addShoppingCart() {
        System.out.println("淘宝用户添加商品到购物车");

    }

    @Override
    protected void pay() {
        System.out.println("淘宝用户使用支付宝支付");

    }

    @Override
    protected void commitOrder() {
        System.out.println("淘宝用户提交订单");

    }
}
