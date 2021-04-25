package net.ittimeline.java.foundational.method;

/**
 * 方法重载的测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/12 15:12
 * @since JDK11
 */
public class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading.compare(100L,100L);
        MethodOverloading.compare(100,100);
        MethodOverloading.compare(true,false);
    }
}
