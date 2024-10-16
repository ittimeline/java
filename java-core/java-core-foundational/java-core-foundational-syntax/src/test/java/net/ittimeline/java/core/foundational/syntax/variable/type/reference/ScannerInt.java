package net.ittimeline.java.core.foundational.syntax.variable.type.reference;
// ①导入Scanner

import java.util.Scanner;

/**
 * 读取键盘输入整数并输出
 * 需求：读取用户从键盘输入的整数，并打印输出
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 10:04
 * @since Java21
 */
public class ScannerInt {
    public static void main(String[] args) {
        //提示用户从键盘输入一个整数
        System.out.println("请输入你喜欢的数字");
        // ②创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        // ③接收数据
        //接收用户从键盘输入的整数，并且赋值给number
        int number = scanner.nextInt();
        System.out.println("你喜欢的数字是" + number);
        // ④关闭资源
        scanner.close();
    }
}
