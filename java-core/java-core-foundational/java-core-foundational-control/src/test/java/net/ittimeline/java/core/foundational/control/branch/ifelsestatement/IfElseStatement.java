package net.ittimeline.java.core.foundational.control.branch.ifelsestatement;

import java.util.Scanner;

/**
 * 双分支结构if else语句使用
 * 需求：判断用户输入的整数是奇数还是偶数
 * 分析：整数如果能被2整除就是偶数，否则就是奇数，0是偶数
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 8:16
 * @since Java21
 */
public class IfElseStatement {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in 标准输入 也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + "是偶数");
        } else {
            System.out.println(number + "是奇数");
        }
        //关闭Scanner
        scanner.close();
    }
}
