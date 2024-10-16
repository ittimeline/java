package net.ittimeline.java.core.foundational.operator.ternary;

import java.util.Scanner;

/**
 * 三元运算符使用
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 13:30
 * @since Java21
 */
public class TernaryOperator {
    public static void main(String[] args) {
        //求两个整数的最大值
        //创建Scanner对象
        //System.in表示标准输入，也就是从键盘输入
        Scanner scanner = new Scanner(System.in);

        //两个整数从键盘输入
        System.out.println("请输入第一个整数");
        int left = scanner.nextInt();
        System.out.println("请输入第二个整数");
        int right = scanner.nextInt();
        int max = left > right ? left : right;
        System.out.printf("%d和%d的最大值是%d\n", left, right, max);
        //关闭Scanner
        scanner.close();
    }
}
