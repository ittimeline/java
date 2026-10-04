package net.ittimeline.java.core.foundational.syntax.data.type.primitive;

/**
 * ASCII字符集使用
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 10:57
 * @since Java 25
 */
public class CharTypeASCIIUsage {
    static void main() {
        //ASCII字符集字面量三种表示方式
        //测试数据：小写字母a
        System.out.println("小写字母a的三种表示方式");
        //方式1：使用一对单引号('')包含的单个字符
        char lowerCaseWay1 = 'a';
        System.out.println("lowerCaseWay1 = " + lowerCaseWay1);

        //方式2：用十进制的Unicode编码值
        char lowerCaseWay2 = 97;
        System.out.println("lowerCaseWay2 = " + lowerCaseWay2);


        //方式3：使用十六进制Unicode编码值表示
        char lowerCaseWay3 = '\u0061';
        System.out.println("lowerCaseWay3 = " + lowerCaseWay3);


        //测试数据：大写字母A
        System.out.println("大写字母A的三种表示方式");
        //方式1：使用一对单引号('')包含的单个字符
        char upperCaseWay1 = 'A';
        System.out.println("upperCaseWay1 = " + upperCaseWay1);

        //方式2：用十进制的Unicode编码值
        char upperCaseWay2 = 65;
        System.out.println("upperCaseWay2 = " + upperCaseWay2);


        //方式3：使用十六进制Unicode编码值表示
        char upperCaseWay3 = '\u0041';
        System.out.println("upperCaseWay3 = " + upperCaseWay3);


        //测试数据：字符'0'
        System.out.println("字符0的三种表示方式");

        //方式1：使用一对单引号('')包含的单个字符
        char zeroWay1 = '0';
        System.out.println("zeroWay1 = " + zeroWay1);


        //方式2：用十进制的Unicode编码值
        char zeroWay2 = 48;
        System.out.println("zeroWay2 = " + zeroWay2);


        //方式3：使用十六进制Unicode编码值表示
        char zeroWay3 = '\u0030';
        System.out.println("zeroWay3 = " + zeroWay3);

        //关于空字符
        //在java中使用'\u0000'定义空字符，不能使用''定义空字符
        // \\u后面是一个十六进制的数字，即Unicode字符集编码值
        char emptyChar = '\u0000';
        System.out.println("Hello" + emptyChar + "World");
    }
}
