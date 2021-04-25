package net.ittimeline.java.foundational.oop.innerclass;

/**
 * 静态内部类的单例模式测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/23 16:58
 * @since JDK11
 */
public class StaticInnerClassSingletonTest {

    public static void main(String[] args) {

        System.out.println(StaticInnerClassSingleton.getInstance());
        System.out.println(StaticInnerClassSingleton.getInstance());
        System.out.println(StaticInnerClassSingleton.getInstance());
        System.out.println(StaticInnerClassSingleton.getInstance());
        System.out.println(StaticInnerClassSingleton.getInstance());
        System.out.println(StaticInnerClassSingleton.getInstance());
    }
}
