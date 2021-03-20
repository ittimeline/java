package net.ittimeline.java.foundational.control.ifstatement;

import java.util.Scanner;

/**
 * 根据输入的分数来判断等级
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/16 19:37
 * @since JDK11
 */
public class IfElseIfElseStatementScoreAndGrade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入你的分数");

        //接收用户从键盘输入的分数
        int score = input.nextInt();

        //使用多分支来判断分数的等级

        if (score >= 90 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 80 && score <= 89) {
            System.out.println("良好");
        } else if (score >= 70 && score <= 79) {
            System.out.println("中等");
        } else if (score >= 60 && score <= 69) {
            System.out.println("及格");
        } else if (score >= 0 && score <= 59) {
            System.out.println("不及格");
        } else {
            System.out.println("你输入的成绩有误");
        }

    }
}
