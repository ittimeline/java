package net.ittimeline.java.foundational.control.switchstatement;

import java.util.Scanner;

/**
 * 使用swith/case语句的穿透现象完成根据月份判断季节
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/16 21:04
 * @since JDK11
 */
public class SwitchCasePenetrateMonthSeason {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("请输入月份");

        int month=input.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("冬天");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春天");
                break;
            case 6:
            case 7:
            case 8:
                //业务代码
                System.out.println("夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋天");
                break;
            default:
                System.out.println("你的输入有误");
                break;
        }
    }
}
