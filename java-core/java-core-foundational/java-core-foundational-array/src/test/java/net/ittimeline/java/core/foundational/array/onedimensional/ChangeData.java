package net.ittimeline.java.core.foundational.array.onedimensional;

import java.util.Arrays;

/**
 * 变化数据
 * 需求：定义一个数组存储1，2，3，4，5，6，7，8，9，10
 * 遍历数组得到每个元素
 * 要求：
 * 1. 如果是奇数则将当前数值扩大两倍
 * 2. 如果是偶数则将当前数字变成原来的二分之一
 * 分析：奇数乘以2，偶数除以2
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 9:09
 * @since Java21
 */
public class ChangeData {
    public static void main(String[] args) {
        //静态初始化数组
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("静态初始化后数组元素内容是" + Arrays.toString(numbers));

        //遍历数组
        for (int i = 0; i < numbers.length; i++) {
            //如果是奇数则将当前数值扩大两倍
            if (numbers[i] % 2 != 0) {
                numbers[i] *= 2;
            } else {
                //如果是偶数则将当前数字变成原来的二分之一
                numbers[i] /= 2;
            }
        }
        System.out.println("变化数据后数组元素内容是" + Arrays.toString(numbers));
    }
}
