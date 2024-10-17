package net.ittimeline.java.core.foundational.control.loop.forloop;

/**
 * 打印1到100和100到1
 * 需求：控制台打印输出1到100和100到1，每行显示10个数字
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 16:28
 * @since Java21
 */
public class Print1To100And100To1 {
    public static void main(String[] args) {
        System.out.println("******************1.打印1到100******************");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "\t");
            //每行显示10个数字
            if (i % 10 == 0) {
                System.out.println();
            }
        }

        //换行
        System.out.println();
        System.out.println("******************2.打印100到1******************");
        int count = 0;
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + "\t");
            count++;

            //每行显示10个数字
            if (count % 10 == 0) {
                System.out.println();
            }
        }

    }
}
