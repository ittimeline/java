package net.ittimeline.java.core.foundational.array.onedimensional;

/**
 * 一维数组声明与初始化
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 8:18
 * @since Java21
 */
public class ArrayDeclarationInit {
    public static void main(String[] args) {
        //变量的声明与赋值
        //变量的声明
        int number;
        //变量的赋值，首次赋值叫初始化
        number = 10;
        //数组的声明语法格式： 数据类型[] 数组名;
        //数据类型既可以是基本数据类型，也可以是引用数据类型

        //声明基本类型元素数组
        int[] numbers;
        double[] prices;
        char[] chars;

        //声明引用数据类型元素数组
        String[] cities;

        //数组的初始化

        //静态初始化基本数据类型元素数组
        numbers = new int[]{1, 2, 4, 5, 7, 8, 9, 6, 3};
        prices = new double[]{100.0, 300.0, 500.0};
        chars = new char[]{'A', 'B', 'C', 'D', 'E', 'F'};

        //静态初始化引用数据类型元素数组
        cities = new String[]{"北京", "上海", "广州", "深圳"};

        //数组的声明和静态初始化完整格式
        int[] values = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        //数组的声明与静态初始化简化格式
        String[] goods = {"iPhone16", "iPhone16 Pro", "iPhone 16 Pro Max"};


        //动态初始化数组
        //动态初始化基本数据类型元素数组
        int[] data = new int[5];
        //动态初始化引用数据类型元素数组
        String[] foods = new String[108];

    }
}
