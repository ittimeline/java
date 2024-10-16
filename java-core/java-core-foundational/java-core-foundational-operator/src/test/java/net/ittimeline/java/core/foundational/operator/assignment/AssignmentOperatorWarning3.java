package net.ittimeline.java.core.foundational.operator.assignment;

/**
 * 赋值运算符使用注意事项3
 * 复合赋值运算符不会改变变量的数据类型
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 21:17
 * @since Java21
 */
public class AssignmentOperatorWarning3 {
    public static void main(String[] args) {
        //复合赋值运算符不会改变变量的数据类型
        byte byteVar = 10;
        //等价于byteVar =(byte) (byteVar+10)
        byteVar += 10;
        System.out.println("byteVar = " + byteVar);
        //自增运算符底层也会进行类型转换
        byteVar++;

        int result = 1;
        // result = result * 0.1 等价于 result = (int)(result * 0.1)
        result *= 0.1;
        System.out.println("result = " + result);
    }
}
