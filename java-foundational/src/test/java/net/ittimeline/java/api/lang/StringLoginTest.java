package net.ittimeline.java.api.lang;

import java.util.Scanner;

/**
 * 模拟用户登录
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/28 11:25
 * @since JDK11
 */
public class StringLoginTest {

    final static String userName = "tony";
    final static String password = "666666";
    final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        doLogin(3);
    }

    /**
     * @param count
     */
    public static void doLogin(int count) {
        int maxLoginCount = count;
        for (int i = 0; i < count; i++) {

            System.out.println("请输入用户名");

            String inputUserName = input.next();

            System.out.println("请输入密码");

            String inputPassword = input.next();

            if (userName.equals(inputUserName) && password.equals(inputPassword)) {
                System.out.println("欢迎登录淘宝");
                break;
            } else {
                System.out.println("用户名或者密码错误，登录失败");
                maxLoginCount--;
                System.out.println("你还剩下" + maxLoginCount + "次登录机会");
            }
        }
    }


}
