package net.ittimeline.java.core.foundational.control.branch.switchstatement;

import java.util.Scanner;

/**
 * 分支结构switch语句使用注意事项4
 * ● break语句是可以省略的， break语句的作用就是用于结束switch case语句，如果没有写break语句，此时就不会结束case 语句，
 * 而是继续往下执行其他case语句，直到遇到了break语句或者是执行到switch case语句结尾，这就是case穿透现象
 * ● default语句是可选的，相当于if else if else语句的else语句，而且default语句可以放在任意位置，但是一般放在最后一个case语句的下面
 * 需求：根据用户输入的数字判断是工作日还是休息日，1-5是工作日，6-7是休息日，其他数字是输入有误
 *
 * @author tony 18601767221@163.com
 * @author tony 18601767221@163.com
 * @version 2024/10/17 15:25
 * @since Java21
 */
public class SwitchStatementWarning4 {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in 标准输入 也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int number = scanner.nextInt();
        switch (number) {
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
        //关闭Scanner
        scanner.close();
    }
}
