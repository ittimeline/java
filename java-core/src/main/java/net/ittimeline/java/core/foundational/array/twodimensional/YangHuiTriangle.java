package net.ittimeline.java.core.foundational.array.twodimensional;

/**
 * 二维数组案例3-杨辉三角
 * 需求：打印10行杨辉三角，效果如下图所示
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 5 1
 * 1 6 15 20 15 6 1
 * 1 7 21 35 35 21 7 1
 * 1 8 28 56 70 56 28 8 1
 * 1 9 36 84 126 126 84 36 9 1
 * 分析
 * ● 第一行有1个元素，第n行有n个元素
 * ● 每一行的第一个元素和最后一个元素都是1
 * ● 从第三行开始，每行的第2个元素到倒数第2个元素的范围内，每个元素等于上一行的同一列与上一行同一列左边的一列之和
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 8:50
 * @since Java 25
 */
public class YangHuiTriangle {
    static void main() {
        //1.给二维数组赋值
        int rows = 10;
        //动态初始化二维数组
        int[][] arr = new int[rows][];
        for (int i = 0; i < arr.length; i++) {
            //第一行有1个元素，第n行有n个元素
            arr[i] = new int[i + 1];
            for (int j = 0; j < arr[i].length; j++) {
                //每一行的第一个元素和最后一个元素都是1
                if (j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = 1;
                }
                //从第三行开始，每行的第2个元素到倒数第2个元素的范围内，每个元素等于上一行的同一列与上一行同一列左边的一列之和
                else if (i >= 2) {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
            }
        }
        //2.遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
