package net.ittimeline.java.core.foundational.control.branch.ifstatement;

import java.util.Scanner;

/**
 * 单分支结构if语句使用
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 7:19
 * @since Java21
 */
public class IfStatement {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的年龄");
        int age = scanner.nextInt();
        //age > = 18 是关系表达式，因为>=是关系运算符，关系表达式的结果是boolean类型，所以又称为boolean表达式
        if (age >= 18) {
            //语句块，目前只有一条语句
            System.out.println("恭喜你已经成年了，可以办理信用卡");
        }
        //关闭Scanner
        scanner.close();
        System.out.println("程序即将正常退出");
    }
}
