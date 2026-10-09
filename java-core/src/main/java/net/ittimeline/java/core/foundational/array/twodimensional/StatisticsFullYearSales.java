package net.ittimeline.java.core.foundational.array.twodimensional;

/**
 * 二维数组案例1-求全年的总销售额
 * 需求：一家商场每个季度的销售额如下：单位万元。
 * 一季度：20，30，40
 * 二季度：10，35，42
 * 三季度：21，32，49
 * 四季度：51，45，78
 * 要求：求出全年的总销售额
 * 分析：全年销售额可以用二维数组表示，每一行代表一个季度，每一列代表该季度中的一个月，数组元素就是某月具体的销售额。
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 8:45
 * @since Java 25
 */
public class StatisticsFullYearSales {
    static void main() {
        //全年总销售额
        int totalSales = 0;
        //定义二维数组保存全年的销售额
        int[][] sales = {{20, 30, 40}, {10, 35, 42}, {21, 32, 49}, {51, 45, 78}};

        //遍历二维数组，外层循环控制季度（行）
        for (int i = 0; i < sales.length; i++) {
            // 内层循环控制该季度的月份（列）
            for (int j = 0; j < sales[i].length; j++) {
                // 累加每个月的销售额
                totalSales += sales[i][j];
            }
        }
        //输出全年总销售额
        System.out.println("全年的总销售额是" + totalSales + "万元");
    }
}
