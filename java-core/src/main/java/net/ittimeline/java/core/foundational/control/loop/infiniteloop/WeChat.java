package net.ittimeline.java.core.foundational.control.loop.infiniteloop;

import java.util.Scanner;

/**
 * 死循环案例2-模拟用户聊天
 * 需求：模拟两个用户聊天，然后某个用户输入"bye"的时候聊天结束，聊天的时候要求输入用户姓名和聊天的内容
 * 分析：
 * 1. 程序需要模拟两个用户轮流聊天，因此需要一个循环，每次让一个用户输入。
 * 2. 每个用户输入时，需要先获取用户姓名，再获取聊天内容（可以分两次提示输入）
 * 3. 聊天持续进行，直到某一次用户输入的内容为 "bye"，使用 public boolean equals(Object anObject) 方法精确匹配
 * 4. 每次输入后，将聊天内容按 "[姓名]: 内容" 的格式输出，模拟聊天记录。
 * 5. 使用 public boolean equals(Object anObject)方法判断字符串内容是否等于 "bye"，而不使用 ==，确保内容比较正确。
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:36
 * @since Java 25
 */
public class WeChat {
    static void main() {
        //创建Scanner对象
        //System.in 标准输入 也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎使用简易聊天程序！输入 'bye' 结束聊天。");
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
            String chatStr = "[" + name + "]" + ":" + msg;
            System.out.println(chatStr);
        }
        //关闭Scanner
        scanner.close();
    }
}
