package net.ittimeline.java.foundational.method;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * 数组工具类测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/11 16:37
 * @since JDK11
 */
public class ArrayUtilsTest {

    int[] numbers = {5, 4, 3, 2, 1, 10, 20, 80, -100};

    public static void main(String[] args) {

        int[] addArray = {1, 2, 3};
        System.out.println("往数组中添加指定的元素之前" + Arrays.toString(addArray));
        int[] newAddArray = ArrayUtils.add(addArray, 4);
        if (null != newAddArray) {
            System.out.println("往数组中添加指定的元素之后" + Arrays.toString(newAddArray));
        }


        int[] removeArray = {1, 2, 3};
        System.out.println("根据索引删除数组中指定的元素之前" + Arrays.toString(removeArray));
        int[] newRemoveArray = ArrayUtils.remove(removeArray, 2);
        System.out.println("根据索引删除数组中指定的元素之后" + Arrays.toString(newRemoveArray));


        int[] removeElementArray = {1, 2, 3};
        System.out.println("删除数组中指定的元素之前" + Arrays.toString(removeElementArray));
        int[] newRemoveElementArray = ArrayUtils.removeElement(removeElementArray, 1);
        System.out.println("删除数组中指定的元素之后" + Arrays.toString(newRemoveElementArray));


        int[] addIndexArray = {1, 2, 3};
        System.out.println("往数组中指定的索引添加指定的元素之前  数组的内容" + Arrays.toString(addIndexArray));
        int[] newAddIndexArray = ArrayUtils.add(addIndexArray, 2, 100);
        System.out.println("往数组中指定的索引添加指定的元素之后  数组的内容" + Arrays.toString(newAddIndexArray));

    }

    /**
     * 冒泡排序测试用例
     */
    @Test
    public void testBubbleSort() {


        ArrayUtils.bubbleSort(numbers);

    }

    /**
     * 测试选择排序
     */
    @Test
    public void testSelectSort() {
        ArrayUtils.selectSort(numbers);
    }

    /**
     * 测试二分法查找
     */
    @Test
    public void testBinarySearch(){
        int target = -80;
        int targetIndex = ArrayUtils.binarySearch(numbers, target);
        if (targetIndex != -1) {
            System.out.println("二分法查找的目标元素" + target + "所在的索引是" + targetIndex);
        } else {
            System.out.println("二分法查找的目标元素" + target + "没找到");
        }
    }


}
