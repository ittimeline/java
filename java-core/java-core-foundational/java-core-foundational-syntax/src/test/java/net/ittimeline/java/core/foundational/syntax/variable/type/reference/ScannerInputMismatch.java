package net.ittimeline.java.core.foundational.syntax.variable.type.reference;

import java.util.Scanner;

/**
 * 数据类型不匹配问题
 * Scanner类在读取数据的时候应该要注意键盘输入的数据类型和Scanner读取的数据类型保持一致，如果不一致会引发InputMismatchException异常
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 21:33
 * @since Java21
 */
public class ScannerInputMismatch {
    public static void main(String[] args) {
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
