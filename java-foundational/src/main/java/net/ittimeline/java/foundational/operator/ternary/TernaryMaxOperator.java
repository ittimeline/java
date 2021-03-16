package net.ittimeline.java.foundational.operator.ternary;

import java.util.Scanner;

/**
 * 三元运算符求三个整数的最大值
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/14 14:04
 * @since JDK11
 */
public class TernaryMaxOperator {
    public static void main(String[] args) {

        //创建Scanner对象
        Scanner input =new Scanner(System.in);

        System.out.println("请输入第一个整数");

        //接收输入的第一个整数
        int left = input.nextInt();

        System.out.println("请输入第二个整数");

        //接收输入的第二个整数
        int middle=input.nextInt();

        System.out.println("请输入第三个整数");
        //接收输入的第三个整数
        int right=input.nextInt();

        System.out.printf("第一个整数:%d   第二个整数:%d  第三个整数:%d \n",left,middle,right);


        //求三个整数中的最大数

        // 第一步 求两个数中的最大值
        int temp=left>middle?left:middle;

        // 第二步 拿两个数中的最大值和第三个整数进行比较
        int max =temp>right?temp:right;
        System.out.println("三个整数的最大值是"+max);



    }
}
