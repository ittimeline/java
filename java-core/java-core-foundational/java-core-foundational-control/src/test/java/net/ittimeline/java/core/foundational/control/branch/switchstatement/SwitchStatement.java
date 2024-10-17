package net.ittimeline.java.core.foundational.control.branch.switchstatement;

import java.util.Scanner;

/**
 * 分支结构switch语句使用
 * 需求：根据用户输入的数字判断对应的星期几，例如用户输入数字1，那么就输出星期一，依此类推，如果不是1-7之间的数字提示输入有误
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 11:30
 * @since Java21
 */
public class SwitchStatement {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字（1~7）");
        int number = scanner.nextInt();
        switch (number) {
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
                System.out.println("星期天");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
        //关闭Scanner
        scanner.close();
    }
}
