package net.ittimeline.java.foundational.oop.abstracts.template;

/**
 * 网上买东西
 * @author tony 18601767221@163.com
 * @version 2021/4/19 15:29
 * @since JDK11
 */
public abstract  class AbstractShoppingTemplate {

    /**
     * 买东西
     * 
     */
    public void shopping(){
        register();
        login();
        search();
        addShoppingCart();
        pay();
        commitOrder();
    }


    /**
     * 注册
     */
    protected  abstract  void register();

    /**
     * 实名认证
     * 通用功能
     */
    protected void realName(){
        System.out.println("你的实名认证已经通过");
    }

    /**
     * 登录
     */
    protected  abstract  void login();


    /**
     * 搜索商品
     */
    protected  abstract  void search();


    /**
     * 添加到购物车
     */
    protected  abstract  void addShoppingCart();


    /**
     *  支付
     */
    protected  abstract  void pay();



    /**
     *  提交订单
     */
    protected  abstract  void commitOrder();




}
