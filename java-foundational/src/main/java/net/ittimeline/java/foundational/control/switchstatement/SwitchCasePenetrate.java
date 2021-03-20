package net.ittimeline.java.foundational.control.switchstatement;

import java.util.Scanner;

/**
 * switch/case穿透现象
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/16 20:58
 * @since JDK11
 */
public class SwitchCasePenetrate {

    public static void main(String[] args) {
        // 根据用户输入的数字判断是休息日还是工作日

        Scanner input =new Scanner(System.in);
        System.out.println("请输入星期数");
        int week= input.nextInt();
        switch (week){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("你的输入有误");
                break;

        }
    }
}
