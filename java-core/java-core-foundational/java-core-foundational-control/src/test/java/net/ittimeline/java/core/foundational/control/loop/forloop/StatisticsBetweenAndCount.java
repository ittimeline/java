package net.ittimeline.java.core.foundational.control.loop.forloop;

import java.util.Scanner;

/**
 * 统计满足条件的数字
 * 需求：键盘输入两个数字表示一个范围，统计该范围中既能被3整除又能被5整除数字的数量
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 18:12
 * @since Java21
 */
public class StatisticsBetweenAndCount {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入开始的数字");
        int startNumber = scanner.nextInt();
        System.out.println("请输入结束的数字");
        int endNumber = scanner.nextInt();
        int count = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
            }
        }
        System.out.printf("%d到%d之间既能被3整除又能被5整除数字的数量是%d", startNumber, endNumber, count);
        //关闭Scanner
        scanner.close();
    }
}
