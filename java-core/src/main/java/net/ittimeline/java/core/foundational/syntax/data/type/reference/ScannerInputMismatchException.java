package net.ittimeline.java.core.foundational.syntax.data.type.reference;

import java.util.Scanner;

/**
 * Scanner注意事项：数据类型不匹配问题
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 13:47
 * @since Java 25
 */
public class ScannerInputMismatchException {
    static void main() {
        //创建Scanner对象
        //System.in 标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个整数");
        int number = scanner.nextInt();
        System.out.println("你输入的整数是" + number);
        //关闭Scanner
        scanner.close();
    }
}
