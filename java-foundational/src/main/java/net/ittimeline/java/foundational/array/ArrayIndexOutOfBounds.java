package net.ittimeline.java.foundational.array;

/**
 * 数组越界
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/22 13:42
 * @since JDK11
 */
public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        int[] numbers =new int []{1,2,3};

        System.out.println("访问整数数组的第0个元素的结果"+numbers[0]);
        System.out.println("访问整数数组的第1个元素的结果"+numbers[1]);
        System.out.println("访问整数数组的第2个元素的结果"+numbers[2]);
      //System.out.println("访问整数数组的第-1个元素的结果"+numbers[-1]);

    }
}
