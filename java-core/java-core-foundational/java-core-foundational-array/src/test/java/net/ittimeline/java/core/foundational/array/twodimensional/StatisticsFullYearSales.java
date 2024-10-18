package net.ittimeline.java.core.foundational.array.twodimensional;

/**
 * 求全年的总销售额
 * 需求：一家商场每个季度的销售额如下：单位万元。
 * 一季度：20，30，40
 * 二季度：10，35，42
 * 三季度：21，32，49
 * 四季度：51，45，78
 * 要求：分别中四个数组将每一个季度的营业额存储，再把4个数组存储到一个大数组（二维数组）中。求出全年的总销售额
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 10:56
 * @since Java21
 */
public class StatisticsFullYearSales {
    public static void main(String[] args) {
        // 全年总销售额
        int totalSales = 0;
        //定义二维数组保存全年的销售额
        int[][] sales = {{20, 30, 40}, {10, 35, 42}, {21, 32, 49}, {51, 45, 78}};

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                totalSales += sales[i][j];
            }
        }
        System.out.println("全年的总销售额是" + totalSales + "万元");
    }
}
