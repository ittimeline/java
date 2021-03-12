package net.ittimeline.java.foundational.syntax.variable;

/**
 * 字符型变量的定义和使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/10 18:20
 * @since JDK11
 */
public class CharacterVariable {
    public static void main(String[] args) {
        char ch ='a';
        System.out.println(ch);
        // 小写字符a 对应的Unicode编码值就是97
        // 大写字符A 对应的Unicode编码值是65
        // 字符0 对应的Unicode编码值是48
        ch=97;
        System.out.println(ch);

        char zero ='\u0030';
        System.out.println(zero);

        char chinese='刘';
        System.out.println(chinese);

        //转义字符
        //换行
        char newLine ='\n';
        System.out.println("Hello"+newLine+"World");

        //路径转义
        char path='\\';
        System.out.println(path);

        char tab ='\t';
        System.out.println("Hello"+tab+"World");





    }
}
