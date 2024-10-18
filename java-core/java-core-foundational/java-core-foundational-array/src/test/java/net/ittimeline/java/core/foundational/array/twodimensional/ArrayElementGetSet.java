package net.ittimeline.java.core.foundational.array.twodimensional;

/**
 * 二维数组元素访问
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 10:33
 * @since Java21
 */
public class ArrayElementGetSet {
    public static void main(String[] args) {
        System.out.println("1.二维数组静态初始化与访问");
        //声明和静态初始化二维数组
        int[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //打印输出二维数组
        /*
            data = [[I@b4c966a
            [[ 表示为二维数组
            I 表示int
            @ 表示一个分隔符
            b4c966a 数组的地址值（十六进制）
           平时我们习惯性把这个整体叫做数组的地址值
         */
        System.out.println("data = " + data);
        //访问二维数组的元素：通过数组名[下标]访问
        //此时获取的是二维数组中的第一个元素{1,2,3}
        //此时打印输出的是一维数组的地址值
        System.out.println("二维数组第一行元素data[0] = " + data[0]);
        //此时获取的是二维数组第一个元素{1,2,3}的1
        System.out.println("二维数组data第一行第一列的元素data[0][0] = " + data[0][0]);
        //此时获取的是二维数组第一个元素{1,2,3}的3
        System.out.println("二维数组data第一行第三列的元素data[0][2] = " + data[0][2]);
        //此时获取的是二维数组第一个元素{7,8,9}的9
        System.out.println("二维数组data第三行第三列的元素data[2][2] = " + data[2][2]);

        System.out.println("2.二维数组动态初始化与访问");
        //声明和动态初始化二维数组
        double[][] sales = new double[4][3];
        //给二维数组的第一个元素（一维数组）赋值
        sales[0][0] = 4.68;
        sales[0][1] = 4.78;
        sales[0][2] = 4.88;

        //给二维数组的第二个元素（一维数组）赋值
        sales[1][0] = 6.68;
        sales[1][1] = 6.78;
        sales[1][2] = 6.88;

        //给二维数组的第三个元素（一维数组）赋值
        sales[2][0] = 5.68;
        sales[2][1] = 5.78;
        sales[2][2] = 5.88;
        //给二维数组的第四个元素（一维数组）赋值
        sales[3][0] = 7.68;
        sales[3][1] = 7.78;
        sales[3][2] = 7.88;
        System.out.println("二维数组sales第一行第二列的元素sales[0][1] = " + sales[0][1]);
        System.out.println("二维数组sales第二行第三列的元素sales[1][2] = " + sales[1][2]);
        System.out.println("二维数组sales第四行第三列的元素sales[3][2] = " + sales[3][2]);

        //声明和动态初始化二维数组
        String[][] cities = new String[2][];
        //初始化二维数组第一个元素
        cities[0] = new String[4];
        cities[0][0] = "上海";
        cities[0][1] = "北京";
        cities[0][2] = "广州";
        cities[0][3] = "深圳";
        //初始化二维数组第二个元素
        cities[1] = new String[3];
        cities[1][0] = "纽约";
        cities[1][1] = "旧金山";
        cities[1][2] = "波士顿";
        System.out.println("二维数组cities第一行第四列的元素cities[0][3] = " + cities[0][3]);
        System.out.println("二维数组cities第二行第三列的元素cities[1][2] = " + cities[1][2]);
    }
}
