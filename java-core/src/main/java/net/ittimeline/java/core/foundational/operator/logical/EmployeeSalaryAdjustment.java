package net.ittimeline.java.core.foundational.operator.logical;

import java.util.Scanner;

/**
 * 逻辑运算符案例2-员工薪资调整
 * 需求：公司规定，如果员工的工作年限超过5年并且上一年度的评价等级为"A"，则基本薪资增加10%；
 * 如果工作年限超过3年但不超过5年，且上一年度的评价等级为"B"或以上，则基本薪资增加5%，求调整后的薪资。
 * 分析：
 * ● 涨薪条件1 ① 工作年限超过5年 并且 ②上一年度的评价等级等于"A" ，调整后的薪资=基本薪资*1.1
 * ● 涨薪条件2 ① 工作年限超过3年但不超过5年 并且 ②上一年度的评价等级等于"A"或者"B"，调整后的薪资=基本薪资*1.05
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 14:45
 * @since Java 25
 */
public class EmployeeSalaryAdjustment {

    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入你的工作年限");
        int yearsOfService = scanner.nextInt();

        System.out.println("请输入你的评价等级");
        char performanceRating = scanner.next().charAt(0);

        System.out.println("请输入你的基础工资");
        double baseSalary = scanner.nextDouble();

        //计算调整比例
        // 需求：公司规定，如果员工的工作年限超过5年并且上一年度的评价等级为"A"，则基本薪资增加10%；
        // 如果工作年限超过3年但不超过5年，且上一年度的评价等级为"B"或以上，则基本薪资增加5%
        double adjustmentRate = yearsOfService > 5 && performanceRating == 'A' ? 0.10 :
                yearsOfService > 3 && yearsOfService <= 5 && (performanceRating == 'A' || performanceRating == 'B') ? 0.05 : 0.0;

        //计算调整后的薪资
        double adjustedSalary = baseSalary * (1 + adjustmentRate);
        System.out.printf("根据服务年限和绩效，调整后的薪资为：%.2f元\n", adjustedSalary);

        //关闭Scanner
        scanner.close();

    }
}
