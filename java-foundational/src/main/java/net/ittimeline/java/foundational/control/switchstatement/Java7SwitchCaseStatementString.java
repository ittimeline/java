package net.ittimeline.java.foundational.control.switchstatement;

import java.util.Scanner;

/**
 * JDK7新特性之switch/case使用String
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/16 20:49
 * @since JDK11
 */
public class Java7SwitchCaseStatementString {

    public static void main(String[] args) {

        // 需求:根据不同的性别生成不同的招呼用语

        String greeting="你好,";

        Scanner input =new Scanner(System.in);

        System.out.println("请输入你的性别 男/女");

        //接收用户在键盘输入的性别保存到gender变量中
        String gender= input.next();

        if(gender!=null){
            // switch/case语句等价if/else if/else
            switch (gender){
                case "男":
                    greeting+="先生";
                    break;

                case "女":
                    greeting+="女士";
                    break;

                default:
                    greeting+="顾客";
                    break;
            }
        }



        System.out.println(greeting);


    }
}
