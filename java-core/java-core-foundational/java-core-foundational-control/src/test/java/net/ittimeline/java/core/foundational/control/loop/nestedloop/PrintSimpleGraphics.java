package net.ittimeline.java.core.foundational.control.loop.nestedloop;

/**
 * 打印简单图形
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 21:34
 * @since Java21
 */
public class PrintSimpleGraphics {
    public static void main(String[] args) {
        System.out.println("******************1.打印直角三角形******************");
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
        //外层循环控制行数
        for (int i = 1; i <= 6; i++) {
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
             规律： i + j = 7 ，j = 7 - i
         */
        System.out.println("******************2.打印倒立的直角三角形******************");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print("*");
            }
            System.out.println();

                /*
                    //另一种实现方式
                    for (int j = 7-i; j >=1 ; j--) {
                        System.out.print("* ");
                    }

                    System.out.println();
                 */

        }
    }
}
