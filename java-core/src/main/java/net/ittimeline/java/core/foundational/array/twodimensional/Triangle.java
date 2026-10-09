package net.ittimeline.java.core.foundational.array.twodimensional;

/**
 * 二维数组案例2-数字图形
 * 需求：用二维数组完成如下数字图形的存储和打印输出
 * 10
 * 10 20
 * 10 20 30
 * 10 20 30 40
 * 分析：
 * ● 总共有 4 行。
 * ● 第 1 行 1 个数字，第 2 行 2 个数字，依次递增。
 * ● 每行的数字都是 10 的倍数，从 10 开始，依次 20, 30, 40 ...
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 8:49
 * @since Java 25
 */
public class Triangle {
    static void main() {
        //准备构建一个不规则的二维数组（行数固定，列数不固定的）
        int row = 4;
        int[][] array = new int[row][];
        //外层循环控制行
        for (int i = 0; i < array.length; i++) {
            //每行的列数=i+1
            array[i] = new int[i + 1];
            //内层循环控制列
            for (int j = 0; j < array[i].length; j++) {
                //按照10的倍速递增赋值
                //j从0开始，对应第一个数字是10
                array[i][j] = 10 * (j + 1);

                //打印数组元素
                System.out.print(array[i][j] + " ");
            }
            //换行
            System.out.println();
        }

    }
}
