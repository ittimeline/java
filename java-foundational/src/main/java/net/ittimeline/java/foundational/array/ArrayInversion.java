package net.ittimeline.java.foundational.array;

import java.util.Arrays;

/**
 * 数组元素反转
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/23 12:35
 * @since JDK11
 */
public class ArrayInversion {


    public static void main(String[] args) {
        //静态初始化整数数组
        int[] numbers= {1,2,3,4,5};
        System.out.println("数组元素反转之前"+ Arrays.toString(numbers));

        int  startIndex=0;
        int endIndex=numbers.length-1;

        int count =1;

        while (startIndex<endIndex){
            numbers[startIndex]=numbers[startIndex]^numbers[endIndex];
            numbers[endIndex]=numbers[startIndex]^numbers[endIndex];
            numbers[startIndex]=numbers[startIndex]^numbers[endIndex];

            System.out.println("第"+count+"次首尾交换后:"+Arrays.toString(numbers));
            count++;

            startIndex++;
            endIndex--;
        }

        System.out.println("数组元素反转之后"+ Arrays.toString(numbers));

    }
}
