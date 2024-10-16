package net.ittimeline.java.core.foundational.operator.arithmetic;

import java.util.Scanner;

/**
 * 秒数换算
 * 需求：根据用户输入的秒数计算出对应的时分秒，假设用户输入的秒数是3800，3800秒对应的时间是1时3分20秒
 * 分析：如何转换小时、分钟、秒数？
 * <p>
 * 转换小时、分钟、秒数的方法
 * 小时=输入的秒数/3600
 * 分钟=输入的秒数%3600/60
 * 秒钟=输入的秒数%60
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 10:24
 * @since Java21
 */
public class SecondConversionTime {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入秒数");
        int inputSecond = scanner.nextInt();

        int hours = inputSecond / 3600;
        int minutes = inputSecond % 3600 / 60;
        int seconds = inputSecond % 60;
        System.out.printf("你输入的秒数是%d秒，对应的时间是%d小时%d分钟%d秒\n",
                inputSecond, hours, minutes, seconds);
        //关闭Scanner
        scanner.close();
    }
}
