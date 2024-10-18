package net.ittimeline.java.core.foundational.array.algorithm;

import java.util.Arrays;

/**
 * 数值特征值统计算法-统计数值
 * 需求：定义一个int类型的一维数组，包含10个元素，分别赋值一些随机整数，
 * 然后求出所有元素的最大值、最小值、总和、平均值，并统计多少个元素比平均值小。
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 12:35
 * @since Java21
 */
public class StaticsEigenvalue {
    public static void main(String[] args) {
        //1.动态初始化方式创建数组
        int[] numbers = new int[10];
        //2.通过循环给数组元素赋值
        for (int i = 0; i < numbers.length; i++) {
            int number = (int) (Math.random() * (99 - 10 + 1) + 10);
            numbers[i] = number;
        }
        System.out.println("数组中的元素是" + Arrays.toString(numbers));
        //3.求最大值
        int max = numbers[0];
        //4.求最小值
        int min = numbers[0];
        //5.求总和
        int sum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
            sum += numbers[i];
        }
        System.out.println("最大值是" + max);
        System.out.println("最小值是" + min);
        System.out.println("总和是" + sum);
        //6.求平均值
        int avg = sum / numbers.length;
        System.out.println("平均值是" + avg);
        //7.统计多少个值比平均值小
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < avg) {
                count++;
            }
        }
        System.out.println("比平均值小的数字数量有" + count + "个");
    }
}
