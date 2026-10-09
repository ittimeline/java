package net.ittimeline.java.core.foundational.array.algorithms;

import java.util.Arrays;

/**
 * 数组常见算法-数组元素查找-线性查找
 * 需求：给定整数数组int[] array = {2,4,5,8,12,15,19,26,37,49,51,66,89,100};，查找元素51是否在数组中出现。
 * 若出现，输出首次出现的索引以及查找过程中比较的次数；若未出现，输出相应提示。
 * 分析：采用线性查找（顺序查找）：
 * 1. 从数组的第一个元素（索引0）开始，依次将每个元素与目标值51进行比较。
 * 2. 每比较一次，比较计数器加1。
 * 3. 若遇到第一个等于51的元素，则记录当前索引，并立即终止循环。
 * 4. 若遍历完整个数组仍未找到，则说明目标值不存在。
 * 5. 最后根据查找结果输出相应的信息（索引值、比较次数或未找到提示）。
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 9:14
 * @since Java 25
 */
public class LinearSearch {
    static void main() {
        int[] array = {2, 4, 5, 8, 12, 15, 19, 26, 37, 49, 51, 66, 89, 100};
        //比较计数器
        int count = 0;
        //目标元素
        int targetElement = 51;
        //目标元素的索引
        int targetIndex = -1;
        //从数组的第一个元素（索引0）开始，依次将每个元素与目标值51进行比较。
        for (int i = 0; i < array.length; i++) {
            //每比较一次，比较计数器加1。
            count++;
            //若遇到第一个等于51的元素
            if (targetElement == array[i]) {
                //则记录当前索引
                targetIndex = i;
                //并立即终止循环
                break;
            }
        }
        // 若遍历完整个数组仍未找到，则说明目标值不存在。
        // 最后根据查找结果输出相应的信息（索引值、比较次数或未找到提示）。
        if (targetIndex != -1) {
            System.out.printf("%d在数组%s中找到了，索引位置是%d，查找了%d次\n", targetElement, Arrays.toString(array), targetIndex, count);
        } else {
            System.out.printf("%d在数组%s中没有找到\n", targetElement, Arrays.toString(array));
        }
    }
}
