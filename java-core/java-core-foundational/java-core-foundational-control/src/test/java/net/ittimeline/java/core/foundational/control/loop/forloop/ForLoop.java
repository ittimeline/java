package net.ittimeline.java.core.foundational.control.loop.forloop;

/**
 * for循环使用
 * 需求：使用for循环输出5个Hello World
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 15:56
 * @since Java21
 */
public class ForLoop {
    public static void main(String[] args) {
        System.out.println("1.不使用for循环实现输出5个Hello World");

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        System.out.println("2.使用for循环实现输出5个Hello World");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }
}
