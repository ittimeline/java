package net.ittimeline.java.core.foundational.control.branch.ifelsestatment;

import java.util.Scanner;

/**
 * 双分支结构if else语句语法格式和执行流程
 * if(布尔表达式){
 * 语句块1
 * }else{
 * 语句块2
 * }
 * 如果布尔表达式结果为true，执行语句块1，否则执行语句块2
 * 二选一
 * 双分支结构if else语句使用
 * 需求：用户从键盘输入一个整数，判断用户输入的是奇数还是偶数
 * 分析：整数如果能够被2整除那么就是偶数，否则就是奇数
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 11:35
 * @since Java 25
 */
public class IfElseStatement {
    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
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
