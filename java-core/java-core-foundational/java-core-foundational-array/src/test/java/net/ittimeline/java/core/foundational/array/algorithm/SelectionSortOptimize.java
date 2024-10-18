package net.ittimeline.java.core.foundational.array.algorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 选择排序优化版
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 15:55
 * @since Java21
 */
public class SelectionSortOptimize {
    public static void main(String[] args) {
        //① 准备测试数据
        //创建Scanner对象
        //System.in 标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入待排序整数的个数");
        int length = scanner.nextInt();
        System.out.println("请输入待排序的整数（每输完一个就回车）");
        //排序的数据有5个
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        //关闭Scanner
        scanner.close();
        System.out.println("选择排序优化版【升序排序】之前数组元素内容是" + Arrays.toString(array));

        //② 选择排序优化版实现
        int round = 0;
        //统计循环次数
        int totalCount = 0;
        //外层循环控制轮数
        for (int i = 0; i < array.length - 1; i++) {
            round++;
            int count = 0;
            //标记思想：用于标识在一轮排序过程中是否有元素被交换
            boolean swapped = false;
            //内层循环控制每轮比较的次数，每轮比较的次数少一次
            for (int j = i + 1; j < array.length; j++) {
                totalCount++;
                count++;
                System.out.printf("第%d轮 第%d次%d和%d比较，", round, count, array[i], array[j]);
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    swapped = true;
                }
                System.out.printf("比较之后数组的元素是%s\n", Arrays.toString(array));

            }
            //检查 swapped 是否仍为 false，如果是，则表示没有发生交换，意味着数组已经是有序的，因此可以直接跳出循环。
            if (!swapped) {
                break;
            }
        }
        System.out.println("选择排序优化版【升序排序】之后数组元素内容是" + Arrays.toString(array));
        System.out.println("总循环次数是" + totalCount);
    }
}
