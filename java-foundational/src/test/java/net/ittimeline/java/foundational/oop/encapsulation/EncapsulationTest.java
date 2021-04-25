package net.ittimeline.java.foundational.oop.encapsulation;

/**
 * 属性封装的测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/16 14:28
 * @since JDK11
 */
public class EncapsulationTest {

    public static void main(String[] args) {
        //创建手机类的对象
        Cellphone cellphone=new Cellphone();

        //访问对象的成员变量

        cellphone.setModel("三星S21 Ultra");

        System.out.println("手机的型号是"+cellphone.getModel());

        cellphone.setModel("小米11 Ultra");

        System.out.println("手机的型号是"+cellphone.getModel());

        cellphone.setPrice(-6999);
        System.out.println("手机的价格是"+cellphone.getPrice());


        net.ittimeline.java.foundational.oop.Cellphone oop =new net.ittimeline.java.foundational.oop.Cellphone();


    }
}
