package net.ittimeline.java.core.foundational.array.algorithms;

import java.util.Arrays;

/**
 * 数组常见算法-数组反转-反转整数数组
 * 需求：定义一个数组并存储5，4，3，2，1，反转之后是1，2，3，4，5
 * 分析：
 * 假设array表示数组，i表示数组元素的索引，i的取值范围是0到array.length-1
 * 交换的元素就是array[i]和array[array.length-1-i]依次交换
 * 交换的次数是array.length/2
 * 实现方式1
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 8:58
 * @since Java 25
 */
public class ArrayReverseV1 {
    static void main() {
        int[] array = {5, 4, 3, 2, 1};
        System.out.println("数组反转之前数组元素内容是：" + Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            //使用中间变量依次交换array[i]和array[array.length-1-i]
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("数组反转之后数组元素内容是：" + Arrays.toString(array));

    }
}
