package net.ittimeline.java.core.foundational.syntax.variable.type.primitive.conversion;

/**
 * String转换为基本数据类型使用
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 22:10
 * @since Java21
 */
public class StringType2PrimitiveType {
    public static void main(String[] args) {
        /******************字符串转换为常用的六种基本数据类型******************/
        //字符串转换为byte
        String byteVarStr = "20";
        //调用byte对应的包装类Byte的parseByte()方法将字符串20转换为byte类型
        byte byteVar = Byte.parseByte(byteVarStr);
        System.out.println("1.字符串转换为byte byteVar = " + byteVar);
        // 字符串转换为char
        String charVarStr = "a";
        //调用字符串对象的charAt()方法获取字符串的第一个字符
        char charVar = charVarStr.charAt(0);
        System.out.println("2.字符串转换为char charVar = " + charVar);
        // 字符串转换为int
        String intVarStr = "1000000";
        int intVar = Integer.parseInt(intVarStr);
        System.out.println("3.字符串转换为int intVar = " + intVar);
        //字符串转换为long
        String longVarStr = "10000000000";
        long longVar = Long.parseLong(longVarStr);
        System.out.println("4.字符串转换为long longVar = " + longVar);

        //字符串转换为double
        String doubleVarStr = "3.1415926";
        double doubleVar = Double.parseDouble(doubleVarStr);
        System.out.println("5.字符串转换为double doubleVar = " + doubleVar);
        //字符转转换为boolean
        String booleanVarStr = "true";
        boolean booleanVar = Boolean.parseBoolean(booleanVarStr);
        System.out.println("6.字符转转换为boolean booleanVar = " + booleanVar);
    }
}
