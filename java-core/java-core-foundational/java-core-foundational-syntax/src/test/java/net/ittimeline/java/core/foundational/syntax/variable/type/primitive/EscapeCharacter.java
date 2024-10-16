package net.ittimeline.java.core.foundational.syntax.variable.type.primitive;

/**
 * 转义字符
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 8:58
 * @since Java21
 */
public class EscapeCharacter {
    public static void main(String[] args) {
        System.out.print("Hello");
        char newLine = '\n';
        //\n 换行
        System.out.print(newLine);
        System.out.println("World");
        // \t 制表符
        System.out.println("Hello\tWorld");

        // \\表示 \
        String windowsPath = "D:\\projects\\ittimeline\\java";
        System.out.println("windowsPath = " + windowsPath);

        String macPath = "/Users/liuguanglei/Documents/projects/ittimeline/java";
        System.out.println("macPath = " + macPath);

        // \"表示 "
        System.out.println("\"跟光磊学Java从小白到架构师\"");
        // \' 表示'
        System.out.println("\'跟光磊学Java从小白到架构师\'");
    }
}
