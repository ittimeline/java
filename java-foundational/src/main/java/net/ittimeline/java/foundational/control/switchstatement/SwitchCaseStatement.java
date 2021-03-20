package net.ittimeline.java.foundational.control.switchstatement;

import java.util.Scanner;

/**
 * switch语句的应用
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/16 20:41
 * @since JDK11
 */
public class SwitchCaseStatement {


    public static void main(String[] args) {

        // 根据用户输入对应的数字,然后输出数字对应的星期

        Scanner input =new Scanner(System.in);

        System.out.println("请输入数字");

        int number =input.nextInt();

        //使用switch/case 实现需求: 根据用户输入对应的数字,然后输出数字对应的星期

        switch (number){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("你输入的数字有误");
                break;

        }



    }
}
