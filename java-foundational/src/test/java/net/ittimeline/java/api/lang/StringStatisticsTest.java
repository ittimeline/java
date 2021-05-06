package net.ittimeline.java.api.lang;

import java.util.Scanner;

/**
 * 字符串统计
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/28 15:15
 * @since JDK11
 */
public class StringStatisticsTest {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一段字符串");
        String str=input.next();
        //大写字母的个数
        int upperCaseCount=0;
        //小写字母的个数
        int lowerCaseCount=0;
        //数字
        int numberCount=0;

        // 统计字符串中大写字母、小写字母以及这个数字的个数。
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                upperCaseCount++;
            }else if(Character.isLowerCase(ch)){
                lowerCaseCount++;
            }else if(Character.isDigit(ch)){
                numberCount++;
            }
        }
        System.out.printf("你输入的字符串是%s 大写字母的个数是%d 小写字母的个数是%d 数字的个数是%d \n",str,upperCaseCount,lowerCaseCount,numberCount);


    }
}
