package net.ittimeline.java.foundational.array;

import java.util.Arrays;

/**
 * 数组的冒泡排序
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/23 13:50
 * @since JDK11
 */
public class ArrayBubbleSort {

    public static void main(String[] args) {

        int[] numbers = {5, 4, 3, 2, 1,10,20,80,-100};

        System.out.println("冒泡排序之前的结果是" + Arrays.toString(numbers));

        int count = 0;

        //外层循环控制比较的轮数
        for (int i = 0; i < numbers.length - 1; i++) {

            //内层循环控制每轮比较的次数,次数是递减的
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                //内层循环的循环体  比较相邻的两个数据,把比较之后较大的数据放在后面,这个就是需要交换变量
                if (numbers[j] > numbers[j + 1]) {
                    numbers[j] = numbers[j] ^ numbers[j + 1];
                    numbers[j + 1] = numbers[j] ^ numbers[j + 1];
                    numbers[j] = numbers[j] ^ numbers[j + 1];

                }


            }

            count++;
            System.out.println("第" + count + "轮排序的结果" + Arrays.toString(numbers));
        }
        System.out.println("冒泡排序之后的结果是" + Arrays.toString(numbers));

    }
}
