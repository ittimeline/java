package net.ittimeline.java.foundational.control.forstatement;

/**
 * for循环的死循环
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/17 21:45
 * @since JDK11
 */
public class ForEndlessLoop {

    public static void main(String[] args) {

        for (;;) {
            System.out.println("我是一个for循环死循环");
        }
    }
}
