package net.ittimeline.java.core.foundational.control.branch.ifelsestatment;

import java.util.Scanner;

/**
 * 双分支结构if else语句案例2-商品付款
 * 需求：假设用户在苹果官网实际购买商品的金额为17999，键盘输入一个整数表示用户实际支付金额，
 * 如果等于17999表示付款成功，否则付款失败。
 * 分析：① 输入金额  ②判断输入的金额是否等于17999
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 11:36
 * @since Java 25
 */
public class Payment {

    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        //商品金额
        int targetAmount = 17999;
        System.out.println("请输入付款的金额");
        int inputAmount = scanner.nextInt();
        //判断用户输入的金额和商品金额是否相等
        if (inputAmount == targetAmount) {
            System.out.println("付款成功");
        } else {
            System.out.println("付款失败");
        }

        //关闭Scanner
        scanner.close();
    }

}
