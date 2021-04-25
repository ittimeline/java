package net.ittimeline.java.foundational.oop.initialization;

/**
 * 类的成员初始化顺序的测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/24 14:58
 * @since JDK11
 */
public class ClassMemberInitializationOrderTest {
    public static void main(String[] args) {

        new SubClass();

        //初始化子类的内部类对象
        SubClass.InnerClass innerClass= new SubClass.InnerClass();

    }
}
