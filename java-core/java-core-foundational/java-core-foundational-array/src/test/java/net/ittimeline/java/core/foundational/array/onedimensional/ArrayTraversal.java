package net.ittimeline.java.core.foundational.array.onedimensional;

/**
 * 一维数组遍历
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 8:26
 * @since Java21
 */
public class ArrayTraversal {
    public static void main(String[] args) {
        //静态初始化基本数据类型元素数组
        double[] prices = new double[]{9999.0, 11999.0, 13999.0};
        System.out.println("prices数组的长度是 " + prices.length);
        //数组名[下标]访问元素，下标的取值范围是0到长度减1
        System.out.println("******************1.遍历基本数据类型元素数组******************");
        for (int i = 0; i < prices.length; i++) {
            System.out.println("第" + (i + 1) + "个价格是" + prices[i]);
        }
        //动态初始化引用数据类型元素数组
        String[] cities = new String[4];
        System.out.println("cities数组的长度是 " + cities.length);
        //给数组的每个元素赋值
        cities[0] = "北京";
        cities[1] = "上海";
        cities[2] = "广州";
        cities[3] = "深圳";
        System.out.println("******************2.遍历引用数据类型元素数组******************");
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("第%d个城市是%s\n", (i + 1), cities[i]);
        }
    }
}
