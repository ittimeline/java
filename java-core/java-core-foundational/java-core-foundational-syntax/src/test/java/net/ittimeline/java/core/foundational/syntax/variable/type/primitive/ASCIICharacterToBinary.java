package net.ittimeline.java.core.foundational.syntax.variable.type.primitive;

import java.nio.charset.Charset;

/**
 * ASCII字符编码字符在内存中存储
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 9:35
 * @since Java21
 */
public class ASCIICharacterToBinary {
    public static void main(String[] args) {
        //Charset.defaultCharset()用于获取当前JVM使用的编码
        //UTF-8编码兼容ASCII
        System.out.println("当前JVM使用的编码是" + Charset.defaultCharset());
        /**********************ASCII字符集常用字符的编码**********************/
        char lowercaseLetterA = 'a';
        //(int) lowercaseLetterA 表示将字符类型转换为int类型，这样就可以获取字符对应的编码
        System.out.println("字符" + lowercaseLetterA + "对应的编码是 " + (int) lowercaseLetterA
                + " 二进制存储形式是" + Integer.toBinaryString(lowercaseLetterA));

        char uppercaseLetterA = 'A';
        //(int) uppercaseLetterA 表示将字符类型转换为int类型，这样就可以获取字符对应的编码
        System.out.println("字符" + uppercaseLetterA + "对应的编码是 " + (int) uppercaseLetterA
                + " 二进制存储形式是" + Integer.toBinaryString(uppercaseLetterA));

        char zero = '0';
        //(int) zero 表示将字符类型转换为int类型，这样就可以获取字符对应的编码
        System.out.println("字符" + zero + "对应的编码是 " + (int) zero
                + " 二进制存储形式是" + Integer.toBinaryString(zero));

        char space = ' ';
        //(int) space  表示将字符类型转换为int类型，这样就可以获取字符对应的编码
        System.out.println("字符" + space + "对应的编码是 " + (int) space +
                " 二进制存储形式是" + Integer.toBinaryString(space));

        //\n表示换行转义字符
        char newLine = '\n';
        // (int) newLine  表示将字符类型转换为int类型，这样就可以获取字符对应的编码
        System.out.println("字符'换行符'对应的编码是 " + (int) newLine +
                " 二进制存储形式是" + Integer.toBinaryString(newLine));

        //\t表示tab转义字符
        char tab = '\t';
        // (int) tab  表示将字符类型转换为int类型，这样就可以获取字符对应的编码
        System.out.println("字符'制表符'对应的编码是 " + (int) tab +
                " 二进制存储形式是" + Integer.toBinaryString(tab));
    }
}
