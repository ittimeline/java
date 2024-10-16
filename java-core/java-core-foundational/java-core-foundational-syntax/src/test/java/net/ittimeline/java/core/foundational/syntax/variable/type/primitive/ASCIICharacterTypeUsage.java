package net.ittimeline.java.core.foundational.syntax.variable.type.primitive;

/**
 * ASCII字符集使用
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 8:55
 * @since Java21
 */
public class ASCIICharacterTypeUsage {
    public static void main(String[] args) {
        //ASCII字符集字符类型字面量的三种表现方式
        //测试数据：小写字母a
        //方式1.使用一对单引号('')包含的单个字符
        char lowercaseLetterAWay1 = 'a';
        System.out.println("lowercaseLetterAWay1 = " + lowercaseLetterAWay1);
        //方式2.直接使用十进制Unicode字符集编号
        //小写字母a十进制Unicode字符编码是97，Unicode字符集兼容ASCII
        char lowercaseLetterAWay2 = 97;
        System.out.println("lowercaseLetterAWay2 = " + lowercaseLetterAWay2);
        //小写字母十六进制Unicode字符编码是0061
        //方式3.直接使用十六进制Unicode字符集编号
        char lowercaseLetterAWay3 = '\u0061';
        System.out.println("lowercaseLetterAWay3 = " + lowercaseLetterAWay3);
        //测试数据：大写字母A
        char uppercaseLetterAWay1 = 'A';
        //大写字母A十进制Unicode字符编码是65
        char uppercaseLetterAWay2 = 65;
        //大写字母A十六进制Unicode字符编码是0041
        char uppercaseLetterAWay3 = '\u0041';
        System.out.println("uppercaseLetterAWay1 = " + uppercaseLetterAWay1);
        System.out.println("uppercaseLetterAWay2 = " + uppercaseLetterAWay2);
        System.out.println("uppercaseLetterAWay3 = " + uppercaseLetterAWay3);
        //测试数据：0
        char zeroWay1 = '0';
        char zeroWay2 = 48;
        char zeroWay3 = '\u0030';
        System.out.println("zeroWay1 = " + zeroWay1);
        System.out.println("zeroWay2 = " + zeroWay2);
        System.out.println("zeroWay3 = " + zeroWay3);
    }
}
