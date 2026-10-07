package net.ittimeline.java.core.foundational.control.branch.ifelseifelsestatement;

import java.util.Scanner;

/**
 * 多分支结构 if else if else语句案例3-出租车计费系统
 * 需求：实现出租车计费系统
 * 出租车的计费方式：里程费用和等待时间费用
 * ● 里程费用
 * 1. 不超过3公里 21元
 * 2. 超过3公里但是不超过15公里 每公里2元
 * 3. 超过15公里 每公里3元
 * ● 等待时间费用
 * a. 每等待150秒(2分半钟)收费1元
 * b. 不超过150秒不收钱
 * 为了考虑程序的灵活性，里程数和等待时间的秒数都是由用户从键盘输入的。
 * <p>
 * 分析：假如里程数是16公里，等待时间是299秒，那么应该如何计算打车费，打车费用是49
 * ● 里程费用
 * 1. 不超过3公里：21元
 * 2. 超过3公里但是不超过15公里，每公里2元：(15 - 3) * 2 = 24
 * 3. 超过15公里 每公里3元：(16 - 15 )*3 =3
 * ● 等待时间费用：299 / 150 * 1 = 1
 * ● 总费用=里程费用+等待时间费用：（21+ 24 +3） +1 =49
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 13:04
 * @since Java 25
 */
public class TaxiBillingSystem {
    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入里程，单位（公里）");
        int mileage = scanner.nextInt();
        System.out.println("请输入等待时间，单位（秒）");
        int waitTime = scanner.nextInt();

        //计算里程费用
        int mileageAmount = 0;
        if (mileage <= 3) {
            //3公里以内21
            mileageAmount = 21;
        } else if (mileage <= 15) {
            //超过3公里不超过15公里每公里2  (mileage - 3) * 2
            mileageAmount = 21 + (mileage - 3) * 2;
        } else if (mileage > 15) {
            //超过15公里每公里3 (mileage - 15) * 3
            mileageAmount = 21 + 12 * 2 + (mileage - 15) * 3;
        }

        //计算等待时间费用
        int waitTimeAmount = waitTime / 150;
        //计算总费用
        int amount = mileageAmount + waitTimeAmount;
        System.out.printf("打车里程%d公里，等待时间%d秒，打车费用%d元\n", mileage, waitTime, amount);

        //关闭Scanner
        scanner.close();
    }
}
