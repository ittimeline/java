package net.ittimeline.java.core.foundational.syntax.examples;

/**
 * 变量和数据类型案例2：使用变量存储商品信息
 * 需求：商品信息包括品牌、型号、版本、颜色、价格，要求使用合适数据类型的变量存储并输出
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 14:01
 * @since Java 25
 */
public class ProductInfo {
    static void main() {
        String brand = "Apple";
        String model = "iPhone17 Pro Max";
        String version = "1TB";
        String color = "星宇橙色";
        double price = 13929.01;
        System.out.println("*******************商品信息如下*******************");
        System.out.println("品牌：" + brand);
        System.out.println("型号：" + model);
        System.out.println("版本：" + version);
        System.out.println("颜色：" + color);
        System.out.println("价格：" + price);
    }
}
