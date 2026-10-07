package net.ittimeline.java.core.foundational.control.loop.nestedloop;

/**
 * 嵌套循环案例12-打印空心菱形
 * 需求：打印空心菱形，效果如下图所示
 * <pre>
 *     *
 *    * *
 *   *   *
 *  *     *
 * *       *
 *  *     *
 *   *   *
 *    * *
 *     *
 * </pre>
 * 分析：打印空心菱形的核心思路是：在实心菱形基础上，只打印每行的第一列和最后一列星号，中间位置用空格填充，整体仍拆分为上半部分和下半部分处理
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:49
 * @since Java 25
 */
public class PrintHollowDiamond {

    static void main() {
        //空心菱形上半部分
        /*
                                 行数(i)        星星位置（j）        空格数量(k)
                *                  1            仅首尾（1）         4
               * *                 2            仅首尾（1,3）       3
              *   *                3            仅首尾（1,5）       2
             *     *               4            仅首尾（1,7）       1
            *       *              5            仅首尾（1,9）       0
                                                2*i-1             5-i
         */

        //空心菱形总行数
        int rows = 9;
        //空心菱形上半部分总行数
        int up = rows / 2 + 1;
        //外层循环控制行数
        for (int i = 1; i <= up; i++) {
            //内层循环控制列数
            //先打印空格
            for (int k = 1; k <= up - i; k++) {
                System.out.print(" ");
            }
            //再打印星星
            for (int j = 1; j <= 2 * i - 1; j++) {
                //每行首尾（第一列和最后一列）打印星星
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                }
                //其他列打印空格
                else {
                    System.out.print(" ");
                }
            }
            //换行
            System.out.println();
        }


        //空心菱形下半部分
        /*
                                  行数（i)     星星位置（j）          空格数量(k)
             *     *                1         仅首尾（1,7）          1
              *   *                 2         仅首尾（1,5）          2
               * *                  3         仅首尾（1,3）          3
                *                   4         仅首尾（1）            4
                                              2*(5-i)-1            k=i
         */

        int down = rows / 2;
        //外层循环控制行数
        for (int i = 1; i <= down; i++) {
            //内层循环控制列数
            //先打印空格
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            //再打印星星
            for (int j = 1; j <= 2 * (up - i) - 1; j++) {
                //每行首尾（第一列和最后一列）打印星星
                if (j == 1 || j == 2 * (up - i) - 1) {
                    System.out.print("*");
                }
                //其他列打印空格
                else {
                    System.out.print(" ");
                }
            }
            //换行
            System.out.println();
        }

    }

}
