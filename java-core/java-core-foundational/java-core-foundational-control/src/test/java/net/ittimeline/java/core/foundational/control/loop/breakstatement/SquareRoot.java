package net.ittimeline.java.core.foundational.control.loop.breakstatement;

import java.util.Scanner;

/**
 * 求平方根
 * 需求：键盘录入一个大于或者等于2的整数x  ，计算并返回x的平方根，结果只保留整数部分 ，小数部分将被舍去
 * 分析：
 * 情况1： 25的平方根是5 1*1=2 <25 2*2=4 <25 3*3=9 <25 4*4=16 <25 5*5=25 =25
 * 情况2： 20的平方根是4 1*1=2 <20 2*2=4 <20 3*3=9 <20 4*4=16 <20 5*5=25 >20
 * 因此20的平方根位于4和5之间 但是结果只保留整数部分，因此20的平方根是4
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 20:02
 * @since Java21
 */
public class SquareRoot {
    public static void main(String[] args) {

       /*
            25的平方根是5
            1*1=2 <25
            2*2=4 <25
            3*3=9 <25
            4*4=16 <25
            5*5=25 =25

            20的平方根是4
            1*1=2 <20
            2*2=4 <20
            3*3=9 <20
            4*4=16 <20
            5*5=25 >20
            因此20的平方根位于4和5之间 但是结果只保留整数部分,因此20的平方根是4
         */
        //创建Scanner对象
        //System.in 标准输入 也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = scanner.nextInt();

        //从1开始循环，拿着数字的平方跟用户输入的数字进行比较
        for (int i = 1; i <= number; i++) {
            //用i * i 再跟number进行比较
            //如果大于，那么当前数字的前一个数字的整数部分就是平方根
            if (i * i > number) {
                System.out.printf("%d的平方根整数部分是%d\n", number, i - 1);
                //一旦找到，循环就可以停止，后面的数字就不需要再找了，提高代码的运行效率
                break;
            }
            //如果相等，那么当前数字i就是用户输入数字number的平方根
            else if (i * i == number) {
                System.out.printf("%d的平方根是%d\n", number, i);
                //一旦找到，循环就可以停止，后面的数字就不需要再找了，提高代码的运行效率
                break;
            }
        }
        //关闭Scanner
        scanner.close();
    }
}
