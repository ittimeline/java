package net.ittimeline.java.core.foundational.control.loop.nestedloop;

/**
 * 嵌套循环案例3-打印直角三角形
 * 需求：打印直角三角形、倒立的直角三角形
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:42
 * @since Java 25
 */
public class PrintRightTriangle {
    static void main() {
        /*
            直角三角形的特点
                            i（第几行）              j（每一行中*的个数）
             *              1                      1
             **             2                      2
             ***            3                      3
             ****           4                      4
             *****          5                      5
             ******         6                      6
             规律：第n行有n列
         */
        System.out.println("********************************1.打印直角三角形********************************");
        //外层循环控制行数
        int rows = 6;
        for (int i = 1; i <= rows; i++) {
            //内层循环控制列数
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //换行
            System.out.println();
        }


        /*
             倒立直角三角形的特点
                            i（第几行）              j（每一行中*的个数）
             ******         1                       6
             *****          2                       5
             ****           3                       4
             ***            4                       3
             **             5                       2
             *              6                       1
             规律： i + j = 7 ，j = 7 - i，总行数为 6，所以第 i 行的星号数为 6 - i + 1
         */
        System.out.println("********************************2.打印倒立的直角三角形********************************");
        //外层循环控制行数
        for (int i = 1; i <= rows; i++) {
            //内层循环控制列数
            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
