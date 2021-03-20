package net.ittimeline.java.foundational.control.whilestatement;

/**
 * while循环的死循环
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/17 21:48
 * @since JDK11
 */
public class WhileEndlessLoop {

    public static void main(String[] args) {

        while (true){
            System.out.println("我是一个while循环的死循环");
        }
    }
}
