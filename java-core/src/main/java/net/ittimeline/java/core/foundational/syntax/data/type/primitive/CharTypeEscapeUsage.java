package net.ittimeline.java.core.foundational.syntax.data.type.primitive;

/**
 * 转义字符使用
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 11:05
 * @since Java 25
 */
public class CharTypeEscapeUsage {
    static void main() {
        //\n表示光标跳到下一行。注意：在 Windows 下换行通常是 \r\n
        System.out.println("转义字符\\n");
        System.out.print("Hello");
        char newLine = '\n';
        System.out.print(newLine);
        System.out.print("World");
        System.out.print('\n');


        //\t表示制表符表示光标移动到下一个制表位（tab stop），宽度依终端而定。
        System.out.println("转义字符\\t");
        System.out.println("Hello\tJava");


        //\b表示示退格符光标向左移动一格，通常不会删除字符，但部分终端会覆盖前一个字符。
        System.out.println("转义字符\\b");
        System.out.println("Hello\bGo");


        //\r表示回车符表示光标移动到行首，不换行，常用于覆盖输出。
        System.out.println("转义字符\\r");
        System.out.println("Hello\rPython");

        // \\表示\
        System.out.println("转义字符\\");
        String windowsPath = "D:\\projects\\ittimeline";
        System.out.println(windowsPath);
        String macPath = "/Users/liuguanglei/Documents/projects/ittimeline/java";
        System.out.println(macPath);

        //\"表示"
        char ch = '"';
        //编译错误
        //String str =""";
        System.out.println("转义字符\"");
        System.out.println("\"跟光磊学Java从小白到架构师\"");


        // \'表示'
        System.out.println("转义字符\'");
        System.out.println("\'跟光磊学Java从小白到架构师\'");


    }
}
