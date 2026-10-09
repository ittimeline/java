package net.ittimeline.java.core.foundational.array.algorithms;

import java.util.Arrays;

/**
 * 数组常见算法-数组元素查找-二分法查找
 * 需求：给定整数数组int[] array = {2,4,5,8,12,15,19,26,37,49,51,66,89,100};，
 * 查找元素51是否在数组中出现。若出现，输出首次出现的索引以及查找过程中比较的次数；若未出现，输出相应提示。
 * 分析：采用二分查找法，二分查找的核心思想是“分而治之”：
 * 1. 在一个已排序的数组中查找目标值。
 * 2. 每次比较中间元素与目标值：
 * ○ 如果中间元素大于目标值，说明目标值在左半部分。
 * ○ 如果中间元素小于目标值，说明目标值在右半部分。
 * ○ 如果中间元素等于目标值，查找成功。
 * 3. 重复上述过程，直到找到目标值或搜索区间为空。
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 9:16
 * @since Java 25
 */
public class BinarySearch {
    static void main() {
        //有序整数数组
        int[] array = {2, 4, 5, 8, 12, 15, 19, 26, 37, 49, 51, 66, 89, 100};
        //头索引
        int headIndex = 0;
        //尾索引
        int tailIndex = array.length - 1;
        //查找的元素
        //两个测试用例二选一
        //测试用例1：查找元素51
        int targetElement = 51;
        //测试用例2：查找元素5
        //int targetElement = 5;
        //查找元素的位置
        int targetIndex = -1;
        //查找的次数
        int count = 0;
        //当头索引小于等于尾索引
        while (headIndex <= tailIndex) {
            //计数器累加
            count++;
            //计算中间索引
            //int middleIndex=(headIndex+tailIndex)/2;
            //避免整数溢出风险
            int middleIndex = headIndex + (tailIndex - headIndex) / 2;

            //每次比较中间元素与目标值
            //如果中间元素大于目标值，说明目标值在左半部分。
            if (array[middleIndex] > targetElement) {
                //尾索引=中间索引-1
                tailIndex = middleIndex - 1;
            }
            //如果中间元素小于目标值，说明目标值在右半部分。
            else if (array[middleIndex] < targetElement) {
                //头索引=中间索引加1
                headIndex = middleIndex + 1;
            }
            //如果中间元素等于目标值，查找成功。
            else {
                //记录找到元素的索引位置
                targetIndex = middleIndex;
                //结束循环（只找第一次出现的位置）
                break;
            }
        }

        // 最后根据查找结果输出相应的信息（索引值、比较次数或未找到提示）。
        if (targetIndex != -1) {
            System.out.printf("%d在数组%s中找到了，索引位置是%d，查找了%d次\n", targetElement, Arrays.toString(array), targetIndex, count);
        } else {
            System.out.printf("%d在数组%s中没有找到\n", targetElement, Arrays.toString(array));
        }
    }
}
