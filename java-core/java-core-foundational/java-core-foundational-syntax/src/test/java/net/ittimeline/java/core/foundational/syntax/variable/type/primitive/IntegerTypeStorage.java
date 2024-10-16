package net.ittimeline.java.core.foundational.syntax.variable.type.primitive;

/**
 * 不同整数类型数据在内存中的存储
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 9:14
 * @since Java21
 */
public class IntegerTypeStorage {
    public static void main(String[] args) {
        byte byteVar = 3;
        System.out.println("byteVar = " + byteVar);

        short shortVar = 3;
        System.out.println("shortVar = " + shortVar);

        int intVar = 3;
        System.out.println("intVar = " + intVar);

        long longVar = 3;
        System.out.println("longVar = " + longVar);
    }
}
