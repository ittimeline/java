package net.ittimeline.java.foundational.control.ifstatement;

import java.util.Scanner;

/**
 * 双分支if/else语句
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/16 19:14
 * @since JDK11
 */
public class IfElseStatement {

    public static void main(String[] args) {

        // 判断用户从键盘输入的数字是奇数还是偶数

        Scanner input = new Scanner(System.in);

        System.out.println("请输入一个非0的整数");

        //接收用户从键盘输入的整数
        int number = input.nextInt();

        // if和else的代码块只有一条语句可以省略{},但是会降低程序的可读性,因此不推荐省略{}
        if (number % 2 == 0) {
            System.out.printf("你输入的%d是偶数\n", number);
        } else {
            System.out.printf("你输入的%d是奇数\n", number);
        }

    }
}
