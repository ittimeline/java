package net.ittimeline.java.core.foundational.array.algorithm;

import java.util.Arrays;

/**
 * 数组反转算法
 * 需求：定义一个数组并存储1，2，3，4，5，反转之后是5，4，3，2，1
 * 分析：
 * ● 假设array表示数组，i表示数组元素的索引，i的取值范围是0到array.length-1
 * ● 交换的元素就是array[i]和array[array.length-1-i]依次交换
 * ● 交换的次数是array.length/2
 * 实现方式1
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 13:34
 * @since Java21
 */
public class ArrayReversalV1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("数组反转之前数组元素内容是：" + Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            //交换array[i]和array[array.length - i - 1]位置的元素
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("数组反转之后数组元素内容是：" + Arrays.toString(array));

    }
}
