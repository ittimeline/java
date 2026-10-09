package net.ittimeline.java.core.foundational.array.twodimensional;

/**
 * 二维数组遍历
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 8:42
 * @since Java 25
 */
public class ArrayTraversal {
    static void main() {
        //1.静态初始化二维数组
        int[][] numbers = {{10, 20}, {30, 40, 50}, {70}};
        System.out.println("二维数组numbers的长度是" + numbers.length);
        System.out.println("二维数组numbers的第一个元素的长度是" + numbers[0].length);
        System.out.println("二维数组numbers的第二个元素的长度是" + numbers[1].length);
        System.out.println("二维数组numbers的第三个元素的长度是" + numbers[2].length);
        System.out.println("******************1.遍历二维数组numbers******************");
        //外层循环遍历每一行（即每一个一维数组）
        for (int i = 0; i < numbers.length; i++) {
            //内层循环遍历当前行中的每一个元素
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + "\t");
            }
            //换行
            System.out.println();
        }

        //2.动态初始化二维数组
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
        //外层循环遍历每一行（即每一个一维数组）
        for (int i = 0; i < cities.length; i++) {
            //内层循环遍历当前行中的每一个元素
            for (int j = 0; j < cities[i].length; j++) {
                System.out.print(cities[i][j] + " ");
            }
            //换行
            System.out.println();
        }

    }
}
