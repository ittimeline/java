package net.ittimeline.java.core.foundational.operator.assignment;

/**
 * 赋值运算符基本使用
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 21:04
 * @since Java21
 */
public class AssignmentOperator {
    public static void main(String[] args) {
        //赋值运算符使用方式1
        System.out.println("******************赋值运算符使用方式1******************");
        int number = 10;
        System.out.println("number = " + number);
        //第二次赋值时新值会覆盖旧值
        number = 20;
        System.out.println("number = " + number);

        //当=两侧数据类型不一致，可以使用自动类型转换或者使用强制类型转换原则进行处理
        double doubleValue = 5;
        System.out.println("doubleValue = " + doubleValue);
        long longValue = 10;

        int intValue = (int) 180.05;
        System.out.println("intValue = " + intValue);
        byte byteValue = (byte) intValue;
        System.out.println("byteValue = " + byteValue);
        //连续赋值
        int left;
        int right;
        //30行 int left ;和31行 int right; 等价于 int left , right;
        left = right = 10;
        System.out.printf("连续赋值 left=%d right=%d\n", left, right);
        //赋值运算符使用方式2
        System.out.println("******************赋值运算符使用方式2******************");
        int x = 10, y = 20, z = 30;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        //赋值表达式本身也是有值，其值就是给变量赋的值。
        int value = 10;
        System.out.println("赋值表达式value = 100的结果是 " + (value = 100));
        System.out.println("value = " + value);
    }
}
