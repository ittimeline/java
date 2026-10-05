package net.ittimeline.java.core.foundational.operator.ternary;

import java.util.Scanner;

/**
 * 三元运算符案例4-判断奇偶数
 * 需求：用户从键盘输入一个整数，判断是奇数还是偶数
 * 分析：① 提示用户输入一个整数 ②判断奇偶数， 整数对2求余数，余数是0表示偶数，否则就是奇数
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 14:41
 * @since Java 25
 */
public class JudgeEvenOdd {
    static void main() {
        System.out.println("请输入一个整数");
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = number % 2 == 0 ? number + "是偶数" : number + "是奇数";
        System.out.println(result);
        //关闭Scanner
        scanner.close();
    }
}
