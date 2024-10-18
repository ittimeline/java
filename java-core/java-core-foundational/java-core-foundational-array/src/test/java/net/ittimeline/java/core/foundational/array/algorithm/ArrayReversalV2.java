package net.ittimeline.java.core.foundational.array.algorithm;

import java.util.Arrays;

/**
 * 数组反转算法
 * 需求：定义一个数组并存储1，2，3，4，5，反转之后是5，4，3，2，1
 * 分析
 * ● 假设array表示数组，i表示数组元素的头索引，j表示数组元素的尾索引
 * ● 交换的元素就是array[i]和array[j]依次交换
 * ● 交换的条件就是i小于j
 * 实现方式2
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 13:37
 * @since Java21
 */
public class ArrayReversalV2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("数组反转之前数组元素内容是：" + Arrays.toString(array));
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            //array[i]和array[j]位置的元素交换
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println("数组反转之前数组元素内容是：" + Arrays.toString(array));
    }
}
