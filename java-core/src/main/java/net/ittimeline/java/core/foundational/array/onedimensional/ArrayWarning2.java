package net.ittimeline.java.core.foundational.array.onedimensional;

/**
 * 一维数组使用注意事项2
 * 如果数组没有初始化，访问数组中的元素就会引发空指针异常（NullPointerException)，简称NPE
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/8 9:32
 * @since Java 25
 */
public class ArrayWarning2 {
    static void main() {
        //声明整数数组
        int[] numbers;

        //数组的赋值,null表示数组没有指向任何堆空间的数据
        numbers = null;

        //数组的使用：打印数组
        System.out.println("1.numbers = " + numbers);
        //访问数组的第一个元素：此时会发生NullPointerException，简称NPE
        if (null != numbers && numbers.length > 0) {
            System.out.println("2.numbers[0] = " + numbers[0]);
        }
    }
}
