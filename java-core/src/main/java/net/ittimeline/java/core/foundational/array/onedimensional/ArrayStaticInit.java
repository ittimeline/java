package net.ittimeline.java.core.foundational.array.onedimensional;

/**
 * 一维数组静态初始化
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/8 9:29
 * @since Java 25
 */
public class ArrayStaticInit {
    static void main() {
        //数组声明的语法格式：数据类型[] 数组名;
        //声明基本类型元素的数组
        int[] numbers;
        double[] prices;
        char[] chars;

        //声明引用类型元素的数组
        String[] cities;

        //数组静态初始化语法格式:数组名 = new 数据类型[]{元素1,元素2,元素3};
        numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        prices = new double[]{5399.0, 8999.0, 9899.0};


        //数组声明与静态初始化完整格式:数据类型[] 数组名 = new 数据类型[]{元素1,元素2,元素3};
        int[] values = new int[]{10, 20, 30, 40, 50, 60, 70, 80};

        //数组声明与静态初始化简化语法格式:数据类型[] 数组名 = {元素1,元素2,元素3};
        String[] products = {"iPhone18", "iPhone18 Pro", "iPhone18 Pro Max"};
    }
}
