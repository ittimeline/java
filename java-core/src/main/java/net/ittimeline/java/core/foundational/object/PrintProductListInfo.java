package net.ittimeline.java.core.foundational.object;

/**
 * 打印商品列表信息
 * \t 制表符
 * \n 换行符
 * @author tony 18601767221@163.com
 * @version 2026/10/3 13:06
 * @since Java 25
 */
public class PrintProductListInfo {
    static void main() {
        // 关于Java的转义字符
        // \具有转义功能
        //\t 表面上看是两个字符，但是本质上\具有转义功能，\t联合起来表示一个字符：制表符
        IO.println("Name\t Price \tStock");
        IO.println("Apple\t 8.0 \t10000");
        IO.println("Orange\t 5.0 \t10000");
        IO.println("Banana\t 4.0 \t10000");
    }
}
