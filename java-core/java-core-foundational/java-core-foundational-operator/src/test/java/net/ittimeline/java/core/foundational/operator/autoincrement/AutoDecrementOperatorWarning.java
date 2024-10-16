package net.ittimeline.java.core.foundational.operator.autoincrement;

/**
 * 自减运算符使用注意事项
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 11:30
 * @since Java21
 */
public class AutoDecrementOperatorWarning {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("初始化赋值后 number = " + number);

        //前置--：先自减1，后参与运算
        //先将number的值减1，后赋值给beforeResult
        int beforeResult = --number;
        System.out.println("1.前置--：先自减1，后参与运算");
        System.out.println("前置--自减1后 number = " + number);
        System.out.println("前置--自减1后 beforeResult = " + beforeResult);

        //后置--：先参与运算，后自减1
        int value = 10;
        System.out.println("初始化赋值后 value = " + value);
        int afterResult = value--;
        System.out.println("2.后置--：先参与运算，后自减1");
        System.out.println("后置--自减1后 value = " + value);
        System.out.println("后置--自减1后 afterResult = " + afterResult);
    }
}
