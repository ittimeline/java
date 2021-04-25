package net.ittimeline.java.foundational.oop.inheritance;

/**
 * Object类常用方法的测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/18 8:12
 * @since JDK11
 */
public class ObjectTest {


    public static void main(String[] args) {

        SmartPhone smartPhone=new SmartPhone("iphone12");
        smartPhone.setWirelessCharging(false);
        //System.out.println(smartPhone.toString());
        //打印对象或者是this会调用对象的toString()方法
        System.out.println(smartPhone);


        SmartPhone iphone12=new SmartPhone();
        iphone12.setModel("iphone12");
        iphone12.setWirelessCharging(true);
        boolean result =smartPhone.equals(iphone12);

        System.out.println("equals()方法的执行结果:"+result);



    }
}
