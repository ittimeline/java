package net.ittimeline.java.core.foundational.control.branch.ifelseifelsestatement;

import java.util.Scanner;

/**
 * 出租车计费系统
 * 需求：实现出租车计费系统
 * 出租车的计费方式：里程费用和等待时间费用
 * ● 里程费用
 * 1. 不超过3公里 21元
 * 2. 超过3公里但是不超过15公里 每公里2元
 * 3. 超过15公里 每公里3元
 * ● 等待时间费用
 * a. 每等待150秒(2分半钟)收费1元
 * b. 不超过150秒不收钱
 * 为了考虑程序的灵活性,里程数和等待时间的秒数都是由用户从键盘输入的。
 * <p>
 * <p>
 * 分析：假如里程数是16公里,等待时间是299秒,那么应该如何计算打车费,打车费用是49
 * 里程费用
 * 1. 不超过3公里：21元
 * 2. 超过3公里但是不超过15公里,每公里2元：(15 - 3) * 2 = 24
 * 3. 超过15公里 每公里3元：(16 - 15 )*3 =3
 * 等待时间费用：299 / 150 * 1 = 1
 * 总费用=里程费用+等待时间费用：（21+ 24 +3） +1 =49
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 10:23
 * @since Java21
 */
public class TaxiBillingSystem {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in 标准输入 也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        //请输入里程
        System.out.println("请输入里程");
        int mileage = scanner.nextInt();
        System.out.println("请输入等待时间（单位：秒）");
        int waitTime = scanner.nextInt();

        //等待时间费用
        int waitTimeCost = waitTime / 150;

        //里程费用
        //不超过3公里21元
        int mileageCost = 0;
        if (mileage <= 3) {
            mileageCost = 21;
        }
        //超过3公里但是不超过15公里,每公里2元
        else if (mileage > 3 && mileage <= 15) {
            mileageCost = 21 + (mileage - 3) * 2;
        }
        //超过15公里,每公里3元
        else if (mileage > 15) {
            mileageCost = 21 + 12 * 2 + (mileage - 15) * 3;
        }
        //总费用=里程费+等待时间费用
        int totalCost = mileageCost + waitTimeCost;
        System.out.printf("打车里程%d公里,等待时间%d秒,打车费用%d元\n", mileage, waitTime, totalCost);

        //关闭Scanner
        scanner.close();
    }
}
