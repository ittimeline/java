package net.ittimeline.java.core.foundational.syntax.variable.type.primitive;

import java.nio.charset.Charset;

/**
 * UTF-8字符编码在内存中存储
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 9:36
 * @since Java21
 */
public class UnicodeCharacterToBinary {
    public static void main(String[] args) {
        //Charset.defaultCharset()用于获取当前JVM使用的编码
        //UTF-8编码兼容ASCII
        System.out.println("当前JVM使用的编码是" + Charset.defaultCharset());
        String str = "m我a";
        //使用平台默认的字符编码将字符串编码为一系列字节，即使用UTF-8编码的方式将字符串转为字节数组
        byte[] bytes = str.getBytes();
        //遍历字节数组，获取每个字节
        for (int i = 0; i < bytes.length; i++) {
            System.out.printf("第%d个字节内容是%d\n", i + 1, bytes[i]);
        }
        /*
            第1个字节内容是109
            第2个字节内容是-26
            第3个字节内容是-120
            第4个字节内容是-111
            第5个字节内容是97

         */

        /*
            109, -26, -120, -111, 97是怎么来的？
            UTF-8编码下英文字母占据1个字节，109是字符m在内存存储的十进制表示方式, 97是字符a在内存存储的十进制表示方式
            UTF-8编码下中文占据3个字节，-26, -120, -111是字符我在内存存储的十进制表示方式
         */
        //(int) 'm' 表示将字符字面量m转换为int类型，其目的就是获取m对应的编码109
        System.out.println("字符m对应的编码是 " + (int) 'm');
        //(int) 'a' 表示将字符字面量a转换为int类型，其目的就是获取a对应的编码97
        System.out.println("字符a对应的编码是 " + (int) 'a');
        //(int) '我' 表示将字符字面量a转换为int类型，其目的就是获取a对应的编码25105
        System.out.println("字符我对应的编码是 " + (int) '我');
        // 获取字符我对应编码的二进制表示方式是110001000010001
        System.out.println("字符我对应的编码二进制表示方式是 " + Integer.toBinaryString('我'));

        /*
            一个字节表示八个二进制位
            UTF-8编码规定 第一个字节开头必须是1110，第二个、第三个字节开头必须是10
            字符我对应编码的二进制表示方式是110 001000 010001
            因此第一个字节是1110 0110
               第二个字节是1000 1000
               第三个字节是1001 0001
            数据的存储、计算都是补码，数据的打印输出是原码

            第一个字节1110 0110 转换为原码并转换成十进制
            补码：1110 0110
            反码：1110 0101
            原码：1001 1010
            001 1010转换为十进制结果是-26

            第二个字节是1000 1000转换为原码并转换成十进制
            补码：1000 1000
            反码：1000 0111
            原码：1111 1000
            1111 1000转换为十进制的结果是-120

            第三个字节是1001 0001转换为原码并转换成十进制
            补码：1001 0001
            反码：1001 0000
            原码：1110 1111
            1110 1111转换为十进制的结果是-111
         */
    }
}
