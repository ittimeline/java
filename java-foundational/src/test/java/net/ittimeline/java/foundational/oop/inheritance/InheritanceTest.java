package net.ittimeline.java.foundational.oop.inheritance;

/**
 * 继承的测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/17 16:41
 * @since JDK11
 */
public class InheritanceTest {

    public static void main(String[] args) {

        //调用了父类的无参构造器
        SmartPhone smartPhone=new SmartPhone();
        smartPhone.call(18601767221L);

        SmartPhone smartPhoneModel=new SmartPhone("iphone12");
        System.out.println("手机型号:"+smartPhoneModel.getModel());

        smartPhoneModel.playVideo(smartPhoneModel.getModel());

    }
}
