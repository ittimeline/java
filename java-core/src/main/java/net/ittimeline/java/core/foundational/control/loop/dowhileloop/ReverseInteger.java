package net.ittimeline.java.core.foundational.control.loop.dowhileloop;

import java.util.Scanner;

/**
 * do while循环案例2-反转整数
 * 需求：键盘输入一个整数，输出反转后的结果，例如
 * ● 输入 123 → 输出 321
 * ● 输入 -123 → 输出 -321
 * ● 输入120 → 输出 21
 * ● 输入0 → 输出0
 * ● 输入 1534236469 →  输出0
 * ● 输入 -2147483648 → 输出0
 *
 * <p>
 * 分析：
 * 1. 提取个位：用取余运算（原数 % 10）得到当前最低位。
 * 2. 构建反转结果：将已反转部分乘以10，再加上新提取的位（相当于把新位追加到末尾）。
 * 3. 移除已处理位：用整数除法（原数 / 10）去掉最后一位。
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:19
 * @since Java 25
 */
public class ReverseInteger {
    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要反转的整数");
        int number = scanner.nextInt();
        //临时保存number的副本（避免循环中修改number后，后续打印原始值出错）
        int original = number;

        //存储反转结果
        int reversed = 0;

        do {
            //提取number最后一位数字
            int digit = number % 10;

            //提前溢出校验
            //正数溢出判断
            //Java中的int是32位有符号整数，最大值是Integer.MAX_VALUE=(1<<31)-1=2147483647
            /*
                正数反转时，reversed是正数，我们要保证它不会大于2147483647（Integer.MAX_VALUE）
                条件1：如果当前反转结果reversed大于214748364（Integer.MAX_VALUE /10），那么下一步 reversed * 10必然会溢出
                     （因为214748365 *10 =2147483650 >2147483647 ）
                或者
                条件2：如果reversed等于214748364，那么下一步加上个位数digit必须≤7，否则溢出
                     （因为214748364 *10 +8 =2147483648 >2147483647 ）
             */
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == 214748364 && digit > Integer.MAX_VALUE % 10)) {
                System.out.println("反转后的数字超出int范围，返回0");
                reversed = 0;//溢出则结果置0
                break; //终止循环
            }

            //负数溢出判断
            //Java中的int是32位有符号整数，最小值是Integer.MIN_VALUE=-(1<<31)=-2147483648
            /*
                负数反转时，reversed是负数，我们要保证它不会小于-2147483648（Integer.MIN_VALUE）
                条件1：如果当前reversed小于-214748364（即Integer.MIN_VALUE/10）,那么下一步reversed * 10必然会小于-2147483640
                     （因为-214748365 *10 =-2147483650 < -2147483648 ）,再往下加只会更小，一定溢出
                或者
                条件2：如果reversed等于-214748364，那么下一步加上个位数digit（注意digit也是负数）必须≥-8，否则就溢出
                      为什么是-8？因为 -214748364*10=-2147483640 加上-8 得-2147483648（刚好等于最小值），加上-9 得-2147483649<-2147483648就溢出了

             */
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < Integer.MIN_VALUE % 10)) {
                System.out.println("反转后的数字超出int范围，返回0");
                reversed = 0;//溢出则结果置0
                break; //终止循环
            }


            //拼接反转结果
            //如果这步计算后超过Integer取值范围（最大值、最小值），就会发生溢出（数值变成乱码），所以必须在计算之前判断
            reversed = reversed * 10 + digit;
            //去掉number最后一个数字
            number = number / 10;
        } while (number != 0);
        System.out.printf("整数%d反转的结果是%d\n", original, reversed);

        //关闭Scanner
        scanner.close();

        /*
            测试数据
            输入 123 → 输出 321
            输入 -123 → 输出 -321
            输入120 → 输出 21
            输入 1534236469 →  输出0
            输入 -2147483648 → 输出0
            输入0 → 输出0
         */

    }
}
