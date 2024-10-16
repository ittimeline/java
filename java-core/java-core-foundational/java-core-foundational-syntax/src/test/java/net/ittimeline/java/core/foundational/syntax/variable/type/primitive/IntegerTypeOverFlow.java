package net.ittimeline.java.core.foundational.syntax.variable.type.primitive;

/**
 * 整数类型溢出的内存原理
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 9:21
 * @since Java21
 */
public class IntegerTypeOverFlow {
    public static void main(String[] args) {
        /*
          计算机在执行运算的时候使用补码运算
           1. byte的表示范围是-128 ~ +127
           2. 135超过了byte的表示范围，在强制类型转换的时候会发生溢出
           3. 135 默认的类型是int int在内存中占据4个字节 1Byte=8bit 4个字节对应32位
           4. 135 在内存的二进制补码表示方式 0000 0000 0000 0000  0000 0000 1000 0111
           5. 因为135强制类型转换成byte 因此会从右往左截取8位,结果是1000 0111
           6. 1000 0111 占据1个字节，但是符号位(左边第一位)是1表示该数字是一个负数

         当我们查看计算机执行结果的时候使用原码 将1000 0111转换原码
            1. 根据补码得到反码：补码减1 1000 0111-1=1000 0110
            2. 根据反码得到原码：最高位不变，其他位取反 1000 0110  也就是 1111 1001
            3. 将原码1111 1001 转换成十进制-121
            4. 因此最后的结果是-121
         */
        byte value = (byte) 135;
        System.out.println("value = " + value);
    }
}
