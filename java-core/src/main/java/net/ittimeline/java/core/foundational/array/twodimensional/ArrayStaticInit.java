package net.ittimeline.java.core.foundational.array.twodimensional;

import java.util.Arrays;

/**
 * 二维数组静态初始化
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 8:40
 * @since Java 25
 */
public class ArrayStaticInit {
    static void main() {
        //方式1：先声明后静态初始化
        int[][] intData;
        intData = new int[][]{{10, 20, 30, 40}, {50, 60, 70, 80}, {90, 100, 110, 120}};

        //方式2：声明+静态初始化（完整格式）
        double[][] doubleValues = new double[][]{{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0}};

        //方式3：声明+静态初始化（简化格式，最常用）
        String[][] stringValues = {
                {"上海", "北京", "深圳", "广州"},
                {"纽约", "旧金山", "波士顿"}
        };
        // 输出数组内容
        System.out.println("intData：" + Arrays.deepToString(intData));
        System.out.println("doubleValues：" + Arrays.deepToString(doubleValues));
        System.out.println("stringValues：" + Arrays.deepToString(stringValues));

    }
}
