package net.ittimeline.java.core.foundational.control.branch.switchstatement;

import java.util.Scanner;

/**
 * switch语句语法格式和执行流程
 * switch(表达式){
 *     case 字面量值1:
 *         语句块1;
 *         break;
 *     case 字面量值2:
 *         语句块2;
 *         break;
 *     case 字面量值3:
 *         语句块3;
 *         break;
 *     default:
 *         语句块n+1;
 *         break;
 * }
 *
 * 首先根据表达式中的值，依次匹配case语句的字面量值。
 * 一旦表达式的值与某个case语句中的字面量相等，那么就执行此case语句的语句块，语句块执行完成后会遇到两种情况
 * ● 情况1：遇到break则执行break后跳出当前switch语句
 * ● 情况2：没有遇到break则继续执行其后的case语句，此时会发生case穿透现象，直到遇到break或者执行完所有的case语句以及default语句则结束（退出）当前的switch语句
 *
 * 分支结构switch语句使用
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 13:25
 * @since Java 25
 */
public class SwitchStatement {
    static void main() {
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
