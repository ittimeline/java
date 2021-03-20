package net.ittimeline.java.foundational.control.whilestatement;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/18 7:32
 * @since JDK11
 */
public class WhileStatementGuessNumber {
    public static void main(String[] args) {
        //产生一个1-100之间的随机数
        Random random =new Random();
        int randNumber=random.nextInt(100)+1;
        Scanner input =new Scanner(System.in);
        //计数器
        int count =0;

        //因为不知道多少次能猜中,因此这里需要先使用死循环
        while(true){
            System.out.println("请输入你猜的数字");
            //接收用户从键盘输入猜的数字赋值给guessNumber变量
            int guessNumber=input.nextInt();
            //猜一次,计数器就加1
            count++;
            if(guessNumber>randNumber){
                System.out.println("你猜的数字太大了,请重新再猜");
            }else if(guessNumber<randNumber){
                System.out.println("你猜的数字太小了,请重新再猜");
            }else{
                System.out.printf("恭喜你猜中了,随机数是%d,你猜的数字是%d,你一共猜了%d次\n",randNumber,guessNumber,count);
                //退出循环
                break;
            }
        }
    }
}
