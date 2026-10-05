package net.ittimeline.java.core.foundational.operator.ternary;

import java.util.Scanner;

/**
 * 三元运算符案例3-判断成绩
 * 需求：判断用户输入的成绩，如果小于六十不及格，否则及格
 * 分析：① 提示用户输入成绩  ②判断成绩
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 14:40
 * @since Java 25
 */
public class JudgeScore {
    static void main() {
        System.out.println("请输入你的成绩");
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        String result = score >= 60 ? "分数大于等于60，成绩及格" : "分数小于60，成绩不及格";
        System.out.println(result);
        //关闭Scanner
        scanner.close();
    }
}
