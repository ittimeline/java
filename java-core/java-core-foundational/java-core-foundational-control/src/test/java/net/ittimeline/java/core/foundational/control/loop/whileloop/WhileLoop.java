package net.ittimeline.java.core.foundational.control.loop.whileloop;

/**
 * while循环使用
 * 需求：打印1到100的偶数，并且统计偶数的个数以及偶数的累加和
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 19:13
 * @since Java21
 */
public class WhileLoop {
    public static void main(String[] args) {
        int evenNumberSum = 0;
        int evenNumberCount = 0;

        //循环初始化语句
        int i = 1;
        //循环条件判断语句
        while (i <= 100) {
            //循环体语句
            if (i % 2 == 0) {
                evenNumberSum += i;
                evenNumberCount++;
            }
            //循环迭代语句
            i++;
        }
        System.out.printf("1到100的偶数和是%d，偶数个数是%d", evenNumberSum, evenNumberCount);
    }
}
