package net.ittimeline.java.core.foundational.control.branch.ifelsestatement;

import java.util.Scanner;

/**
 * QQ登录
 * 需求：提示用户输入QQ账号和密码，如果账号是1079351401，并且密码是124578963go..则提示登录成功，否则提示账号或密码错误，登录失败
 * 分析：判断用户输入的账号、密码和正确的账号、密码是否相等，相等就提示登录成功，不相等就提示账号、密码错误，登录失败
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 9:51
 * @since Java21
 */
public class QQLogin {
    public static void main(String[] args) {
        //正确的账号和密码
        int targetAccount = 1079351401;
        String targetPassword = "124578963go..";
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入QQ账号");
        int account = scanner.nextInt();
        System.out.println("请输入密码");
        String password = scanner.next();

        if (account == targetAccount && password.equals(targetPassword)) {
            System.out.println("登录成功");
        } else {
            System.out.println("账号密码错误，登录失败");
        }

        //关闭Scanner
        scanner.close();
    }
}
