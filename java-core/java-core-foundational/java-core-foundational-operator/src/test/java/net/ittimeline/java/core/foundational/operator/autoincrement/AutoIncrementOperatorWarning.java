package net.ittimeline.java.core.foundational.operator.autoincrement;

/**
 * 自增运算符使用注意事项
 * 自增运算符和操作数（通常是变量）组成自增表达式参与运算时
 * ● 前置++是先自增1，后参与运算
 * ● 后置++是先参与运算，后自增1
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 11:23
 * @since Java21
 */
public class AutoIncrementOperatorWarning {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("初始化赋值后 number = " + number);

        //前置++：先自增1，后参与运算
        //先将number的值加1，后赋值给beforeResult
        int beforeResult = ++number;
        System.out.println("1.前置++：先自增1，后参与运算");
        System.out.println("前置++自增1后 number = " + number);
        System.out.println("前置++自增1后 beforeResult = " + beforeResult);

        //后置++：先参与运算，后自增1
        int value = 10;
        System.out.println("初始化赋值后 value = " + value);
        int afterResult = value++;
        System.out.println("2.后置++：先参与运算，后自增1");
        System.out.println("后置++自增1后 value = " + value);
        System.out.println("后置++自增1后 afterResult = " + afterResult);
    }
}
