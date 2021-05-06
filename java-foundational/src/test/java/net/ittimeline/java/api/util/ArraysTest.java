package net.ittimeline.java.api.util;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * Arrays常用方法测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/26 15:27
 * @since JDK11
 */
public class ArraysTest {

    private static final int length=50_0000;

    /**
     * @see Arrays#sort(int[])
     */
    @Test
    public void testArraysSort(){
        int[] numbers=ArrayUtils.generatorArray(10);
        System.out.println("排序之前数组的内容:"+Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("排序之后数组的内容:"+Arrays.toString(numbers));
    }

    /**
     * 统计Arrays.sort()方法排序的耗时
     */
    @Test
    public void testArraysSortTime(){
        int[] numbers=ArrayUtils.generatorArray(length);
        long startTime=System.currentTimeMillis();
        Arrays.sort(numbers);
        long endTime=System.currentTimeMillis();
        DateTimeUtils.calculatorTime(startTime,endTime);
        // 1万个整数的排序 程序耗时:5毫秒
        // 10万个整数的排序  程序耗时:54毫秒
        // 50万 个整数的排序 程序耗时:78毫秒
    }


    @Test
    public void testArrayUtilsBubbleSort(){
        int[] numbers=ArrayUtils.generatorArray(length);
        long startTime=System.currentTimeMillis();
        net.ittimeline.java.foundational.method.ArrayUtils.bubbleSort(numbers);
        long endTime=System.currentTimeMillis();
        DateTimeUtils.calculatorTime(startTime,endTime);
        // 1万个整数的排序 程序耗时:190毫秒
        // 10万个整数的排序 程序耗时:16312毫秒
    }


    /**
     * 数组的二分法查找
     */
    @Test
    public void testArraysBinarySearch(){
        int[] numbers=ArrayUtils.generatorArray(length,100_0000);
        long startTime=System.currentTimeMillis();
        Arrays.sort(numbers);
        int element=10888;
        int elementIndex=Arrays.binarySearch(numbers,element);
        long endTime=System.currentTimeMillis();

        DateTimeUtils.calculatorTime(startTime,endTime);

        System.out.println("查找元素的索引是"+elementIndex);

    }
    


}
