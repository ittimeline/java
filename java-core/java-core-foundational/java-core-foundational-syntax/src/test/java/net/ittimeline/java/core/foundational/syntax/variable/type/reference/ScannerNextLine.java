package net.ittimeline.java.core.foundational.syntax.variable.type.reference;

import java.util.Scanner;

/**
 * next()和nextLine()的区别
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 18:56
 * @since Java21
 */
public class ScannerNextLine {
    public static void main(String[] args) {
        System.out.println("请输入内容");
        //创建Scanner对象
        //System.in 标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        String contentWithNextLine = scanner.nextLine();
        System.out.println("nextLine() 读取你输入的内容是" + contentWithNextLine);
        //关闭Scanner
        scanner.close();
    }
}
