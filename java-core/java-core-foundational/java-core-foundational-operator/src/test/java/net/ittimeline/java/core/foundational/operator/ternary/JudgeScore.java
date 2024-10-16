package net.ittimeline.java.core.foundational.operator.ternary;

import java.util.Scanner;

/**
 * 判断成绩
 * 需求：判断用户输入的成绩，如果小于六十不及格，否则及格
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 14:59
 * @since Java21
 */
public class JudgeScore {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的成绩");
        int score = scanner.nextInt();
        String result = score < 60 ? "成绩不及格" : "成绩及格";
        System.out.println(result);
        //关闭扫描器
        scanner.close();
    }
}
