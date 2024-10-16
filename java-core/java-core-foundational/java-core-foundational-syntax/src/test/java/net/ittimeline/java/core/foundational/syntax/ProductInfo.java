package net.ittimeline.java.core.foundational.syntax;

/**
 * 使用变量存储商品信息
 * 需求：商品信息包括品牌、型号、版本、颜色、价格，要求使用合适数据类型的变量存储并输出
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 22:27
 * @since Java21
 */
public class ProductInfo {
    public static void main(String[] args) {
        String brand = "Apple";
        String model = "iPhone15 Pro Max";
        String version = "1TB";
        String color = "黑色钛金属";
        double price = 13999.00;
        System.out.println("商品信息如下");
        System.out.println("品牌：" + brand);
        System.out.println("型号：" + model);
        System.out.println("版本：" + version);
        System.out.println("颜色：" + color);
        System.out.println("价格：" + price);
    }
}
