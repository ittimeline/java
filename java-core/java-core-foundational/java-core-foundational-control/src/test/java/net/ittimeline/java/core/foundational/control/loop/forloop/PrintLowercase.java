package net.ittimeline.java.core.foundational.control.loop.forloop;

/**
 * 打印输出26个小写字母
 * 需求：控制台打印输出26个小写字母
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 16:27
 * @since Java21
 */
public class PrintLowercase {
    public static void main(String[] args) {
        System.out.println("1.实现方式1：");
        //a的ASCII编码值是97
        //z的ASCII编码值是122
        for (int i = 97; i <= 122; i++) {
            System.out.print((char) i + "\t");
        }
        //换行
        System.out.println();

        System.out.println("2.实现方式2：");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + "\t");
        }
        //换行
        System.out.println();

        System.out.println("3.实现方式3：");
        for (int i = 1; i <= 26; i++) {
            System.out.print((char) (i + 96) + "\t");
        }
    }
}
