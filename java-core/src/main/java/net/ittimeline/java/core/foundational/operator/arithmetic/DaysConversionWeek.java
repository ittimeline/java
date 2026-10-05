package net.ittimeline.java.core.foundational.operator.arithmetic;

import java.util.Scanner;

/**
 * 算术运算符案例4：天数换算
 * 需求：根据用户输入的天数换算成星期数，例如用户输入59天是8个星期零3天
 * 分析：
 * 用户输入的天数 / 7 计算的结果就是星期数
 * 用户输入的天数 % 7计算的结果就是剩下的天数
 * ① 求星期数 59 / 7= 8
 * ② 求天数 59 % 7 = 3
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 14:32
 * @since Java 25
 */
public class DaysConversionWeek {
    static void main() {
        System.out.println("请输入天数");
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        //读取用户从键盘输入的天数并且赋值给days
        int days = scanner.nextInt();
        //天数换算为星期数（几周）
        int week = days / 7;
        //天数换算为星期数（几周）后剩下的天数
        int remainingDay = days % 7;
        System.out.printf("%d天转换为星期的结果是%d个星期零%d天\n", days, week, remainingDay);
        //关闭Scanner
        scanner.close();
    }
}
