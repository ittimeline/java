package net.ittimeline.java.core.foundational.control.loop.breakstatement;

import java.util.Scanner;

/**
 * break语句案例5-淘宝登录
 * 需求：让用户输入指定的账号密码，如果账号密码正确就提示登录成功，否则就提示还剩多少次机会，
 * 一天最多只能登录3次，如果3次登录失败，就锁定账号。
 * 指定的账号密码是 tony / life666666
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:26
 * @since Java 25
 */
public class LoginSystem {
    static void main() {
        // 正确的账号和密码
        final String CORRECT_USERNAME = "tony";
        final String CORRECT_PASSWORD = "life666666";
        final int MAX_ATTEMPTS = 3;

        // 使用 try-with-resources 自动关闭 Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            boolean loginSuccess = false;

            for (int attempt = 1; attempt <= MAX_ATTEMPTS; attempt++) {
                System.out.print("请输入用户名：");
                String userName = scanner.next();
                System.out.print("请输入密码：");
                String password = scanner.next();

                // 登录成功
                if (CORRECT_USERNAME.equals(userName) && CORRECT_PASSWORD.equals(password)) {
                    System.out.println("欢迎登录淘宝网站！");
                    loginSuccess = true;
                    break;
                } else {
                    int remaining = MAX_ATTEMPTS - attempt;
                    if (remaining > 0) {
                        System.out.println("用户名或密码错误，你还剩 " + remaining + " 次机会。");
                    }
                }
                System.out.println(); // 空行，界面更清晰
            }

            // 循环结束仍未成功，说明 3 次都失败了
            if (!loginSuccess) {
                System.out.println("连续 " + MAX_ATTEMPTS + " 次登录失败，账号已被锁定，程序即将退出。");
            }
        }
    }
}