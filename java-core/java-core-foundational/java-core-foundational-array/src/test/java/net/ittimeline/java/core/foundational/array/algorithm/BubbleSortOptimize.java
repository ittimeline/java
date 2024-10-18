package net.ittimeline.java.core.foundational.array.algorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 冒泡排序优化版
 * 冒泡排序的原理：对要进行排序的一堆数据，相邻的数据进行两两比较，将比较后较大的数据放在后面，也就是按照从小到大的升序排序，依次对所有的数据进行上述操作，直到所有的数据都按照要求完成排序
 * 冒泡排序的特点：如果有n个数据，那么要比较n-1轮，每轮比较完毕后，下一轮就少比较一次，也就是说少一个数据参与比较
 * 冒泡排序性能优化版本
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 15:48
 * @see BubbleSort
 * @since Java21
 */
public class BubbleSortOptimize {
    public static void main(String[] args) {
        System.out.println("******************优化版本数据升序冒泡排序实现******************");
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


        //②冒泡排序优化版实现
        System.out.println("冒泡排序优化版【升序排序】之前数组的元素是" + Arrays.toString(array));
        //统计循环次数
        int totalCount = 0;
        int round = 0;
        //一共比较array.length-1轮，每轮比较确定一个数的位置，例如第一轮确定最大值的位置，第二轮确定第二大的值的位置，依此类推
        //外层循环控制排序的轮数
        for (int i = 0; i < array.length - 1; i++) {
            //标记思想：用于标识在一轮排序过程中是否有元素被交换
            boolean swapped = false;
            round++;
            int count = 0;
            //内层循环控制每轮比较的次数
            //每轮比较的次数逐渐减少 假如有5个数据，第一轮比较4次，第二轮比较3次，第三轮比较2次，第四轮比较1次
            for (int j = 0; j < array.length - 1 - i; j++) {
                totalCount++;
                count++;
                //比较相邻的两个整数，如果前面的数大于后面的数
                if (array[j] > array[j + 1]) {
                    //就交换位置
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    //本轮有元素交换
                    swapped = true;
                    System.out.printf("第%d轮 第%d次比较，数组的元素是%s\n", round, count, Arrays.toString(array));
                }
            }
            //检查 swapped 是否仍为 false，如果是，则表示没有发生交换，意味着数组已经是有序的，因此可以直接跳出循环。
            if (!swapped) {
                break;
            }
        }
        System.out.println("冒泡排序优化版【升序排序】之后数组的元素是" + Arrays.toString(array));
        System.out.println("总循环次数是" + totalCount);
    }
}
