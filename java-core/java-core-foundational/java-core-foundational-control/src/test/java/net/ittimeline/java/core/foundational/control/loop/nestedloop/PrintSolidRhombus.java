package net.ittimeline.java.core.foundational.control.loop.nestedloop;

/**
 * 打印实心菱形
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 22:08
 * @since Java21
 */
public class PrintSolidRhombus {
    public static void main(String[] args) {

    /*
                菱形的特点
                上半部分
                                                        i（第几行）                          j（每行空格的个数）                    k（每行*空格的个数）
                   *                                        1                                   8                                   1
                 * * *                                      2                                   6                                   3
               * * * * *                                    3                                   4                                   5
             * * * * * * *                                  4                                   2                                   7
           * * * * * * * * *                                5                                   0                                   9

           i * 2 +j = 10, j = 10 - i *2
           k = 2 * i -1


                下半部分
             * * * * * * *                                  1                                   2                                   7
               * * * * *                                    2                                   4                                   5
                 * * *                                      3                                   6                                   3
                   *                                        4                                   8                                   1

            j = i * 2
            k= totalRows-(2 * i)
         */


        //菱形上半部分
        int upRow = 5;

        //外层循环控制行数
        for (int i = 1; i <= upRow; i++) {
            //内层循环控制列数
            //先打印空格
            for (int j = 1; j <= upRow * 2 - (i * 2); j++) {
                System.out.print(" ");
            }
            //再打印*空格
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            //换行
            System.out.println();

        }


        //菱形下半部分
        int downRow = upRow - 1;
        //菱形总行数=上半部分行数+下半部分行数
        int totalRow = upRow + downRow;
        //外层循环控制行数
        for (int i = 1; i <= downRow; i++) {
            //内层循环控制列数
            //先打印空格
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print(" ");
            }
            //再打印*空格
            for (int k = 1; k <= totalRow - 2 * i; k++) {
                System.out.print("* ");
            }
            //换行
            System.out.println();
        }
    }
}
