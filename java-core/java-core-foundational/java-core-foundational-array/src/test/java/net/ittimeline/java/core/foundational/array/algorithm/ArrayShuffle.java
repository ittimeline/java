package net.ittimeline.java.core.foundational.array.algorithm;

import java.util.Arrays;

/**
 * 数组打乱元素顺序算法
 * 需求：定义数组并存储1，2，3，4，5，要求打乱数组中所有数据的顺序
 * 分析：静态初始化并遍历数组，将数组中的元素和随机索引对应的元素交换即可,借助(int)(Math.random()*array.length)生成随机索引
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 13:47
 * @since Java21
 */
public class ArrayShuffle {
    public static void main(String[] args) {
        //初始化一个整型数组，包含1到5的元素
        int[] array = {1, 2, 3, 4, 5};
        //打印原始数组的内容
        System.out.println("打乱之前数组元素内容" + Arrays.toString(array));
        //遍历数组，对每个元素进行随机交换
        for (int i = 0; i < array.length; i++) {
            //生成一个随机索引，取值范围为0到数组长度减1，用于选择交换的对象
            int randomIndex = (int) (Math.random() * array.length);
            // 交换当前索引i处的元素与随机索引处的元素
            // 这里通过创建一个临时变量temp来保存i处的元素值
            int temp = array[i];
            // 将i处的元素替换为随机索引处的元素
            array[i] = array[randomIndex];
            // 将随机索引处的元素替换为之前保存的i处的元素值，完成交换
            array[randomIndex] = temp;
        }
        // 打印交换后的数组内容
        System.out.println("打乱之后数组元素内容" + Arrays.toString(array));

    }
}
