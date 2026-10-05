package net.ittimeline.java.core.foundational.operator.assignment.compound;

/**
 * 扩展赋值运算符使用注意事项1
 * 扩展赋值运算符会自动进行强制类型转换，将结果转换为左侧变量的类型。
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 15:16
 * @since Java 25
 */
public class ArithmeticAssignmentOperatorWarning1 {
    static void main() {
        //扩展赋值运算符会自动进行强制类型转换，将结果转换为左侧变量的类型。
        byte byteVar = 10;
        //等价于byteVar =(byte) (byteVar+10)
        byteVar += 10;
        System.out.println("byteVar = " + byteVar);
        //自增运算符底层也会进行类型转换
        byteVar++;

        byte byteValue = 10;
        //java: 不兼容的类型: 从int转换到byte可能会有损失
        //byteValue = byteValue + 10;


        int result = 1;
        // result = result * 0.1 等价于 result = (int)(result * 0.1)
        result *= 0.1;
        System.out.println("result = " + result);
    }
}
