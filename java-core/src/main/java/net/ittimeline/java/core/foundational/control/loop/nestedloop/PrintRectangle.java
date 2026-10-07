package net.ittimeline.java.core.foundational.control.loop.nestedloop;

/**
 * 嵌套循环案例1-打印矩形
 * for循环嵌套
 * 需求：打印5行5列的星星、空格(* )，每个*用空格隔开
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *
 * 分析：二维图形（矩形、直角三角形、菱形）使用两层嵌套循环，外层循环控制行数，内层循环控制列数
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:41
 * @since Java 25
 */
public class PrintRectangle {
    static void main() {
        //①单层循环实现一行五列
        System.out.println("********************************1.单层循环实现一行五列********************************");
        for (int i = 0; i < 5; i++) {
            System.out.print("* ");
        }
        //一行打印完成后换行
        System.out.println();

        //②嵌套循环实现五行五列
        System.out.println("********************************2.嵌套循环实现五行五列********************************");
        //外层循环控制行数
        for (int i = 0; i < 5; i++) {
            //内层循环控制列数
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            //一行打印完成后换行
            System.out.println();
        }

    }
}
