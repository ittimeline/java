package net.ittimeline.java.foundational.control.dowhilestatement;

import java.util.Scanner;

/**
 * do/while循环应用
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/17 18:37
 * @since JDK11
 */
public class DoWhileStatementPositiveNegative {

    public static void main(String[] args) {



        // 需求: 读取用户从键盘输入的正整数和负整数的个数,输入0时程序退出

        // 1. 创建Scanner对象
        Scanner input =new Scanner(System.in);

        //2. 定义变量存储 正整数的个数和负整数的个数
        int positiveCount =0;

        int negativeCount=0;

        //3 循环读取用户输入的数字,直到0结束循环
        int number =1;
        do{
            //提示用户输入相关数据
            System.out.println("请输入一个整数");
            //接收用户从键盘输入的整数
            number=input.nextInt();

            if(number>0){
                positiveCount++;
            }else if(number<0){
                negativeCount++;
            }

        }while (number!=0);

        System.out.println("键盘输入的正整数数量是"+positiveCount+"键盘输入的负整数的个数是"+negativeCount);

    }
}
