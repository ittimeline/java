package net.ittimeline.java.foundational.oop;

/**
 * 对象的创建和使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/15 9:29
 * @since JDK11
 */
public class ObjectCreateUseTest {

    public static void main(String[] args) {
        //创建手机类的对象
        Cellphone iphone12=new Cellphone();

        System.out.println(iphone12);
        //访问手机类的成员变量
        System.out.println("iphone12的默认型号"+iphone12.model);

        //给对象的成员变量赋值
        iphone12.model="iphone12";
        iphone12.brand="苹果";
        iphone12.price=6999;
        iphone12.color="黑色";

        System.out.println("iphone12的价格是"+iphone12.price+"iphone12的颜色是"+iphone12.color+"iphone12的型号是"+iphone12.model);

        //访问手机类的成员方法

        long number=18601767221L;
        iphone12.call(number);

        iphone12.sendMessage(number,"跟光磊学Java");


        Cellphone mate40=new Cellphone();

        System.out.println(mate40);

        //给成员变量赋值
        mate40.model="华为mate40";
        mate40.brand="华为";
        mate40.price=5999;
        mate40.color="黑色";

        //调用对象的成员方法
        mate40.call(number);
        mate40.sendMessage(number,"跟光磊学Java");


        //两个变量指向同一个Cellphone对象
        Cellphone mate40Copy=mate40;

        System.out.println("mate40的内存地址"+mate40);
        System.out.println("mate40Copy的内存地址"+mate40Copy);
        System.out.println("mate40Copy的型号是"+mate40Copy.model);

        mate40Copy.price=7999;
        System.out.println("mate40的价格"+mate40.price);










    }
}
