package net.ittimeline.java.core.foundational.control.loop.forloop;

/**
 * for循环使用注意事项1
 * for循环中循环条件判断左边的初始化语句和循环条件判断的右边的循环迭代语句可以写到其他地方，但是两边的分号不能省略
 * for循环语法格式-非标准格式
 * for(;循环条件;){
 * 循环体;
 * }
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:04
 * @since Java 25
 */
public class ForLoopWarning1 {
    static void main() {
        //循环初始化语句
        int i = 0;
        //for循环
        for (; i < 5; ) {
            //循环体
            System.out.println("跟光磊学Java从小白到架构师");
            //循环迭代语句
            i++;
        }
        //i是5的时候，循环条件不成立，因此i等于5
        System.out.println("i = " + i);
    }

}
