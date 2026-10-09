package net.ittimeline.java.core.foundational.array.onedimensional;

/**
 * 一维数组内存分析案例2-两个一维数组的内存分析
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 8:19
 * @since Java 25
 */
public class TwoArrayMemory {
    static void main() {
        //两个数组在堆内存中是独立的,相互不影响的两个空间
        int[] array1 = new int[]{100, 200, 300};

        System.out.println("第一个数组是" + array1);
        System.out.println("初始化后：第一个数组索引编号为0的元素值是 " + array1[0]);

        int[] array2 = new int[]{10, 20, 30};
        System.out.println("第二个数组是" + array2);
        System.out.println("第二个数组索引编号为0的元素值是 " + array2[0]);

        array1[0] = 8;
        System.out.println("修改之后：第一个数组索引编号为0的元素值是 " + array1[0]);
    }
}
