package net.ittimeline.java.core.foundational.control.loop.dowhileloop;

/**
 * do while循环使用
 * 需求：打印1到100的偶数，并且统计偶数的个数以及偶数的累加和
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 19:49
 * @since Java21
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        int evenNumberSum = 0;
        int evenNumberCount = 0;
        //初始化语句
        int number = 1;
        do {
            //循环体语句
            if (number % 2 == 0) {
                evenNumberSum += number;
                evenNumberCount++;
            }
            //循环迭代语句
            number++;
        } while (number <= 100); //循环条件判断语句

        System.out.printf("1到100的偶数和是%d，偶数个数是%d", evenNumberSum, evenNumberCount);
    }
}
