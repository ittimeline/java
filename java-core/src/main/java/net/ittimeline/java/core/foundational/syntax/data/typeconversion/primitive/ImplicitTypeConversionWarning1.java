package net.ittimeline.java.core.foundational.syntax.data.typeconversion.primitive;

/**
 * 自动类型转换注意事项1
 * byte,short和char之间不会进行自动类型转换，
 * 当byte,short,char类型的变量之间进行运算时，都会先提升为 int 类型再进行处理，运算结果也是int类型
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 13:55
 * @since Java 25
 */
public class ImplicitTypeConversionWarning1 {
    static void main() {
        //1. byte,short和char之间不会进行自动类型转换
        byte byteVar = 10;
        short shortVar = 20;
        char charVar = 'a';
        //java: 不兼容的类型: 从byte转换到char可能会有损失
        //charVar = byteVar;
        //java: 不兼容的类型: 从char转换到short可能会有损失
        //shortVar = charVar;

        //当byte,short,char类型的变量之间进行运算时，都会先提升为 int 类型再进行处理，运算结果也是int类型
        int intResult = byteVar + shortVar + charVar;
        System.out.println("intResult = " + intResult);
    }
}
