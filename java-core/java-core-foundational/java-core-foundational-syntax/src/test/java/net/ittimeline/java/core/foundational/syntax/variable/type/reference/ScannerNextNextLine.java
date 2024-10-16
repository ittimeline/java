package net.ittimeline.java.core.foundational.syntax.variable.type.reference;

import java.util.Scanner;

/**
 * next()和nextLine()混合使用
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 21:03
 * @since Java21
 */
public class ScannerNextNextLine {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in 标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的年龄");
        //nextInt()方法不会读取回车换行符，只会读取数字，不会读取后面的换行符。
        int age = scanner.nextInt();
        //使用nextLine()方法读取并丢弃回车换行符，这一步非常重要，否则接下来的nextLine()会读取到这个换行符
        scanner.nextLine();
        System.out.println("请输入你的姓名");
        String name = scanner.nextLine();
        //输出用户的年龄和姓名
        System.out.println("你的年龄：" + age);
        System.out.println("你的姓名：" + name);
        //关闭Scanner
        scanner.close();
    }
}
