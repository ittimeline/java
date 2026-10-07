package net.ittimeline.java.core.foundational.control.branch.switchstatement;

import java.util.Scanner;

/**
 * 分支结构switch语句案例1-根据月份获取季节
 * 需求：提示用户从键盘输入月份，然后根据月份获取季节
 * 分析：
 * ● 3月，4月，5月是春季
 * ● 6月，7月，8月是夏季
 * ● 9月，10月，11月是秋季
 * ● 12月，1月，2月是冬季
 * @author tony 18601767221@163.com
 * @version 2026/10/7 13:36
 * @since Java 25
 */
public class Java17GetSeasonByMonth {

    static void main() {
        //创建Scanner对象
        //System.in 标准输入 也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("月份输入非法");
            return;
        }
        switch (month) {
            case 3, 4, 5 -> System.out.printf("%d月份是春季", month);
            case 6, 7, 8 -> System.out.printf("%d月份是夏季", month);
            case 9, 10, 11 -> System.out.printf("%d月份是秋季", month);
            case 12, 1, 2 -> System.out.printf("%d月份是冬季", month);
            default -> System.out.println("你的输入有误");
        }


        //关闭Scanner
        scanner.close();
    }
}
