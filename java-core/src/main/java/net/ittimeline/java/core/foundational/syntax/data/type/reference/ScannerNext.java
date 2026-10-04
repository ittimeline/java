package net.ittimeline.java.core.foundational.syntax.data.type.reference;

import java.util.Scanner;

/**
 * next()和nextLine()的区别
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 13:47
 * @since Java 25
 */
public class ScannerNext {
    static void main() {
        System.out.println("请输入内容");
        //创建Scanner对象
        //System.in 标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        String contentWithNext = scanner.next();
        System.out.println("next() 读取你输入的内容是" + contentWithNext);
        //关闭Scanner
        scanner.close();
    }
}
