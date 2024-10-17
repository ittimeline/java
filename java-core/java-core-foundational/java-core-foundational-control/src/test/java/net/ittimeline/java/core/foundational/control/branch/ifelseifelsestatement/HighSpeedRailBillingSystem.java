package net.ittimeline.java.core.foundational.control.branch.ifelseifelsestatement;

import java.util.Scanner;

/**
 * 高铁计费系统
 * 需求：实现根据用户输入的身份计算高铁票的价格，输出他的身份以及高铁票的价格
 * 高铁票的价格计算规则
 * ● 原价 580
 * ● 军人免费
 * ● 学生半价
 * ● 其他人原价
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 10:10
 * @since Java21
 */
public class HighSpeedRailBillingSystem {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in 标准输入 也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的身份：（1 军人 2 学生 3 普通人）");
        int identity = scanner.nextInt();
        //票价
        double basePrice = 580.0;
        //根据不同的身份计算后的实际票价
        double actualPrice;
        //军人票价
        if (identity == 1) {
            actualPrice = basePrice * 0;
        }
        //学生票价
        else if (identity == 2) {
            actualPrice = basePrice * 0.5;
        } else {
            actualPrice = basePrice;
        }
        String identityStr = identity == 1 ? "军人" : identity == 2 ? "军人" : "普通人";
        System.out.println("你的身份是" + identityStr);
        System.out.println("高铁票的价格是" + actualPrice);
        //关闭Scanner
        scanner.close();
    }
}
