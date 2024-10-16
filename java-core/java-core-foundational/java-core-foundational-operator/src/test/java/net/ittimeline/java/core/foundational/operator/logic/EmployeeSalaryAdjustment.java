package net.ittimeline.java.core.foundational.operator.logic;

import java.util.Scanner;

/**
 * 员工薪资调整
 * 需求：公司规定，如果员工的工作年限超过5年并且上一年度的评价等级为"A"，则基本薪资增加10%；
 * 如果工作年限超过3年但不足5年，且评价等级为"B"或以上，则基本薪资增加5%，求调整后的薪资。
 * 分析：
 * ● ① 工作年限超过5年  ②年度评价等级等于"A" ，调整后的薪资=基本薪资*1.1
 * ● ① 工作年限超过3年但不足5年 ②年度评价等级大于等于“B”，调整后的薪资=基本薪资*1.05
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 19:33
 * @since Java21
 */
public class EmployeeSalaryAdjustment {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入你的工作年限");
        int yearOfService = scanner.nextInt();

        System.out.println("请输入你评价等级");
        char performanceRating = scanner.next().charAt(0);
        //请输入你的基础工资
        System.out.println("请输入你的基础工资");
        double baseSalary = scanner.nextDouble();

        double adjustmentRate;
        //公司规定，如果员工的工作年限超过5年并且上一年度的评价等级为"A"，则基本薪资增加10%；
        //如果工作年限超过3年但不足5年，且评价等级为"B"或以上，则基本薪资增加5%。
        adjustmentRate = yearOfService > 5 && performanceRating == 'A'
                ? 0.10 : yearOfService > 3 && (performanceRating == 'B' || performanceRating == 'A') ? 0.05 : 0.0;
        double adjustmentSalary = baseSalary * (1 + adjustmentRate);
        System.out.printf("根据服务年限和绩效，调整后的薪资为：%.2f元\n", adjustmentSalary);
        //关闭扫描器
        scanner.close();
    }
}
