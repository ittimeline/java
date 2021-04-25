package net.ittimeline.java.foundational.oop.inheritance;

/**
 * 类继承的内存机制
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/19 10:12
 * @since JDK11
 */
public class ClassInheritanceTest {

    public static void main(String[] args) {

        //创建子类对象
        SmartPhone smartPhone=new SmartPhone();
        smartPhone.setModel("iphone12");
        smartPhone.playVideo(smartPhone.getModel());
        smartPhone.sendMessage(18601767221L,"跟光磊学Java");
    }
}
