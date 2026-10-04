package net.ittimeline.java.core.foundational.syntax.data.type.reference;

import java.util.Scanner;

/**
 * nextInt()和nextLine()混合使用问题
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 13:48
 * @since Java 25
 */
public class ScannerNextIntNextLine {
    static void main() {
        //创建Scanner对象
        //System.in 标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入你的年龄");
        //nextInt()只会读取25这个整数，不会消费用户按下的回车符(\n 或者\r\n)。这个回车符依然留在输入缓冲区中
        int age = scanner.nextInt();
        //使用nextLine()方法读取并且丢弃输入缓冲区的回车换行符
        scanner.nextLine();

        System.out.println("请输入你的姓名");
        //nextLine()会立即读取输入缓冲区中的回车符，并且返回一个空字符串
        String name = scanner.nextLine();

        System.out.println("你的年龄：" + age);
        System.out.println("你的姓名：" + name);


        //关闭资源
        scanner.close();
    }
}
