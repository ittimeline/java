package net.ittimeline.java.foundational.oop;

/**
 * private关键字的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/16 14:14
 * @since JDK11
 */
public class PrivateTest {

    public static void main(String[] args) {
        //创建手机类的对象
        Cellphone iphone12=new Cellphone();
        System.out.println("手机的默认重量是"+iphone12.getWeight());

        iphone12.showCellphoneInfo();

    }
}
