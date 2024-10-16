package net.ittimeline.java.core.foundational.operator.arithmetic;

import java.util.Scanner;

/**
 * 小时换算
 * 需求：根据用户输入的小时换算成多少天零多少小时,例如用户输入12小时换算成0天零12小时,用户输入89小时换算成3天零17小时
 * 分析：
 * 用户输入的小时 / 24计算的结果就是天数
 * 用户输入的小时 % 24计算的结果就是剩下的小时
 * ① 89 / 24 = 3
 * ② 89 % 24 = 17
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 10:22
 * @since Java21
 */
public class HoursConversionDays {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in表示标准输入,也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入小时数");
        int hours = scanner.nextInt();

        //用户输入的小时 / 24计算的结果就是天数
        int days = hours / 24;
        //用户输入的小时 % 24计算的结果就是小时
        int remainingHours = hours % 24;
        System.out.printf("你输入的小时数是%d小时,换算成%d天零%d小时\n", hours, days, remainingHours);

        //关闭Scanner
        scanner.close();
    }
}
