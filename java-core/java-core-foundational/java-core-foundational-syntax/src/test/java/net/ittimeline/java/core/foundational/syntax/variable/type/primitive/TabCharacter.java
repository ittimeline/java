package net.ittimeline.java.core.foundational.syntax.variable.type.primitive;

/**
 * 转义字符-制表符
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 8:59
 * @since Java21
 */
public class TabCharacter {
    public static void main(String[] args) {
        //没有使用制表符展示数据
        System.out.println("姓名年龄");
        System.out.println("tom28");
        //使用制表符展示数据
        System.out.println("姓名\t年龄");
        System.out.println("tom\t28");
    }
}
