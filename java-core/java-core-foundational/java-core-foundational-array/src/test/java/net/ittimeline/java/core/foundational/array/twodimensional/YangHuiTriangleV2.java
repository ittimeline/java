package net.ittimeline.java.core.foundational.array.twodimensional;

/**
 * 杨辉三角
 * 1
 * 1	1
 * 1	2	1
 * 1	3	3	1
 * 1	4	6	4	1
 * 1	5	10	10	5	1
 * 1	6	15	20	15	6	1
 * 1	7	21	35	35	21	7	1
 * 1	8	28	56	70	56	28	8	1
 * 1	9	36	84	126	126	84	36	9	1
 * 分析
 * 1. 第一行有1个元素，第n行有n个元素
 * 2. 每一行的第一个元素和最后一个元素都是1
 * 3. 从第三行开始，每行的第2个元素到倒数第2个元素的范围内，每个元素等于上一行的同一列与上一行同一列左边的一列之和
 * 实现方式2
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 11:30
 * @since Java21
 */
public class YangHuiTriangleV2 {
    public static void main(String[] args) {
        int row = 10;
        //动态初始化二维数组 此时只能确定二维数组的行数
        int[][] arr = new int[row][];
        //外层循环控制行数
        for (int i = 0; i < arr.length; i++) {
            //第1行有1列 第n行有n列
            arr[i] = new int[i + 1];
            //每行第一列和最后一列都是1
            arr[i][0] = arr[i][i] = 1;
            //从第三行开始，每行的第2个元素到倒数第2个元素的范围内，每个元素等于上一行的同一列与上一行同一列左边的一列之和
            for (int j = 1; j < arr[i].length - 1; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
            }
        }

        //遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            //换行
            System.out.println();
        }
    }
}
