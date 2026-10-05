package net.ittimeline.java.core.foundational.operator.arithmetic;

import java.util.Scanner;

/**
 * 算术运算符案例6-秒数换算
 * 需求：根据用户输入的秒数换算成对应的时分秒，假设用户输入的秒数是3800秒，3800秒换算成时间是1小时3分20秒
 * 分析：用户输入的秒数如何换算小时、分钟、秒数？
 * 小时 = 用户输入的秒数 / 3600
 * 分钟 = 用户输入的秒数 % 3600 / 60
 * 秒钟 = 用户输入的秒数 % 60
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 14:33
 * @since Java 25
 */
public class SecondConversionTime {
    static void main() {
        System.out.println("请输入秒数");
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        //读取用户从键盘输入的秒数并且赋值给inputSecond
        int inputSecond = scanner.nextInt();
        //小时 = 用户输入的秒数 / 3600
        int hours = inputSecond / 3600;
        //分钟 = 用户输入的秒数 % 3600 / 60
        int minutes = inputSecond % 3600 / 60;
        //秒钟 = 用户输入的秒数 % 60
        int seconds = inputSecond % 60;
        System.out.printf("你输入的秒数是%d秒，转换成对应的时间是%d小时%d分钟%d秒\n",
                inputSecond, hours, minutes, seconds);
        //关闭Scanner
        scanner.close();
    }
}
