package net.ittimeline.java.core.foundational.syntax.data.type.primitive;

/**
 * Java中整数的四种进制表示方式
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 9:38
 * @since Java 25
 */
public class IntTypeNumberSystem {
    static void main() {
        //System.out.println()打印语句打印输出字面量或者变量默认都是使用十进制的方式
        //二进制(binary)：由0和1组成，二进制的整数字面量是以0b或者0B开头，例如0b1101，Java7以后支持
        byte binary = 0b1101;
        System.out.println("二进制1101转换为十进制的结果是：" + binary);


        //八进制(octal)：由0~7之间的八个整数组成，八进制的整数字面量是以0开头，例如017
        byte octal = 017;
        System.out.println("八进制017转换为十进制的结果是：" + octal);


        //十进制(decimal)：由0~9之间的十个整数组成，整数字面量默认的进制就是十进制，例如100
        short decimal = 199;
        System.out.println("十进制199转换为十进制的结果是：" + decimal);


        //十六进制(hex)：由0~9之间的十个整数以及a~f之间6个小写字母或者是A~F之间的6个大写字母组成，十六进制的整数字面量是以0x或者0X开头，例如0x1f
        short hex = 0x19f;
        System.out.println("十六进制19f转换为十进制的结果是：" + hex);
    }
}
