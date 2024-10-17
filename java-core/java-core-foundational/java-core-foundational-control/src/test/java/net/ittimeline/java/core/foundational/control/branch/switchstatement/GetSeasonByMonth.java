package net.ittimeline.java.core.foundational.control.branch.switchstatement;

import java.util.Scanner;

/**
 * 根据月份获取季节
 * 需求：提示用户从键盘输入月份,然后根据月份获取季节
 * ● 3月,4月,5月是春天
 * ● 6月,7月,8月是夏天
 * ● 9月,10月,11月是秋天
 * ● 12月,1月,2月是冬天
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 15:33
 * @since Java21
 */
public class GetSeasonByMonth {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in 标准输入 也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = scanner.nextInt();
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.printf("%d月份是春天", month);
                break;
            case 6:
            case 7:
            case 8:
                System.out.printf("%d月份是夏天", month);
                break;
            case 9:
            case 10:
            case 11:
                System.out.printf("%d月份是秋天", month);
                break;
            case 12:
            case 1:
            case 2:
                System.out.printf("%d月份是冬天", month);
                break;
            default:
                System.out.println("你的输入有误");
                break;
        }
        //关闭Scanner
        scanner.close();
    }
}
