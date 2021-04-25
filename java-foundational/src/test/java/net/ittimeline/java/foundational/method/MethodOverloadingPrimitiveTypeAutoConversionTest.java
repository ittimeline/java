package net.ittimeline.java.foundational.method;

/**
 * 方法重载与基本数据类型自动类型转换测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/12 15:19
 * @since JDK11
 */
public class MethodOverloadingPrimitiveTypeAutoConversionTest {

    public static void main(String[] args) {
        MethodOverloadingPrimitiveTypeAutoConversion.invoke((byte)123);
        MethodOverloadingPrimitiveTypeAutoConversion.invoke(100.0,100);
    }
}
