package net.ittimeline.java.core.foundational.control.loop.nestedloop;

import java.util.Scanner;

/**
 * 统计学校班级成绩
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 22:03
 * @since Java21
 */
public class StatisticsClassScore {
    public static void main(String[] args) {
        //每个班级平均分
        int eachClassAvgScore = 0;
        //所有班级平均分
        int allClassAvgScore = 0;
        //所有班级及格人数
        int allClassPassedCount = 0;
        //所有班级最高分
        int allClassMaxScore = 0;

        //创建Scanner对象
        //System.in 标准输入 也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入班级数量");
        int classCount = scanner.nextInt();
        //所有班级总分
        int allClassSumScore = 0;
        //所有班级学生数量
        int allClassStudentCount = 0;
        //外层循环遍历每个班级 i表示班级数量
        for (int i = 1; i <= classCount; i++) {
            System.out.printf("请输入第%d个班级的学生数量\n", i);
            int studentCount = scanner.nextInt();
            allClassStudentCount += studentCount;
            //每个班级的总分
            int eachClassSumScore = 0;
            //内层循环遍历每个班级所有学生 j表示学生数量
            for (int j = 1; j <= studentCount; j++) {
                System.out.printf("请输入第%d个班级的第%d个学生的成绩\n", i, j);
                int score = scanner.nextInt();
                eachClassSumScore += score;
                //所有班级的及格人数就是统计所有班级学生的分数大于等于60分
                allClassSumScore += score;
                if (score >= 60) {
                    allClassPassedCount++;
                }
                //所有班级的最高分就是所有班级学生分数最大的
                if (score > allClassMaxScore) {
                    allClassMaxScore = score;
                }
            }
            //每个班级平均分=每个班级的总分/每个班级的人数
            eachClassAvgScore = eachClassSumScore / studentCount;
            System.out.printf("第%d个班级的平均分是%d\n", i, eachClassAvgScore);
        }
        //所有班级平均分=所有班级的总分/所有班级的人数
        allClassAvgScore = allClassSumScore / allClassStudentCount;

        //汇总结果
        System.out.println("每个班级的平均分是" + eachClassAvgScore);
        System.out.println("所有班级的平均分是" + allClassAvgScore);
        System.out.println("所有班级的及格人数是" + allClassPassedCount);
        System.out.println("所有班级的最高分是" + allClassMaxScore);
        //关闭Scanner
        scanner.close();
    }
}
