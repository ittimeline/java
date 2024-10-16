package net.ittimeline.java.core.foundational.syntax.variable.type.primitive;

/**
 * 一个字节存储的数据范围
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 9:13
 * @since Java21
 */
public class ByteLimit {
    public static void main(String[] args) {
        //byte对应的包装类是Byte
        //调用Byte的静态常量（MAX_VALUE,MIN_VALUE)获取byte类型的取值范围
        //调用Byte的静态常量BYTES获取byte类型占据的字节数
        System.out.println("byte所能存储的最大值是" + Byte.MAX_VALUE +
                " byte所能存储的最小值是" + Byte.MIN_VALUE + " byte占据的内存空间是" + Byte.BYTES + "字节");
    }
}
