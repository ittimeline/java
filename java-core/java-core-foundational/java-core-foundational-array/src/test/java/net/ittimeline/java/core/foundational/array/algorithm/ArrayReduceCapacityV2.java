package net.ittimeline.java.core.foundational.array.algorithm;

import java.util.Arrays;

/**
 * 数组缩容算法
 * 需求：现有数组 int[]array={1,2,3,4,5,6,7}，现在需要删除数组中索引为4的元素
 * 分析：
 * 删除数组中索引为4的元素，也就是删除5
 * 创建一个新数组newArray,长度是数组array.length-1
 * 将除索引为4的元素复制到新数组newArray
 * 将newArray赋值给array
 * 实现方式2
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 15:15
 * @since Java21
 */
public class ArrayReduceCapacityV2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("【实现方式2】初始化后数组元素内容是" + Arrays.toString(array));
        //创建一个新数组newArray,长度是数组array.length-1
        int[] newArray = new int[array.length - 1];
        int removeIndex = 4;
        //将除索引为4的元素复制到新数组newArray
        for (int i = 0; i < 4; i++) {
            newArray[i] = array[i];
        }
        for (int i = removeIndex; i < array.length - 1; i++) {
            newArray[i] = array[i + 1];

        }
        //将newArray赋值给array
        array = newArray;
        System.out.println("【实现方式2】缩容后数组元素内容是" + Arrays.toString(array));
    }
}
