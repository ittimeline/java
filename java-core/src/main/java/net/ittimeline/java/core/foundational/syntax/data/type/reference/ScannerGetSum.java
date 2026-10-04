package net.ittimeline.java.core.foundational.syntax.data.type.reference;

import java.util.Scanner;

/**
 * Scanner案例-求和
 * 需求：读取用户从键盘输入的两个整数并求和
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 13:45
 * @since Java 25
 */
public class ScannerGetSum {
    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        //提示用户输入第一个整数
        System.out.println("请输入第一个整数");
        //接收数据
        int firstNumber = scanner.nextInt();

        //提示用户输入第二个整数
        System.out.println("请输入第二个整数");
        int secondNumber = scanner.nextInt();
        //求和
        int sum = firstNumber + secondNumber;
        System.out.println("两个整数的和是" + sum);

        //关闭资源
        scanner.close();
    }
}
