package net.ittimeline.java.core.foundational.syntax.variable.type.reference.conversion;

/**
 * 基本数据类型转换为String类型使用
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 22:08
 * @since Java21
 */
public class PrimitiveType2StringType {
    public static void main(String[] args) {
        /******************常用的六种基本数据类型转换为String******************/
        //基本数据类型转String：直接将基本数据类型与空字符串（""）相连接，Java会自动将基本数据类型转换为字符串。
        byte byteVar = 127;
        String byteVarStr = byteVar + "";
        System.out.println("将byte转换为String byteVarStr = " + byteVarStr);

        char charVar = 'a';
        String charVarStr = charVar + "";
        System.out.println("将char转换为String charVarStr = " + charVarStr);

        int intVar = 100_0000;
        String intVarStr = intVar + "";
        System.out.println("将int转换为String intVarStr = " + intVarStr);

        long longVar = 100_0000_0000L;
        String longVarStr = longVar + "";
        System.out.println("将long转换为String longVarStr = " + longVarStr);

        double doubleVar = 8.88;
        String doubleVarStr = doubleVar + "";
        System.out.println("将double转换为String doubleVarStr = " + doubleVarStr);

        boolean booleanVar = true;
        String booleanStr = booleanVar + "";
        System.out.println("将boolean转换为String booleanStr = " + booleanStr);
    }
}
