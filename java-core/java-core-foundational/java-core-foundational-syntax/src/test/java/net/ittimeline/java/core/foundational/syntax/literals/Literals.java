package net.ittimeline.java.core.foundational.syntax.literals;

/**
 * 字面量使用
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 6:04
 * @since Java21
 */
public class Literals {
    public static void main(String[] args) {
        /******************打印输出五种字面量******************/
        //打印输出整数字面量
        System.out.println("1.打印输出整数字面量");
        System.out.println(100);
        //快捷键Ctrl+D复制光标所在行粘贴到下一行
        System.out.println(23000);
        System.out.println(-200);

        //打印输出小数字面量
        System.out.println("2.打印输出小数字面量");
        System.out.println(3.141592653589793);
        System.out.println(5.12);
        System.out.println(-0.1);

        System.out.println("3.打印输出字符类型字面量");
        System.out.println('a');
        System.out.println('A');
        System.out.println('我');
        System.out.println('1');
        //打印输出1个空格
        System.out.println(' ');

        //打印输出字符串类型字面量
        System.out.println("4.打印输出字符串类型字面量");
        System.out.println("Hello World");
        System.out.println("跟光磊学Java从小白到架构师");
        System.out.println("光磊");
        //空字符串
        System.out.println("");
        //空格
        System.out.println(" ");

        System.out.println("5.打印输出布尔类型字面量");
        System.out.println(true);
        System.out.println(false);
    }
}
