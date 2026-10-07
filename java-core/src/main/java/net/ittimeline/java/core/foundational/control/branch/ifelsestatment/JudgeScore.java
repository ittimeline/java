package net.ittimeline.java.core.foundational.control.branch.ifelsestatment;

import java.util.Scanner;

/**
 * 双分支结构if else语句案例3-判断成绩
 * 需求：键盘输入一个成绩，判断成绩是否合法，如果合法，就判断成绩是否及格
 * 分析：①输入成绩 ②判断成绩是否合法 ③如果合法，就判断成绩是否及格，大于60分及格，否则不合格
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 11:54
 * @since Java 25
 */
public class JudgeScore {
    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入考试成绩");
        int score = scanner.nextInt();
        //成绩合法性校验
        if (score > 100 || score < 0) {
            System.out.println("考试成绩不合法");
            return;
        }
        if (score >= 60) {
            System.out.println("考试成绩及格");
        } else {
            System.out.println("考试成绩不合格");
        }

        //关闭Scanner
        scanner.close();
    }
}
