package net.ittimeline.java.core.foundational.syntax.data.type.primitive;

/**
 * 不同类型整数在内存中的存储
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 9:39
 * @since Java 25
 */
public class IntTypeStorage {
    static void main() {
        //
        byte byteVar = 3;
        System.out.println("byteVar = " + byteVar);

        short shortVar = 3;
        System.out.println("shortVar = " + shortVar);

        int intVar = 3;
        System.out.println("intVar = " + intVar);

        long longVar = 3;
        System.out.println("longVar = " + longVar);

        System.out.println("byteVar 二进制 = " + String.format("%8s", Integer.toBinaryString(byteVar & 0xFF)).replace(' ', '0'));
        System.out.println("intVar  二进制 = " + String.format("%32s", Integer.toBinaryString(intVar)).replace(' ', '0'));
        /*
        说明：虽然打印输出四种整数类型的变量存储的变量值都是3，
             但是它们在内存中占据的内存空间不同，因此数据存储形式也是不同，数据在内存中都是以二进制补码形式存储
         */
    }
}
