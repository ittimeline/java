package net.ittimeline.java.foundational.oop.inheritance;

/**
 * 方法重写的测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/18 6:44
 * @since JDK11
 */
public class MethodOverrideTest {
    public static void main(String[] args) {
        //调用类父类的无参构造器
        SmartPhone smartPhone=new SmartPhone();
        smartPhone.sendMessage(18601767221L,"跟光磊学Java");
    }
}
