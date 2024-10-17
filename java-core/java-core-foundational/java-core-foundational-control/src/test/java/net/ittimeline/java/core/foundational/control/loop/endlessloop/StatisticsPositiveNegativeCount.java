package net.ittimeline.java.core.foundational.control.loop.endlessloop;

import java.util.Scanner;

/**
 * 统计正整数和负整数的个数
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 21:16
 * @since Java21
 */
public class StatisticsPositiveNegativeCount {
    public static void main(String[] args) {
        //正整数个数
        int positiveIntegerCount = 0;
        //负整数个数
        int negativeIntegerCount = 0;
        //创建Scanner对象
        //System.in 标准输入 也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个整数");
            int number = scanner.nextInt();
            if (number > 0) {
                positiveIntegerCount++;
            } else if (number < 0) {
                negativeIntegerCount++;
            } else {
                break;
            }
        }
        System.out.printf("你输入的 正整数的个数是%d 负整数的个数是%d\n",
                positiveIntegerCount, negativeIntegerCount);
        //关闭Scanner
        scanner.close();
    }
}
