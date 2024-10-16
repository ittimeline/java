package net.ittimeline.java.core.foundational.syntax.variable.type.primitive;

/**
 * 四种整数的取值范围以及占据的内存空间（单位字节）
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 6:45
 * @since Java21
 */
public class IntegerTypeLimits {
    public static void main(String[] args) {
        //byte对应的包装类是Byte
        //调用Byte的静态常量（MAX_VALUE，MIN_VALUE)获取byte类型的取值范围
        //调用Byte的静态常量BYTES获取byte类型占据的字节数
        System.out.println("byte所能存储的最大值是" + Byte.MAX_VALUE +
                " byte所能存储的最小值是" + Byte.MIN_VALUE + " byte占据的内存空间是" + Byte.BYTES + "字节");

        //short对应的包装类是Short
        //调用Short的静态常量（MAX_VALUE，MIN_VALUE)获取short类型的取值范围
        //调用Short的静态常量BYTES获取short类型占据的字节数
        System.out.println("short所能存储的最大值是" + Short.MAX_VALUE +
                " short所能存储的最小值是" + Short.MIN_VALUE + " short占据的内存空间是" + Short.BYTES + "字节");

        //int对应的包装类是Integer
        //调用Integer的静态常量（MAX_VALUE，MIN_VALUE)获取int类型的取值范围
        //调用Integer的静态常量BYTES获取int类型占据的字节数
        System.out.println("int所能存储的最大值是" + Integer.MAX_VALUE +
                " int所能存储的最小值是" + Integer.MIN_VALUE + " int占据的内存空间是" + Integer.BYTES + "字节");

        //long对应的包装类是Long
        //调用Long的静态常量（MAX_VALUE，MIN_VALUE)获取long类型的取值范围
        //调用Long的静态常量BYTES获取int类型占据的字节数
        System.out.println("long所能存储的最大值是" + Long.MAX_VALUE +
                " long所能存储的最小值是" + Long.MIN_VALUE + " long占据的内存空间是" + Long.BYTES + "字节");
    }
}
