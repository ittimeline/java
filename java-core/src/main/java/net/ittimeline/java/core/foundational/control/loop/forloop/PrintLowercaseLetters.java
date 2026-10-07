package net.ittimeline.java.core.foundational.control.loop.forloop;

/**
 * for循环案例1-打印输出26个小写字母
 * 需求：控制台打印输出26个小写字母
 * 分析：有3种实现方式 ① 打印字符 ②打印ASCII编码值  ③ 打印整数强制转换为字符
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:05
 * @since Java 25
 */
public class PrintLowercaseLetters {
    static void main() {
        System.out.println("********************************打印26个小写字母实现方式1********************************");
        //1.打印字符
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + "\t");
        }
        //换行
        System.out.println();
        System.out.println("********************************打印26个小写字母实现方式2********************************");
        //2.打印ASCII编码值
        //A的ASCII编码值是65,Z的ASCII编码值是90
        //a的ASCII编码值是97,z的ASCII编码值是122
        for (int i = 97; i <= 122; i++) {
            System.out.print((char) i + "\t");
        }
        //换行
        System.out.println();

        System.out.println("********************************打印26个小写字母实现方式3********************************");
        //3.打印整数强制转换为字符
        for (int i = 0; i < 26; i++) {
            System.out.print((char) (i + 97) + "\t");
        }
        //换行
        System.out.println();
    }

}
