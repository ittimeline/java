package net.ittimeline.java.core.foundational.array.onedimensional;

/**
 * 一维数组内存分析案例1-一个一维数组内存分析
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 8:12
 * @since Java 25
 */
public class OneArrayMemory {
    static void main() {
        // 数组动态初始化语法格式：数据类型[] 数组名 = new 数据类型[长度];
        int[] numbers = new int[3];
        /*
             numbers = [I@f6f4d33
             numbers 变量在栈中，保存的是堆中数组对象的引用（地址）
             [I@f6f4d33
             [ 表示当前是一个数组
             I 表示数组里面的元素都是int类型
             @ 表示一个分隔符
             f6f4d33  数组对象的哈希码（不是内存地址） 每次运行结果可能不同
         */

        System.out.println("numbers = " + numbers);
        //使用数组名[下标]访问数组的元素
        System.out.println("========动态初始化数组后========");
        System.out.println("访问整数数组第1个元素的初始值：" + numbers[0]);
        System.out.println("访问整数数组第2个元素的初始值：" + numbers[1]);
        System.out.println("访问整数数组第3个元素的初始值：" + numbers[2]);
        //修改元素
        numbers[0] = 100;
        numbers[1] = 200;
        numbers[2] = 300;
        //使用数组名[下标]访问数组的元素
        System.out.println("========修改数组元素后========");
        System.out.println("访问整数数组第1个元素的值：" + numbers[0]);
        System.out.println("访问整数数组第2个元素的值：" + numbers[1]);
        System.out.println("访问整数数组第3个元素的值：" + numbers[2]);
    }
}
