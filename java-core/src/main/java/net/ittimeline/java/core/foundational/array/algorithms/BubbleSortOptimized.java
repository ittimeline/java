package net.ittimeline.java.core.foundational.array.algorithms;

import java.util.Arrays;

/**
 * 数组常见算法-数组排序-冒泡排序-优化版
 * 冒泡排序的原理：
 * ● 从数组的第一个元素开始，依次比较相邻的两个元素；
 * ● 如果前一个元素大于后一个元素，则交换它们的位置；
 * ● 一轮比较结束后，当前未排序序列中的最大元素会被移动到数组末尾；
 * ● 接着对剩余未排序部分重复上述过程；
 * ● 直到所有元素都有序为止。
 * <p>
 * 冒泡排序的特点：
 * ● 如果有n个元素，则需要进行n-1轮比较；
 * ● 每一轮比较结束后，未排序元素的范围会缩小；
 * ● 第i轮需要比较的次数为：n-1-i；
 * ● 算法实现简单，易于理解；
 * ● 属于稳定排序算法（相等元素相对位置不变）；
 * <p>
 * 优化版：如果已经有序，可以提前结束
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 9:20
 * @since Java 25
 */
public class BubbleSortOptimized {
    static void main() {
        int[] array = {64, 34, 25, 12, 22};
        System.out.println("冒泡排序优化版【升序排序】之前数组的元素是：" + Arrays.toString(array));
        //外层循环控制排序的轮数
        //一共比较array.length-1轮，每一轮比较确定一个数的位置，例如第一轮确定最大值的位置，第二轮确定第二大值的位置，依此类推
        int round = 0;
        for (int i = 0; i < array.length - 1; i++) {
            round++;
            //相邻的两个元素是否交换
            boolean swapped = false;
            //内层循环控制每轮比较的次数
            int count = 0;
            //每轮比较的次数逐渐减少，假如有5个数据，第一轮比较4次，第二轮比较3次，第三轮比较2次，第四轮比较1次
            for (int j = 0; j < array.length - 1 - i; j++) {
                //比较相邻的两个整数，如果前面的数大于后面的数
                if (array[j] > array[j + 1]) {
                    //就交换位置
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
                count++;
                System.out.printf("第%d轮 第%d次比较后，数组的元素是%s\n", round, count, Arrays.toString(array));

            }
            //没有发生交换，说明数组已经有序
            if (!swapped) {
                System.out.printf("第%d轮未发生交换，说明数组已有序，提前结束!\n", round);
                break;
            }
            System.out.printf("第%d轮结束后结果是%s\n", round, Arrays.toString(array));
        }
        System.out.println("冒泡排序优化版【升序排序】之后数组的元素是：" + Arrays.toString(array));

    }
}
