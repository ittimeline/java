package net.ittimeline.java.core.foundational.array.algorithm;

import java.util.Arrays;

/**
 * 数组缩容算法
 * 需求：现有数组 int[]array={1,2,3,4,5,6,7}，现在需要删除数组中索引为4的元素
 * 分析：
 * 删除数组中索引为4的元素，也就是删除5,数组的长度一旦初始化后就不能改变
 * 因此思路应该是将索引为5以后的元素依次赋值给索引为4以后的元素，并且将最后一个元素赋值为0
 * 实现方式1
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 15:07
 * @since Java21
 */
public class ArrayReduceCapacityV1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("初始化后数组元素内容是" + Arrays.toString(array));
        int removeIndex = 4;
        //将索引为5以后的元素依次赋值给索引为4以后的元素
        for (int i = removeIndex; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        //将最后一个元素赋值为0
        array[array.length - 1] = 0;
        System.out.println("缩容后数组元素内容是" + Arrays.toString(array));

    }
}
