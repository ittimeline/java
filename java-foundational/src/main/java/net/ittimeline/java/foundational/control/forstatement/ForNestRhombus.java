package net.ittimeline.java.foundational.control.forstatement;

/**
 * 打印菱形
 * 1. 菱形一共有9行,每行由若干个空格和星号组成,星号和星号也是有空格隔开的
 * 2. 菱形也是一个二维结构,也就是有行数和列数,自然而然就想到了嵌套for循环,外层循环控制行数,内层循环控制列数
 * 3. 由于前面5行的星号数量是递增的,后面4行星号数量是递减的,因此需要拆分,由两个平级的嵌套for循环来完成
 * 4. 前面5行 空格数量递减,星号数量递增  第一个嵌套的for循环,   内层循环需要两个平级for循环 ,一个负责打印空格,一个负责打印星号
 *    1. 第一行 4个空格 1个星号组成
 *    2. 第二行 3个空格 2个星号组成
 *    3. 第三行 2个空格 3个星号组成
 *    4. 第四行 1个空格 4个星号组成
 *    5. 第五行 0个空格 5个星号组成
 * 5. 后面4行 空格数量递增,星号数量递减   第二个嵌套的for循环  内层循环需要两个平级for循环 ,一个负责打印空格,一个负责打印星号
 *    1. 第一行 1个空格 4个星号组成
 *    2. 第二行 2个空格 3个星号组成
 *    3. 第三行 3个空格 2个星号组成
 *    4. 第四行 4个空格 1个星号组成
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/19 11:23
 * @since JDK11
 */
public class ForNestRhombus {


    public static void main(String[] args) {


        int row=10;

        // 第一步 打印前面5行

        //外层循环控制行数
        for (int i = 0; i <row ; i++) {

            //先打印空格
            for (int j = 0; j <row-1-i ; j++) {
                System.out.print(" ");
            }

            //再打印星号
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }

            //每次打印完星号和空格后换行
            System.out.println();


        }

        //第二步

        //外层循环控制行数
        for (int i = 0; i < row-1; i++) {

            //先打印空格

            for (int j = 0; j <=i ; j++) {
                System.out.print(" ");
            }

            //再打印星号
            for (int j = 0; j <row-1-i ; j++) {
                System.out.print("* ");
            }

            //每次打印完星号和空格后换行
            System.out.println();

        }







    }
}
