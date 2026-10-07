package net.ittimeline.java.core.foundational.control.loop.dowhileloop;

import java.util.Scanner;

/**
 * do while循环案例1-ATM
 * 需求：实现ATM常用功能，包括存款、取款、查看余额以及退出
 * 分析：①存款 ②取款 ③查看余额 ④退出
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:19
 * @since Java 25
 */
public class ATM {
    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        //账户余额
        double balance = 0.0;

        //循环是否结束标记
        boolean flag = true;

        // 使用 do-while 保证菜单至少显示一次
        do {
            System.out.println("*******************************欢迎光临中国工商银行ATM*******************************");
            System.out.println("1.存款");
            System.out.println("2.取款");
            System.out.println("3.显示余额");
            System.out.println("4.退出");
            System.out.println("请选择操作（1~4）");
            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("请输入存款金额");
                    int depositAmount = scanner.nextInt();
                    //更新余额
                    if (depositAmount > 0) {
                        balance += depositAmount;
                    } else {
                        System.out.println("存款金额必须大于0");
                    }
                    break;
                case 2:
                    System.out.println("请输入取款金额");
                    int withdrawalAmount = scanner.nextInt();
                    if (withdrawalAmount < 0) {
                        System.out.println("取款金额有误，取款失败");
                    } else if (withdrawalAmount > balance) {
                        System.out.println("余额不足，取款失败");
                    } else {
                        //更新余额
                        balance -= withdrawalAmount;
                    }
                    break;
                case 3:
                    System.out.printf("当前账户余额是%.2f\n", balance);
                    break;
                case 4:
                    //循环结束
                    flag = false;
                    System.out.println("感谢使用，欢迎下次光临(*^_^*)");
                    break;
                default:
                    System.out.println("你的输入有误");
                    break;
            }
        } while (flag);
        //关闭Scanner
        scanner.close();
    }
}
