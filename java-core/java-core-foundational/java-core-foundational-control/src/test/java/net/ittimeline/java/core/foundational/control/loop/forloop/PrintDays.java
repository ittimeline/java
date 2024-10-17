package net.ittimeline.java.core.foundational.control.loop.forloop;

import java.util.Scanner;

/**
 * 打印指定年份每个月的天数以及总天数
 * 需求：打印指定年份每个月的天数以及总天数
 * 分析：
 * 1,3,5,7,8,10,12 31天
 * 4,6,9,11 30天
 * 2 平年28天 闰年29天
 * 闰年条件1：年份可以被4整除，但是不可以被100整除
 * 闰年条件2：年份可以被400整除
 * 闰年满足条件1或者条件2即可
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 18:36
 * @since Java21
 */
public class PrintDays {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = scanner.nextInt();
        //平年28天 闰年29天
        int february = 28;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            february = 29;
        }

        //一年的总天数
        int totalDays = 0;
        //每个月的天数
        int dayOfMonth = 0;
        //一年有12个月
        for (int i = 1; i <= 12; i++) {
            // 1,3,5,7,8,10,12 31天
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                dayOfMonth = 31;
            }
            // 4,6,9,11 30天
            else if (i == 4 || i == 6 || i == 9 || i == 11) {
                dayOfMonth = 30;
            } else {
                dayOfMonth = february;
            }
            System.out.printf("%d月有%d天\n", i, dayOfMonth);
            totalDays += dayOfMonth;
        }
        System.out.printf("%d年一共有%d天\n", year, totalDays);
        //关闭Scanner
        scanner.close();
    }
}
