package net.ittimeline.java.foundational.oop;

/**
 * 构造器的使用测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/16 10:26
 * @since JDK11
 */
public class ConstructorTest {

    public static void main(String[] args) {

        //无参构造器调用
        Cellphone noArgs=new Cellphone();
        System.out.println("无参数参构造器赋值的结果: 手机型号"+noArgs.model+"手机品牌:"+noArgs.brand+"手机价格:"+noArgs.price+"手机颜色:"+noArgs.color);


        //有参构造器调用
        Cellphone oneArgs=new Cellphone("小米11 Ultra");
        System.out.println("Cellphone对象的model属性值是"+oneArgs.model);

        //全参构造器
        Cellphone fullArgs=new Cellphone("小米11 Ultra","小米",6999,"黑色");

        System.out.println("全参构造器赋值的结果: 手机型号"+fullArgs.model+"手机品牌:"+fullArgs.brand+"手机价格:"+fullArgs.price+"手机颜色:"+fullArgs.color);



    }
}
