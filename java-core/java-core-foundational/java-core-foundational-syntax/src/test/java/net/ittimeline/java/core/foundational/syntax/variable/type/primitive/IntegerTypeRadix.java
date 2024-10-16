package net.ittimeline.java.core.foundational.syntax.variable.type.primitive;

/**
 * 整数类型字面量的四种进制表示方式
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 6:57
 * @since Java21
 */
public class IntegerTypeRadix {
    public static void main(String[] args) {
        //System.out.println(); 打印语句打印输出字面量或者整数变量默认都是使用十进制方式打印输出

        //二进制整数字面量：二进制只能包含0或者1，二进制整数字面量以0B或者0b开头
        byte binary = 0b1101;
        System.out.println("二进制1101转换为十进制的结果是" + binary);

        //八进制整数字面量：八进制只能包含0~7之间的八个数字，八进制字面量以0开头
        byte octal = 017;
        System.out.println("八进制17转换为十进制的结果是" + octal);

        //十进制整数字面量：十进制只能包含0~9之间的十个数字，整数字面量默认就是十进制
        short decimal = 199;
        System.out.println("十进制199转换为十进制的结果是" + decimal);

        //十六进制字面量：十六进制包含0~9之间的十个数字以及a~f之间的六个字母，十进制字面量以0x开头
        short hex = 0x19f;
        System.out.println("十六进制19f转换为十进制的结果是" + hex);
    }
}
