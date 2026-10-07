package net.ittimeline.java.core.foundational.control.loop.dowhileloop;

/**
 * do while循环语法格式和执行流程
 * ①初始化语句
 * do{
 * ②循环体语句;
 * ③循环迭代语句;
 * }while(④循环条件判断语句);
 * <p>
 * 1. 执行①初始化语句
 * 2. 执行②循环体语句
 * 3. 执行③循环迭代语句
 * 4. 执行④循环条件判断语句，看执行结果是true还是false
 * a. 如果④循环条件判断语句结果为true,那么就执行②循环体语句，然后再执行③循环迭代语句，然后再循环执行④循环条件判断语句、②循环体语句、③循环迭代语句
 * b. 如果④循环条件判断语句执行结果为false，那么就结束do while循环
 * do while循环使用
 * 需求：统计1到100的偶数的个数以及偶数的累加和
 * 分析：偶数就是能被2整除的数
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:18
 * @since Java 25
 */
public class DoWhileLoop {
    static void main() {
        //偶数和
        int evenNumberSum = 0;
        //偶数个数
        int evenNumberCount = 0;
        //初始化语句
        int i = 1;
        do {
            //循环体语句
            if (i % 2 == 0) {
                evenNumberSum += i;
                evenNumberCount++;
            }
            //循环迭代语句
            i++;
        } while (i <= 100); //循环条件判断语句

        System.out.printf("1到100的偶数和是%d，偶数个数是%d", evenNumberSum, evenNumberCount);
    }
}
