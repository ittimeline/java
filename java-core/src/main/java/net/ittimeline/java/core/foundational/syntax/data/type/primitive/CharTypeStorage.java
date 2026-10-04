package net.ittimeline.java.core.foundational.syntax.data.type.primitive;

/**
 * 字符在内存中的存储
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 11:06
 * @since Java 25
 */
public class CharTypeStorage {
    static void main() {
        System.out.println("字符 'a' 的编码值是 " + (int) 'a');
        System.out.println("字符 'A' 的编码值是 " + (int) 'A');
        System.out.println("字符 '0' 的编码值是 " + (int) '0');
        System.out.println("字符 '中' 的编码值是 " + (int) '中');

        // char 装不下补充平面字符，编译报错
        // System.out.println((int) '😂');

        String emoji = "😂";
        System.out.println("emoji 的码点是 " + emoji.codePointAt(0));
    }
}
