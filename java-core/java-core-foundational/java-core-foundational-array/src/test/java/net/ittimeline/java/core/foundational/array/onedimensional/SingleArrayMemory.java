package net.ittimeline.java.core.foundational.array.onedimensional;

/**
 * 一个一维数组内存分析
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 8:53
 * @since Java21
 */
public class SingleArrayMemory {
    public static void main(String[] args) {
        // 数组动态初始化语法格式

        // 数据类型[] 数组名 = new 数据类型[长度];
        int[] numbers = new int[3];

        /*
           [I@b4c966a
           [ 表示当前是一个数组
           I 表示数组里面的元素都是int类型
           @ 表示一个分隔符
           b4c966a 数组真正的地址值（十六进制）
           平时我们习惯性把这个整体叫做数组的地址值

         */
        System.out.println(numbers);

        //使用数组名[下标]访问数组的元素
        System.out.println("动态初始化数组后：");
        System.out.println("访问整数数组第1个元素的初始值" + numbers[0]);
        System.out.println("访问整数数组第2个元素的初始值" + numbers[1]);
        System.out.println("访问整数数组第3个元素的初始值" + numbers[2]);

        numbers[0] = 100;
        numbers[1] = 200;
        numbers[2] = 300;
        //使用数组名[下标]访问数组的元素
        System.out.println("修改数组元素后：");
        System.out.println("访问整数数组第1个元素的初始值" + numbers[0]);
        System.out.println("访问整数数组第2个元素的初始值" + numbers[1]);
        System.out.println("访问整数数组第3个元素的初始值" + numbers[2]);
    }
}
