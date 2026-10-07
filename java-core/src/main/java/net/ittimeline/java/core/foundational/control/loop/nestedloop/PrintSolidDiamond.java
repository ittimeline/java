package net.ittimeline.java.core.foundational.control.loop.nestedloop;

/**
 * 嵌套循环案例11-打印实心菱形
 * 需求：打印实心菱形，效果如下图所示
 * <pre>
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 * </pre>
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:48
 * @since Java 25
 */
public class PrintSolidDiamond {
    static void main() {
        //实心菱形上半部分
       /*
                                  行数(i)      星星数量（j)   空格数量(k)
                *                  1            1            4
               ***                 2            3            3
              *****                3            5            2
             *******               4            7            1
            *********              5            9            0
                                                2*i-1        5-i
        */

        //实心菱形总行数
        int rows = 9;
        //实心菱形上半部分行数
        int up = rows / 2 + 1;
        for (int i = 1; i <= up; i++) {
            //先打印空格
            for (int k = 1; k <= up - i; k++) {
                System.out.print(" ");
            }
            //再打印星星
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            //换行
            System.out.println();
        }


        //实心菱形下半部分
        /*
                                   行数（i)     星星数量（j）  空格数量(k)
             *******                1             7            1
              *****                 2             5            2
               ***                  3             3            3
                *                   4             1            4
                                                  2*(5-i)-1    k=i
                                                  下半部分第i行星星数 = 上半部分第(5 - i)行星星数 = 2*(5 - i) - 1

         */
        //实心菱形下半部分行数
        int down = rows / 2;
        for (int i = 1; i <= down; i++) {
            //先打印空格
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            //再打印星星
            for (int j = 1; j <= 2 * (up - i) - 1; j++) {
                System.out.print("*");
            }
            //换行
            System.out.println();
        }
    }
}
