package net.ittimeline.java.core.foundational.control.loop.forloop;

/**
 * for循环案例2-打印输出1到100和100到1
 * 需求：控制台打印输出1到100和100到1，每行显示10个数字
 * 分析：
 * ● 打印 1 到 100 时，利用数字本身是 10 的倍数换行；
 * ● 打印 100 到 1 时，需要单独计数控制换行。
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:05
 * @since Java 25
 */
public class PrintNumbers {
    static void main() {
        System.out.println("******************1.打印1到100******************");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "\t");
            //每行显示10个数字
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println("******************2.打印100到1******************");
        int count = 0;
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + "\t");
            count++;
            //每行显示10个数字，最后一个数字不换行
            if (count % 10 == 0 && i != 1) {
                System.out.println();
            }

        }

    }
}
