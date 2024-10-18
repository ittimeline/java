package net.ittimeline.java.core.foundational.array.algorithm;

import java.util.Arrays;

/**
 * 二分法查找算法-查找整数
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 15:29
 * @since Java21
 */
public class BinarySearchIntData {
    public static void main(String[] args) {
        int[] array = {2, 4, 5, 8, 12, 15, 19, 26, 37, 49, 51, 66, 89, 100};
        //查找的目标元素
        int target = 5;
        //查找的目标元素索引
        int targetIndex = -1;
        //二分法查找的次数
        int count = 0;
        //头索引
        int head = 0;
        //尾索引
        int tail = array.length - 1;
        //循环条件是头索引小于等于尾索引
        while (head <= tail) {
            count++;
            //计算中间索引
            int middle = (head + tail) / 2;
            //查找的目标元素和中间值比较
            //如果目标元素比中间值大
            if (target > array[middle]) {
                //头索引=中间索引加1
                head = middle + 1;
            }
            //如果目标元素比中间值小
            else if (target < array[middle]) {
                //尾索引=中间值减1
                tail = middle - 1;
            }
            //找到了
            else {
                targetIndex = middle;
                //结束循环
                break;
            }
        }
        if (targetIndex != -1) {
            System.out.printf("目标元素%d在数组%s找到了,索引是%d，一共找了%d次\n", target, Arrays.toString(array), targetIndex, count);
        } else {
            System.out.printf("目标元素%d在数组%s没有找到\n", target, Arrays.toString(array));
        }
    }
}
