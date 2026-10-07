package net.ittimeline.java.core.foundational.control.loop.infiniteloop;

import java.util.Scanner;

/**
 * 死循环案例1-统计整数
 * 需求： 提示用户从键盘输入整数，然后统计正整数和负整数的个数，用户输入0就退出
 * 分析：正整数就是大于0的数，负整数就是小于0的数，统计使用计数器
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:36
 * @since Java 25
 */
public class CountPositiveNegative {
    static void main() {
        //创建Scanner对象
        //System.in 标准输入 也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);


        //正整数的个数
        int positiveIntegerCount = 0;
        //负整数的个数
        int negativgeIntegerCount = 0;

        while (true) {
            System.out.println("请输入一个整数");
            int number = scanner.nextInt();
            if (number > 0) {
                positiveIntegerCount++;
            } else if (number < 0) {
                negativgeIntegerCount++;
            } else {
                break;
            }
        }
        System.out.printf("你输入的 正整数的个数是%d个 负整数的个数是%d个\n", positiveIntegerCount, negativgeIntegerCount);


        //关闭Scanner
        scanner.close();
    }
}
