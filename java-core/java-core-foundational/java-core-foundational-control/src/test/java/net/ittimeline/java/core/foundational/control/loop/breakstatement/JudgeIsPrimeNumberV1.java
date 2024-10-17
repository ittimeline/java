package net.ittimeline.java.core.foundational.control.loop.breakstatement;

import java.util.Scanner;

/**
 * 判断质数
 * 需求：要求用户从键盘输入一个大于1的正整数，判断该正整数是不是质数
 * 分析：如果一个自然数（大于1）只能被1和本身整除，那么就是质数，否则就是合数
 * 例如 3是质数 因为只有1 * 3 = 3，即3只能被1和3整除
 * 4是合数 因为除了 1 * 4 = 4以外，还有2 * 2 = 4，即4除了能被1和4整除，还能被2整除
 * 9是合数，因为除了1 * 9 = 9以外，还有3 * 3 = 9，即9除了能被1和9整除，还能被3整除
 * 实现方式1
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 20:08
 * @since Java21
 */
public class JudgeIsPrimeNumberV1 {
    public static void main(String[] args) {

       /*
            3是质数 因为只有1 * 3 = 3,即3只能被1和3整除
            4是合数 因为除了 1 * 4 = 4以外，还有2 * 2 = 4，即4除了能被1和4整除，还能被2整除
            9是合数，因为除了1 * 9 = 9以外，还有3 * 3 = 9，即9除了能被1和9整除，还能被3整除
         */

        //创建Scanner对象
        //System.in 标准输入 也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int number = scanner.nextInt();

        //定义一个布尔变量表示标记
        //标记number是质数
        boolean isPrimeNumber = true;
        //统计循环次数
        int count = 0;

        //2到number-1范围内遍历
        for (int i = 2; i <= number - 1; i++) {
            count++;
            //i依次表示2到number-1这个范围的每个数字
            //如果number能被2到number-1这个范围内的任何一个数整除
            if (number % i == 0) {
                //number不是质数
                isPrimeNumber = false;
                //2到number-1这个范围的其他数据不需要再判断，结束循环
                break;
            }
        }
        System.out.println("方式1：循环次数" + count + "次");
        //循环结束表示2到number-1范围内的所有数字都已经判断完毕
        //根据标记判断number是否是质数
        if (isPrimeNumber) {
            System.out.println(number + "是质数");
        } else {
            System.out.println(number + "不是质数");
        }
        //关闭Scanner
        scanner.close();
    }
}
