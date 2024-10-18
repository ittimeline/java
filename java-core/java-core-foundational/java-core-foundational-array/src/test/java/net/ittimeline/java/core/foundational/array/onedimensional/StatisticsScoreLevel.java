package net.ittimeline.java.core.foundational.array.onedimensional;

import java.util.Scanner;

/**
 * 统计学生成绩等级
 * 需求：提示从键盘输入指定人数的学生成绩，然后找出最高分，并输出学生成绩等级
 * 成绩>=最高分-10 等级为'A'
 * 成绩>=最高分-20 等级为'B'
 * 成绩>=最高分-30 等级为'C'
 * 其余 等级为'D'
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 10:11
 * @since Java21
 */
public class StatisticsScoreLevel {
    public static void main(String[] args) {
        //① 创建Scanner对象、根据学生人数动态创建数组
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生人数");
        int count = scanner.nextInt();
        //动态初始化数组存储学生成绩
        int[] scores = new int[count];
        //假设第一个学生成绩是最高分
        int max = scores[0];
        //② 接收键盘输入的成绩，存储在scores数组中，并求最高分
        System.out.println("请输入" + count + "个学生成绩");
        for (int i = 0; i < count; i++) {
            int score = scanner.nextInt();
            scores[i] = score;

            if (scores[i] > max) {
                max = scores[i];
            }
        }

        System.out.println("最高分是" + max);

        //③ 根据成绩与最高分差值计算等级并打印输出
        String grade;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max - 10) {
                grade = "A";
            } else if (scores[i] > max - 20) {
                grade = "B";
            } else if (scores[i] > max - 30) {
                grade = "C";
            } else {
                grade = "D";
            }
            System.out.printf("student %d is %d grade is %S \n", i, scores[i], grade);
        }

        //关闭Scanner
        scanner.close();
    }
}
