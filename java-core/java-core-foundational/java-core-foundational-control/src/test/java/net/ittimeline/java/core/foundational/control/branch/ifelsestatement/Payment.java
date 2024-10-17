package net.ittimeline.java.core.foundational.control.branch.ifelsestatement;

import java.util.Scanner;

/**
 * 商品付款
 * 需求：假设用户在超市实际购买商品总价为13999元，键盘输入一个整数表示用户实际支付金额，如果等于13399表示付款成功，否则付款失败
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 9:49
 * @since Java21
 */
public class Payment {
    public static void main(String[] args) {
        //应付金额13999
        int amountsPayable = 13999;
        //创建Scanner对象
        //System.in 标准输入 也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入实际付款金额");
        int actuallyPaymentAmount = scanner.nextInt();

        if (actuallyPaymentAmount == amountsPayable) {
            System.out.println("付款成功");
        } else {
            System.out.println("付款失败");
        }
        //关闭Scanner
        scanner.close();
    }
}
