package net.ittimeline.java.foundational.array;

import java.util.Arrays;

/**
 * 数组选择排序
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/24 12:56
 * @since JDK11
 */
public class ArraySelectSort {

    public static void main(String[] args) {
        //静态初始化待排序的数组
        int[] numbers = {5, 4, 3, 2, 1,10,20,80,-100};

        System.out.println("选择排序之前的数组:"+ Arrays.toString(numbers));

        int count =0;


        //外层循环控制轮数
        for (int i = 0; i < numbers.length-1 ; i++) {
            count++;
            //内层循环控制每轮的排序的次数
            for (int j = i+1; j <numbers.length ; j++) {

                if(numbers[i]>numbers[j]){
                    numbers[i]=numbers[i]^numbers[j];
                    numbers[j]=numbers[i]^numbers[j];
                    numbers[i]=numbers[i]^numbers[j];
                }
            }
            System.out.println("第"+count+"轮选择排序的结果:"+Arrays.toString(numbers));


        }

        System.out.println("选择排序之后的数组"+Arrays.toString(numbers));


    }
}
