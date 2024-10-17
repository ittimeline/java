package net.ittimeline.java.core.foundational.control.loop.breakstatement;

import java.util.Scanner;

/**
 * 淘宝用户登录
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 20:17
 * @since Java21
 */
public class TaoBaoUserLogin {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in 标准输入 也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        //正确的用户名和密码
        String targetUserName = "tony";
        String targetPassword = "124578963..go";

        int count = 3;
        while (count > 0) {
            System.out.println("请输入用户名");
            String inputUserName = scanner.next();
            System.out.println("请输入密码");
            String inputPassword = scanner.next();
            count--;
            //登录成功
            if (targetUserName.equals(inputUserName) && targetPassword.equals(inputPassword)) {
                System.out.println("欢迎登录淘宝网站");
                break;
            }
            //登录失败
            else {
                if (count > 0) {
                    System.out.println("用户名密码错误，登录失败，你还有" + count + "次机会");
                } else {
                    System.out.println("用户名密码错误，3次登录失败，账号被锁定，程序退出");
                }
            }
        }
        //关闭Scanner
        scanner.close();
    }
}
