package net.ittimeline.java.core.foundational.control.loop.whileloop;

/**
 * while循环使用注意事项1
 * for循环和while循环的区别：初始化循环条件的作用范围不同
 * ● while循环中的初始化循环条件在while循环结束后依然有效
 * ● for循环的初始化循环条件只在for循环内有效
 * 需求：分别使用while循环和for循环打印输出5次跟光磊学Java从小白到架构师
 * 分析：for循环能做的事儿while循环也可以做
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:14
 * @since Java 25
 */
public class WhileLoopWarning1 {
    static void main() {
        System.out.println("********************************1.for循环实现********************************");
        for (int i = 0; i < 5; i++) {
            System.out.println("跟光磊学Java从小白到架构师");
        }
        //打印输出i的值
        //编译错误：超过i的作用域范围，只能在for循环内有效
        //System.out.println("i = " + i);
        System.out.println("********************************2.while循环实现********************************");
        int i = 0;
        while (i < 5) {
            System.out.println("跟光磊学Java从小白到架构师");
            i++;
        }
        //打印输出i的值
        //i在while循环结束后依然有效
        System.out.println("i = " + i);
    }
}
