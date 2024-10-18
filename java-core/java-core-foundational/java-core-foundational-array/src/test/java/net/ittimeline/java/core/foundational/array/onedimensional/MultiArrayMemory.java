package net.ittimeline.java.core.foundational.array.onedimensional;

/**
 * 两个一维数组内存分析
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 9:05
 * @since Java21
 */
public class MultiArrayMemory {
    public static void main(String[] args) {
        //两个数组在内存中是独立的,相互不影响的两个空间
        int[] arr1 = {100, 200, 300};

        System.out.println("第一个数组是" + arr1);
        System.out.println("第一个数组索引编号为0的元素值是 " + arr1[0]);

        int[] arr2 = {10, 20, 30};
        System.out.println("第二个数组是" + arr2);
        System.out.println("第二个数组索引编号为0的元素值是 " + arr2[0]);


        arr1[0] = 8;
        System.out.println("第一个数组索引编号为0的元素值是 " + arr1[0]);
    }
}
