package net.ittimeline.java.core.foundational.syntax.variable.type.reference;

import java.util.Scanner;

/**
 * 求和
 * 需求：读取用户从键盘输入的两个整数并求和
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 18:49
 * @since Java21
 */
public class ScannerIntGetSum {
    public static void main(String[] args) {
        //提示用户从键盘输入一个整数
        System.out.println("请输入第一个整数");
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        //接收数据
        //接收用户从键盘输入的第一个整数，并且赋值给firstNumber
        int firstNumber = scanner.nextInt();
        System.out.println("请输入第二个整数");
        //接收用户从键盘输入的第二个整数，并且赋值给secondNumber
        int secondNumber = scanner.nextInt();
        //两个从键盘输入的整数求和后赋值给sum
        int sum = firstNumber + secondNumber;
        System.out.println("两个整数的和是" + sum);
        //关闭资源
        scanner.close();
    }
}
