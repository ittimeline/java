package net.ittimeline.java.core.foundational.array.twodimensional;

/**
 * 二维数组遍历
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 10:34
 * @since Java21
 */
public class ArrayTraversal {
    public static void main(String[] args) {
        //1.静态初始化二维数组
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("二维数组numbers的长度是" + numbers.length);
        System.out.println("二维数组numbers的第一个元素的长度是" + numbers[0].length);
        System.out.println("二维数组numbers的第二个元素的长度是" + numbers[1].length);
        System.out.println("二维数组numbers的第三个元素的长度是" + numbers[2].length);
        System.out.println("******************1.遍历二维数组numbers******************");
        //外层循环控制行数,遍历每个元素（一维数组）
        for (int i = 0; i < numbers.length; i++) {
            //内层循环控制列数，遍历每个一维数组的元素
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + "\t");
            }
            //换行
            System.out.println();
        }

        //2.声明和动态初始化二维数组
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
        System.out.println("二维数组cities的长度是" + cities.length);
        System.out.println("二维数组cities的第一个元素的长度是" + cities[0].length);
        System.out.println("二维数组cities的第二个元素的长度是" + cities[1].length);
        System.out.println("******************2.遍历二维数组cities******************");
        //外层循环控制行数,遍历每个元素（一维数组）
        for (int i = 0; i < cities.length; i++) {
            //内层循环控制列数，遍历每个一维数组的元素
            for (int j = 0; j < cities[i].length; j++) {
                System.out.print(cities[i][j] + " ");
            }
            //换行
            System.out.println();
        }
    }
}
