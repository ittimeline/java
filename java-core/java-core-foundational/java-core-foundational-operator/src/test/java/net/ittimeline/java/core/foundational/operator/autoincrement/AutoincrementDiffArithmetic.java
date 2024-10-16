package net.ittimeline.java.core.foundational.operator.autoincrement;

/**
 * 自增运算符的自增1和算术运算符的加1有什么区别
 * 自增运算符的自增1不会改变变量原有的数据类型，推荐使用，算术运算符的加1可能会改变变量原有数据类型
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 11:33
 * @since Java21
 */
public class AutoincrementDiffArithmetic {
    public static void main(String[] args) {
        //自增运算符的自增1不会改变变量原有的数据类型，推荐使用
        byte byteVar = 10;
        //++byteVar 结果依然是byte类型，自增1后数据类型没有发生改变
        byte autoincrementResult = ++byteVar;
        System.out.println("autoincrementResult = " + autoincrementResult);

        //算术运算符的加1可能会改变变量原有数据类型
        byte byteValue = 10;
        //编译错误:从int转换到byte可能会有损失
        //1默认是int类类型,byte和int运算结果是int
        //byte arithmeticResult = byteValue + 1;
        byte arithmeticResult = (byte) (byteValue + 1);
        System.out.println("arithmeticResult = " + arithmeticResult);
    }
}
