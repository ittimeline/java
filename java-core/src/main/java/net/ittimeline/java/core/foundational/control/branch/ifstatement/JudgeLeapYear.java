package net.ittimeline.java.core.foundational.control.branch.ifstatement;

import java.util.Scanner;

/**
 * 单分支结构if语句案例4-闰年
 * 需求：键盘输入年份，判断年份是否为闰年
 * 分析：闰年按公历规则：能被400整除，或者能被4整除但不能被100整除
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 11:34
 * @since Java 25
 */
public class JudgeLeapYear {
    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = scanner.nextInt();

        // 闰年按公历规则：能被400整除，或者能被4整除但不能被100整除
        boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

        //等价于isLeap == true
        if (isLeap)
            System.out.println(year + " 是闰年");

        if (!isLeap)
            System.out.println(year + " 不是闰年");

        //关闭Scanner
        scanner.close();
    }
}
