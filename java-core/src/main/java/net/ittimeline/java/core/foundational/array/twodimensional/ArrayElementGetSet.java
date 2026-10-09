package net.ittimeline.java.core.foundational.array.twodimensional;

/**
 * ArrayElementGetSet
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 8:42
 * @since Java 25
 */
public class ArrayElementGetSet {
    static void main() {
        System.out.println("******************1.二维数组静态初始化与访问******************");
        //声明和静态初始化二维数组
        int[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //打印输出二维数组
       /*
           data = [[I@27716f4
           [[ 表示为二维数组
           I 表示数组元素是int类型
           @ 表示一个分隔符
           27716f4 数组对象的哈希码（不是地址值）
        */
        System.out.println("data = " + data);
        // 访问二维数组的元素：通过数组名[下标]访问
        // 此时获取的是二维数组中的第一个元素 {1, 2, 3}，打印输出为一维数组的地址值
        System.out.println("二维数组第一行元素data[0] = " + data[0]);
        // 访问具体元素
        System.out.println("二维数组data 第一行第一列的元素 data[0][0] = " + data[0][0]);
        System.out.println("二维数组data 第一行第三列的元素 data[0][2] = " + data[0][2]);
        System.out.println("二维数组data 第三行第三列的元素 data[2][2] = " + data[2][2]);

        System.out.println("******************2.二维数组动态初始化与访问******************");

        // 声明和动态初始化二维数组（确定行数和列数）
        double[][] sales = new double[4][3];
        // 给二维数组的第一行赋值
        sales[0][0] = 4.68;
        sales[0][1] = 4.78;
        sales[0][2] = 4.88;

        // 给二维数组的第二行赋值
        sales[1][0] = 6.68;
        sales[1][1] = 6.78;
        sales[1][2] = 6.88;

        // 给二维数组的第三行赋值
        sales[2][0] = 5.68;
        sales[2][1] = 5.78;
        sales[2][2] = 5.88;

        // 给二维数组的第四行赋值
        sales[3][0] = 7.68;
        sales[3][1] = 7.78;
        sales[3][2] = 7.88;
        System.out.println("二维数组 sales 第一行第二列的元素 sales[0][1] = " + sales[0][1]);
        System.out.println("二维数组 sales 第二行第三列的元素 sales[1][2] = " + sales[1][2]);
        System.out.println("二维数组 sales 第四行第三列的元素 sales[3][2] = " + sales[3][2]);


        // 声明和动态初始化二维数组（只确定行数，列数后续分别指定）
        String[][] cities = new String[2][];

        // 初始化二维数组的第一个元素（一维数组）
        cities[0] = new String[4];
        cities[0][0] = "上海";
        cities[0][1] = "北京";
        cities[0][2] = "广州";
        cities[0][3] = "深圳";
        // 初始化二维数组的第二个元素（一维数组）
        cities[1] = new String[3];
        cities[1][0] = "纽约";
        cities[1][1] = "旧金山";
        cities[1][2] = "波士顿";
        System.out.println("二维数组 cities 第一行第四列的元素 cities[0][3] = " + cities[0][3]);
        System.out.println("二维数组 cities 第二行第三列的元素 cities[1][2] = " + cities[1][2]);

    }
}
