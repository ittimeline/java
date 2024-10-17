package net.ittimeline.java.core.foundational.control.loop.nestedloop;

/**
 * 九九乘法表
 * 需求：打印九九乘法表，效果如下所示
 * 1 * 1 = 1
 * 1 * 2 = 2	2 * 2 = 4
 * 1 * 3 = 3	2 * 3 = 6	3 * 3 = 9
 * 1 * 4 = 4	2 * 4 = 8	3 * 4 = 12	4 * 4 = 16
 * 1 * 5 = 5	2 * 5 = 10	3 * 5 = 15	4 * 5 = 20	5 * 5 = 25
 * 1 * 6 = 6	2 * 6 = 12	3 * 6 = 18	4 * 6 = 24	5 * 6 = 30	6 * 6 = 36
 * 1 * 7 = 7	2 * 7 = 14	3 * 7 = 21	4 * 7 = 28	5 * 7 = 35	6 * 7 = 42	7 * 7 = 49
 * 1 * 8 = 8	2 * 8 = 16	3 * 8 = 24	4 * 8 = 32	5 * 8 = 40	6 * 8 = 48	7 * 8 = 56	8 * 8 = 64
 * 1 * 9 = 9	2 * 9 = 18	3 * 9 = 27	4 * 9 = 36	5 * 9 = 45	6 * 9 = 54	7 * 9 = 63	8 * 9 = 72	9 * 9 = 81
 * 分析
 * ● 九九乘法表有9行
 * ● 九九乘法表的列数小于等于行数，列数依次递增
 * ● 九九乘法表的每一列显示的内容是 列数 * 行数 = （列数*行数）
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 21:44
 * @since Java21
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d * %d = %d\t", j, i, j * i);
            }
            System.out.println();
        }
    }
}
