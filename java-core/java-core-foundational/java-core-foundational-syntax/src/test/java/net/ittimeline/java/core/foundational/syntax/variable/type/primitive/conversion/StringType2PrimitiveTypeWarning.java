package net.ittimeline.java.core.foundational.syntax.variable.type.primitive.conversion;

/**
 * String转换为基本数据类型注意事项
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 22:15
 * @since Java21
 */
public class StringType2PrimitiveTypeWarning {
    public static void main(String[] args) {
        //字符串转换为long 正常转换
        String longVarStr1 = "10000000000";
        long longVar1 = Long.parseLong(longVarStr1);
        System.out.println("字符串转换为long longVar1 = " + longVar1);
        //字符串转换为基本数据类型，如果是转换为数值类型，那么字符串必须是数值，并且在数值类型的取值范围内
        //否则就会出现NumberFormatException

        //字符串转换为基本数据类型可能会出现NumberFormatException的情况1

        //字符串100_0000_0000不全是数值，还包括下划线(_)
        String longVarStr2 = "100_0000_0000";
        //因此在转换为基本数据类型long时会发生NumberFormatException异常
        //long longVar2 = Long.parseLong(longVarStr2);
        //System.out.println("字符串转换为long NumberFormatException longVar2 = " + longVar2);

        //字符串转换为基本数据类型可能会出现NumberFormatException的情况2
        String byteVarStr1 = "127";
        byte byteVar1 = Byte.parseByte(byteVarStr1);
        System.out.println("byteVar1 = " + byteVar1);

        //字符串"128"虽然全是数字，但是超过了byte的取值范围
        String byteVarStr2 = "128";
        //因此在转换为基本数据类型byte时会发生NumberFormatException异常
        //byte byteVar2 = Byte.parseByte(byteVarStr2);
        //System.out.println("byteVar2 = " + byteVar2);
    }
}
