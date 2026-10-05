package net.ittimeline.java.core.foundational.operator.arithmetic;

import java.util.Scanner;

/**
 * 算术运算符案例1-数值拆分
 * 需求：键盘输入一个三位整数，将其拆分为个位、十位、百位后，打印输出
 * 分析：如何获取个位、十位、百位甚至是千位、万位
 * 获取个位、十位、百位甚至是千位、万位的方法
 * 个位：数值 / 1 % 10
 * 十位：数值 / 10 % 10
 * 百位：数值 / 100 % 10
 * 千位：数值 / 1000 % 10
 * 万位：数值 / 10000 % 10
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 14:30
 * @since Java 25
 */
public class NumericalSplit {

    static void main() {
        //提示用户从键盘输入一个三位整数：大于等于100，小于1000的整数
        System.out.println("请输入一个三位整数：大于等于100，小于1000的整数");
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        //读取用户从键盘输入的整数并赋值给number变量
        int number = scanner.nextInt();
        //获取三位整数的个位、十位、百位
        int unit = number % 10;
        int decade = number / 10 % 10;
        int hundred = number / 100 % 10;
        System.out.printf("你输入的整数是%d\n其中个位数是%d,十位数是%d,百位数是%d\n",
                number, unit, decade, hundred);
        //关闭Scanner
        scanner.close();
    }
}
