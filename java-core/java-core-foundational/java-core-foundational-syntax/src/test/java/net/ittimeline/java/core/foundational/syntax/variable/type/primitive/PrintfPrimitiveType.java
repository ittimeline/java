package net.ittimeline.java.core.foundational.syntax.variable.type.primitive;

/**
 * 格式化输出使用
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 21:39
 * @since Java21
 */
public class PrintfPrimitiveType {
    public static void main(String[] args) {
        System.out.println("1.格式化输出整数类型");
        //整数常用格式
        int age = 32;
        System.out.println("我今年" + age + "岁");
        //格式化输出不同进制的整数
        //%d 十进制格式
        System.out.printf("我今年%d岁\n", age);
        int number = 100;
        //System.out.println()默认是十进制输出
        System.out.println("number = " + number);
        //%o 八进制格式
        //%x 十六进制格式
        System.out.printf("100八进制表现形式是%o\n", number);
        System.out.printf("100十六进制表现形式是%x\n", number);

        System.out.println("2.格式化输出浮点类型（小数）");
        //浮点数（小数）常用格式
        //格式化输出浮点数
        double height = 180.00;
        System.out.println("我的身高是" + height + "厘米");
        //%f表示浮点数格式  %.2f 浮点数格式，小数点后保留2位
        System.out.printf("我的身高是%.2f厘米\n", height);

        double doubleValue = 100_0000.00;
        System.out.println("doubleValue = " + doubleValue);
        System.out.printf("100000000使用科学计数法表示为%e\n", doubleValue);

        System.out.println("3.格式化输出字符类型");
        //格式化输出字符
        //%c表示字符格式
        char ch = 'a';
        System.out.println(ch + "是第一个字符");
        System.out.printf("%c是第一个字符\n", ch);

        System.out.println("4.格式化输出布尔类型");
        //%b表示布尔格式
        boolean flag = false;
        System.out.println("flag = " + flag);
        System.out.printf("flag = %b\n", flag);
    }
}
