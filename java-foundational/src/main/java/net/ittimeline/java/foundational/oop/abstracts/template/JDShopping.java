package net.ittimeline.java.foundational.oop.abstracts.template;

/**
 * 京东购物
 * @author tony 18601767221@163.com
 * @version 2021/4/19 15:36
 * @since JDK11
 */
public class JDShopping  extends AbstractShoppingTemplate{

    @Override
    protected void register() {
        System.out.println("欢迎注册京东");
        super.realName();
    }

    @Override
    protected void login() {
        System.out.println("欢迎登录京东");

    }

    @Override
    protected void search() {
        System.out.println("京东用户搜索京东商品");

    }

    @Override
    protected void addShoppingCart() {
        System.out.println("京东用户添加商品到购物车");

    }

    @Override
    protected void pay() {
        System.out.println("京东用户使用京东支付");

    }

    @Override
    protected void commitOrder() {
        System.out.println("京东用户提交订单");

    }
}
