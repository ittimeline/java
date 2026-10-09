package net.ittimeline.java.core.foundational.array.algorithms;

import java.util.Arrays;

/**
 * 数组常见算法-数组反转-反转整数数组
 * 需求：定义一个数组并存储5，4，3，2，1，反转之后是1，2，3，4，5
 * 分析：
 * 假设array表示数组，i表示数组元素的头索引，j表示数组元素的尾索引
 * 交换的元素就是array[i]和array[j]依次交换
 * 交换的条件就是i小于j
 * 每交换一次后，头索引i++，尾索引j--
 * 实现方式2
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 8:59
 * @since Java 25
 */
public class ArrayReverseV2 {
    static void main() {
        int[] array = {5, 4, 3, 2, 1};
        System.out.println("数组反转之前数组元素内容是：" + Arrays.toString(array));
        //i表示数组元素的头索引
        int i = 0;
        //j表示数组元素的尾索引
        int j = array.length - 1;
        while (i < j) {
            //使用中间变量依次交换array[i]和array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            //头索引自增
            i++;
            //尾索引自减
            j--;
        }
        System.out.println("数组反转之后数组元素内容是：" + Arrays.toString(array));
    }
}
