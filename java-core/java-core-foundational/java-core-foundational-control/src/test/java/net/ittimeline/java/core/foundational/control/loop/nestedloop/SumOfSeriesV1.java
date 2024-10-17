package net.ittimeline.java.core.foundational.control.loop.nestedloop;

/**
 * 累加求和
 * 需求：表达式为1+(1+2)+(1+2+3)+(1+2+3+…+100)
 * 分析：表达式总共100项，第n项有n个数相加，将每项的n个数累加求和
 * 实现方式1
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 21:50
 * @since Java21
 */
public class SumOfSeriesV1 {
    public static void main(String[] args) {
        //100项的总和
        int totalSum = 0;
        //一共100项
        for (int i = 1; i <= 100; i++) {
            //每一项的和
            int termSum = 0;
            //第n项有n个数相加
            for (int j = 1; j <= i; j++) {
                termSum += j;
            }
            //总和等于每一项的和相加
            totalSum += termSum;
        }
        System.out.println("表达式1+(1+2)+(1+2+3)+(1+2+3+…+100)的值为" + totalSum);
    }
}
