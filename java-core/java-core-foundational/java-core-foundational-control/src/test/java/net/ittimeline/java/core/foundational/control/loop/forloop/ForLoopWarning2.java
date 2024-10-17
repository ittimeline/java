package net.ittimeline.java.core.foundational.control.loop.forloop;

/**
 * for循环使用注意事项2
 * 循环的初始化语句可以有多条初始化语句，但是要求数据类型一样，并且中间使用逗号隔开，
 * 循环迭代语句也可以有多条语句，多条语句中间使用逗号(,)隔开。
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 16:04
 * @since Java21
 */
public class ForLoopWarning2 {
    public static void main(String[] args) {
        for (int i = 0, j = 0; i < 3; i++, j += 2) {
            /*
                i = 0 j = 0
                i = 1 j = 2
                i = 2 j = 4
             */
            System.out.println("i = " + i + " j = " + j);
        }
    }
}
