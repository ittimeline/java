package net.ittimeline.java.core.foundational.array.algorithms;

import java.util.Arrays;
import java.util.Random;

/**
 * 数组常见算法-数组打乱元素顺序-打乱整数数组
 * 需求：定义数组并存储1，2，3，4，5，要求打乱数组中所有数据的顺序
 * 分析：
 * 1. 遍历数组array，索引i从0到array.length-1。
 * 2. 在[i,array.length-1]范围内随机生成索引j。
 * 3. 交换array[i]与array[j]。
 * 这样做可以保证每个排列等概率出现，且只需一次遍历。
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 9:02
 * @since Java 25
 */
public class ShuffleArray {
    static void main() {
        //初始化整型数组
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("打乱之前数组元素内容是：" + Arrays.toString(array));
        //创建Random对象
        Random random = new Random();
        //1.遍历数组array，索引i从0到array.length-1。
        for (int i = 0; i < array.length; i++) {
            //2.在[i,array.length-1]范围内随机生成索引j
            int j = random.nextInt(i, array.length);
            //3.交换array[i]与array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println("打乱之后数组元素内容是：" + Arrays.toString(array));
    }
}
