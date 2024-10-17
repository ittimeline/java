package net.ittimeline.java.core.foundational.control.loop.endlessloop;

import java.util.Scanner;

/**
 * 模拟用户聊天
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 21:18
 * @since Java21
 */
public class WeChat {
    public static void main(String[] args) {
        System.out.println("欢迎使用简易聊天程序！输入 'bye' 结束聊天。");

        //创建Scanner对象
        //System.in 标准输入 也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        while (true) {
            //聊天的时候要求输入用户姓名和聊天的内容
            System.out.println("请输入姓名");
            String name = scanner.nextLine();
            System.out.println("请输入聊天内容");
            String msg = scanner.nextLine();
            //某个用户输入"bye"的时候聊天结束
            if ("bye".equals(msg)) {
                System.out.println("聊天结束!!!");
                break;
            }
            //拼接姓名和聊天内容
            String chatStr = name + "说:" + msg;
            System.out.println(chatStr);
        }
        //关闭Scanner
        scanner.close();
    }
}
