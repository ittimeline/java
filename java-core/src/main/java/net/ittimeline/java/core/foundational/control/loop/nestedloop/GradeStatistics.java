package net.ittimeline.java.core.foundational.control.loop.nestedloop;

import java.util.Scanner;

/**
 * 嵌套循环案例8-统计学校班级成绩
 * 需求：学校某年级有若干个班级，每个班级有若干名学生，学生的分数由用户从键盘输入。程序需要统计并输出：
 * 1. 每个班级的平均分、及格人数（分数 ≥ 60）、最高分
 * 2. 全年级的平均分、及格人数、最高分
 * 分析
 * ● 每个班级的平均分 = 该班级总分 / 该班级人数
 * ● 全年级平均分 = 全年级总分 / 全年级总人数
 * ● 及格人数：遍历所有学生，统计分数 ≥ 60 的人数
 * ● 最高分：遍历所有学生，找出分数最大值
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:46
 * @since Java 25
 */
public class GradeStatistics {
    static void main() {
        //创建Scanner对象
        //System.in 标准输入 也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        // 全年级汇总数据
        int gradeTotalScore = 0;        // 全年级总分
        int gradeTotalStudentCount = 0; // 全年级总人数
        int gradeTotalPassedCount = 0;  // 全年级及格人数
        int gradeMaxScore = 0;          // 全年级最高分

        System.out.print("请输入班级数量: ");
        int classCount = scanner.nextInt();

        // 外层循环：遍历每个班级
        for (int classIndex = 1; classIndex <= classCount; classIndex++) {
            System.out.printf("请输入第 %d 个班级的学生数量: ", classIndex);
            int studentCount = scanner.nextInt();
            gradeTotalStudentCount += studentCount;

            // 当前班级的数据
            int classTotalScore = 0;       // 班级总分
            int classPassedCount = 0;      // 班级及格人数
            int classMaxScore = 0;         // 班级最高分

            // 内层循环：遍历班级内的每个学生
            for (int studentIndex = 1; studentIndex <= studentCount; studentIndex++) {
                System.out.printf("请输入第 %d 个班级的第 %d 个学生的成绩: ", classIndex, studentIndex);
                int score = scanner.nextInt();

                // 分数合法性校验
                while (score < 0 || score > 100) {
                    System.out.printf("成绩不合法，请输入 0~100 之间的分数。请重新输入第 %d 个班级的第 %d 个学生的成绩: ",
                            classIndex, studentIndex);
                    score = scanner.nextInt();
                }

                // 累加班级总分和全年级总分
                classTotalScore += score;
                gradeTotalScore += score;

                // 统计班级及格人数和全年级及格人数
                if (score >= 60) {
                    classPassedCount++;
                    gradeTotalPassedCount++;
                }

                // 更新班级最高分
                if (score > classMaxScore) {
                    classMaxScore = score;
                }
                // 更新全年级最高分
                if (score > gradeMaxScore) {
                    gradeMaxScore = score;
                }
            }
            // 计算班级平均分
            double classAvgScore = (double) classTotalScore / studentCount;
            // 计算并输出当前班级的统计信息
            System.out.printf("第 %d 个班级 -> 平均分: %.2f, 及格人数: %d, 最高分: %d%n",
                    classIndex, classAvgScore, classPassedCount, classMaxScore);
            System.out.println(); // 空行分隔班级
        }

        // 计算全年级平均分
        double gradeAvgScore = (double) gradeTotalScore / gradeTotalStudentCount;
        System.out.println("========== 全年级汇总 ==========");
        System.out.printf("全年级平均分: %.2f%n", gradeAvgScore);
        System.out.printf("全年级及格人数: %d%n", gradeTotalPassedCount);
        System.out.printf("全年级最高分: %d%n", gradeMaxScore);

        //关闭Scanner
        scanner.close();
    }
}
