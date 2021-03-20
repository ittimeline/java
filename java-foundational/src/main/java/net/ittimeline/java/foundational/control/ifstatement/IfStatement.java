package net.ittimeline.java.foundational.control.ifstatement;

import java.util.Scanner;

/**
 * 单分支if语句
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/16 19:08
 * @since JDK11
 */
public class IfStatement {

    public static void main(String[] args) {

        //创建一个Scanner对象
        Scanner input =new Scanner(System.in);

        System.out.println("请输入你的年龄");

        //接收用户从键盘输入的年龄
        int age =input.nextInt();

        if(age >=18){
            //代码块  语句块
            System.out.println("你成年了,可以来网吧上网");
        }

    }
}
