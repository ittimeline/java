package net.ittimeline.java.core.foundational.array.twodimensional;

/**
 * 二维数组声明和初始化
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 10:18
 * @since Java21
 */
public class ArrayDeclarationInit {
    public static void main(String[] args) {
        /******************二维数组的声明******************/
        int[][] intData;
        double[][] doubleData;
        String[][] stringData;

        /******************二维数组声明和静态初始化******************/
        //静态初始化：数值变量的赋值和数组元素的赋值同时进行
        /*
            {1, 2, 3}, {4, 5, 6,}, {7, 8}表示外层元素
            1,2,3,4,5,6,7,8表示内层元素
         */
        int[][] intValues = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8}};
        double[][] doubleValues = new double[][]{{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0}};
        String[][] stringValues = new String[][]{{"上海", "北京", "深圳", "广州"}, {"纽约", "旧金山", "波士顿"}};

        /******************二维数组声明和静态初始化简化格式******************/

        String[][] pl = {{"c", "c++",}, {"java", "python", "go"}, {"javascript", "typescript"}, {"swift", "kotlin"}};

        /******************二维数组动态初始化两种方式******************/
        //动态初始化：数组变量的赋值和数组元素的赋值分开进行

        /******************二维数组动态初始化方式1******************/

        //4表示外层元素个数
        //3表示内层元素个数
        double[][] sales = new double[4][3];

        /******************二维数组动态初始化方式2******************/
        //4表示外层元素个数，内层元素个数不确定
        double[][] prices = new double[4][];
    }
}
