package net.ittimeline.java.core.foundational.array.onedimensional;

/**
 * 一维数组元素访问
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 8:22
 * @since Java21
 */
public class ArrayElementGetSet {
    public static void main(String[] args) {
        //静态初始化基本数据类型元素数组
        double[] prices = new double[]{9999.0, 11999.0, 13999.0};
        //数组名[下标]访问元素，下标的取值范围是0到长度减1
        System.out.println("******************1.访问基本数据类型元素数组******************");
        System.out.println("第一个价格是" + prices[0]);
        System.out.println("第二个价格是" + prices[1]);
        System.out.println("第三个价格是" + prices[2]);
        //动态初始化引用数据类型元素数组
        String[] cities = new String[4];
        //给数组的每个元素赋值
        cities[0] = "北京";
        cities[1] = "上海";
        cities[2] = "广州";
        cities[3] = "深圳";
        System.out.println("******************2.访问引用数据类型元素数组******************");
        System.out.println("第一个城市是" + cities[0]);
        System.out.println("第二个城市是" + cities[1]);
        System.out.println("第三个城市是" + cities[2]);
        System.out.println("第四个城市是" + cities[3]);
    }
}
