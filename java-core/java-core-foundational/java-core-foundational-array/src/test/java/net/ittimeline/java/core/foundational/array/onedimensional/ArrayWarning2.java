package net.ittimeline.java.core.foundational.array.onedimensional;

/**
 * 一维数组使用注意事项2
 * 如果数组没有初始化，然后访问数组中的元素就会引发空指针异常
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 8:35
 * @since Java21
 */
public class ArrayWarning2 {
    public static void main(String[] args) {
        //数组的声明
        int[] numbers;

        //数组的赋值 null表示数组没有引用任何堆内存空间的数据
        numbers = null;

        //数组的使用-打印数组
        System.out.println("1.numbers = " + numbers);
        //访问数组的第一个元素
        // NullPointerException
        // System.out.println("2.numbers[0] = " + numbers[0]);
        if (numbers != null && numbers.length > 0) {
            System.out.println("3.numbers[0] = " + numbers[0]);
        }
    }
}
