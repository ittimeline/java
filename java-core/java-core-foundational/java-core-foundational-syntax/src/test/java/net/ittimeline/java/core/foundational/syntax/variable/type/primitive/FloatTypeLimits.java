package net.ittimeline.java.core.foundational.syntax.variable.type.primitive;

/**
 * 两种浮点类型的取值范围以及占据的内存空间（单位字节）
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 7:05
 * @since Java21
 */
public class FloatTypeLimits {
    public static void main(String[] args) {
        //%e表示按照十进制科学计数法解析
        //%d表示按照十进制整数解析
        //\n表示换行

        //float对应的包装类是Float
        //调用Float类的静态常量（MAX_VALUE,MIN_VALUE）获取float类型的取值范围
        //调用Float类的静态常量Bytes获取float类型占据的字节数

        System.out.printf("float所能存储的最大值是%e,float所能存储的最小值是%e,float占据的内存空间是%d个字节\n"
                , Float.MAX_VALUE, Float.MIN_VALUE, Float.BYTES);

        //double对应的包装类是Double
        //调用Double类的静态常量（MAX_VALUE,MIN_VALUE）获取double类型的取值范围
        //调用Double类的静态常量Bytes获取double类型占据的字节数
        System.out.printf("double所能存储的最大值是%e,double所能存储的最小值是%e,double占据的内存空间是%d个字节\n"
                , Double.MAX_VALUE, Double.MIN_VALUE, Double.BYTES);

        //long对应的包装类是Long,可以调用Long类的静态变量（MAX_VALUE,MIN_VALUE)获取long类型的取值范围，
        // 调用Long类的静态变量Bytes获取long类型占据的字节数
        System.out.printf("long所能存储的最大值是%d,long所能存储的最小值是%d,long占据的内存空间是%d个字节\n"
                , Long.MAX_VALUE, Long.MIN_VALUE, Long.BYTES);
    }
}
