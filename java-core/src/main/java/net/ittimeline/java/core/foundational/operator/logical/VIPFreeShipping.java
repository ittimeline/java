package net.ittimeline.java.core.foundational.operator.logical;

import java.util.Scanner;

/**
 * 逻辑运算符案例1-VIP客户免运费
 * 需求：如果是VIP客户或购物车总金额超过100或有免运费优惠券，则免运费
 * 分析：VIP客户、购物车总金额超过100、有免运费优惠券三个条件是或者的关系
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 14:44
 * @since Java 25
 */
public class VIPFreeShipping {
    static void main() {

        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("是否是VIP");
        boolean isVIP = scanner.nextBoolean();

        System.out.println("请输入购物车总金额");
        double cartTotal = scanner.nextDouble();

        System.out.println("是否有免运费优惠券");
        boolean hasFreeShippingCoupon = scanner.nextBoolean();

        String result = isVIP || cartTotal > 100.0 || hasFreeShippingCoupon
                ? "您享受免运费服务" : "您不享受免运费服务";
        System.out.println(result);
        //关闭Scanner
        scanner.close();
    }
}
