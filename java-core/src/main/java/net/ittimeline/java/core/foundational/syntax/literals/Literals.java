package net.ittimeline.java.core.foundational.syntax.literals;

/**
 * Java字面量
 * 1.什么是字面量
 * Java中，字面量指的是在程序中直接使用的数据，字面量是Java中最基本的表达式，不需要进行计算或转换，直接使用即可。
 * 2.字面量分类
 * ● 整数型：10、-5、0、100
 * ● 浮点型：3.14、-0.5、1.0
 * ● 布尔型：true、false
 * ● 字符型：'a'、'b'、'c'、'1'、'2'、'国'
 * ● 字符串型："Hello"、"World"、"Java"、"你好呀"
 *
 * 3. 重要说明
 * Java中规定字符类型，必须使用单引号括起来（半角的），字符类型只能有1个字符
 * Java中规定字符串类型，必须使用双引号括起来（半角的）  字符串类型可以有0-N个字符
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/3 14:18
 * @since Java 25
 */
public class Literals {
    static void main() {
        /********************************打印输出5种类型字面量********************************/
       IO.println("1.打印输出整数类型字面量");
       IO.println(100);
       IO.println(23000);
       IO.println(-1000);

       IO.println("2.打印输出小数类型字面量");
       IO.println(3.141592653589793);
       IO.println(5.12);
       IO.println(-0.1);
       IO.println(-.1);

       IO.println("3.打印输出字符类型字面量");
       IO.println('a');
       IO.println('A');
       IO.println('1');
       IO.println('我');
        //打印输出空格字符
       IO.println(' ');

       IO.println("4.打印输出字符串类型字面量");
       IO.println("Hello World");
       IO.println("跟光磊学Java从小白到架构师");
        //打印输出空字符串
       IO.println("");
        //打印输出空格字符串
       IO.println(" ");

       IO.println("5.打印输出布尔类型字面量");
       IO.println(true);
       IO.println(false);
    }
}
