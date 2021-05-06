package net.ittimeline.java.api.text;

import net.ittimeline.java.api.util.DateTimeUtils;

import java.util.Date;
import java.util.Scanner;

/**
 * 用户从键盘输入出生日期，计算出生的天数
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/2 17:31
 * @since JDK11
 */
public class CalculatorBirthdayTest {

    public static void main(String[] args) {

        System.out.println("请输入你的生日 例如1991年01月01日");
        Scanner input = new Scanner(System.in);
        //接收用户输入的日期字符串
        String source = input.nextLine();
        Date birthday = DateTimeUtils.str2Date(source, DateTimeUtils.STANDARD_DATE_FORMAT);
        Date systemDate = new Date();
        long days = (DateTimeUtils.calculatorTime(birthday.getTime(), systemDate.getTime())) / 1000 / 86400;
        System.out.printf("你的出生日期是%s 你已经来到这个世界上%d天了 \n", source, days);


    }
}
