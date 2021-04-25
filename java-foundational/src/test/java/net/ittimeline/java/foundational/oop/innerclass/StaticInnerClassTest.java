package net.ittimeline.java.foundational.oop.innerclass;

/**
 * 静态内部类测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/23 16:54
 * @since JDK11
 */
public class StaticInnerClassTest {

    public static void main(String[] args) {
        //创建静态内部类的对象
        StaticInnerClass.InnerClass innerClass=new StaticInnerClass.InnerClass();
        //调用静态内部类对象的方法
        innerClass.showStaticMemberInfo(30);
    }
}
