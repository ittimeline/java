package net.ittimeline.java.core.foundational.operator.ternary;

import java.util.Scanner;

/**
 * 判断奇偶数
 * 需求：用户从键盘输入一个整数，判断是奇数还是偶数
 * 分析：整数对2求余数，余数是0表示偶数，否则就是奇数
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 15:03
 * @since Java21
 */
public class JudgeEvenOdd {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = scanner.nextInt();
        String result = number % 2 == 0 ? number + "是偶数" : number + "是奇数";
        System.out.println(result);
        //关闭扫描器
        scanner.close();
    }
}
