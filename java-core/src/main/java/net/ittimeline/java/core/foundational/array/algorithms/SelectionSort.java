package net.ittimeline.java.core.foundational.array.algorithms;

import java.util.Arrays;

/**
 * 数组常见算法-数组排序-选择排序
 * 选择排序定义：选择排序（Selection Sort）是一种 简单直观的排序算法，它的思想很像我们在生活中“挑选最小（或最大）的东西”的过程。
 * 选择排序的原理：
 * ● 把数组分成 已排序区间 和 未排序区间。
 * ● 每一轮从 未排序区间 里挑出最小的元素，放到已排序区间的末尾。
 * ● 不断重复，直到所有元素都排好序。
 * <p>
 * 选择排序的特点：
 * 1. 不稳定排序：相等元素的相对顺序可能会改变。
 * 2. 比较次数固定：无论输入数据是否有序，比较次数总是 n*(n-1)/2 次。
 * 3. 交换次数少：每轮最多交换一次，总共最多 n-1 次交换，适用于交换成本较高的场景。
 * 4. 实现简单：逻辑直观，容易理解和编码实现。
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 9:21
 * @since Java 25
 */
public class SelectionSort {
    static void main() {
        int[] array = {64, 34, 25, 12, 22};
        System.out.println("选择排序之前数组元素内容是：" + Arrays.toString(array));
        //外层循环控制轮数，一共array.length-1轮，因为最后一个元素自然有序，不需要比较
        //每轮确定当前要放最小值的位置（索引i）
        //第一轮排序：目标把[0~4]最小值放到索引0
        //第二轮排序：目标把[1~4]最小值放到索引1
        //第三轮排序：目标把[2~4]最小值放到索引2
        //第四轮排序：目标把[3~4]最小值放到索引3
        int round = 0;
        for (int i = 0; i < array.length - 1; i++) {
            round++;
            System.out.printf("\n第%d轮排序：目标将索引[%d~%d]最小值放到索引%d\n", round, i, array.length - 1, i);
            //假设当前i是最小值位置，后续通过比较不断修正这个最小值位置
            int minIndex = i;
            //内层循环在未排序部分[i+1,array.length-1]中找真正的最小值下标
            //j的含义：当前正在比较的元素索引
            int compareCount = 0;
            for (int j = i + 1; j < array.length; j++) {
                compareCount++;
                //记录比较前的最小值索引（否则输出会不正确）
                int currentMinIndex = minIndex;

                //如果发现更小值，就更新最小值索引
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
                //array[j] 当前参与比较的元素
                //array[currentMinIndex]比较前的最小值
                //minIndex 更新后的最小索引
                System.out.printf("第%d次：%d和%d比较     最小值索引：%d\n", compareCount, array[j], array[currentMinIndex], minIndex);
            }
            //如果最小值不是当前位置i，就交换
            //i是当前轮次未排序部分的起始位置，也是我们期望放最小值的位置
            //minIndex是这一轮真正找到的最小值所在下标
            //如果minIndex!=i，说明最小值在后面某个位置，必须交换才能把最小值挪到i处
            if (minIndex != i) {
                System.out.printf("交换：索引%d 和 索引%d\n", i, minIndex);
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            } else {
                //如果minIndex==i，说明当前位置的元素已经是最小值，无需交换
                System.out.println("无需交换（最小值已经在正确位置）");
            }
            System.out.printf("第%d轮排序结果是%s\n", round, Arrays.toString(array));
        }
        System.out.println("选择排序之后数组元素内容是：" + Arrays.toString(array));
        
    }
}
