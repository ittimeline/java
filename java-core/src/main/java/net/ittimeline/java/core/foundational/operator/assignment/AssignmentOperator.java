package net.ittimeline.java.core.foundational.operator.assignment;

/**
 * 赋值运算符使用
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 15:13
 * @since Java 25
 */
public class AssignmentOperator {
    static void main() {
        //赋值运算符使用方式1
        System.out.println("******************赋值运算符使用方式1：一次赋值一个变量******************");
        int number = 10;
        System.out.println("number = " + number);
        //第二次赋值时新值会覆盖旧值
        number = 20;
        System.out.println("number = " + number);

        //当=两侧数据类型不一致，可以使用自动类型转换或者使用强制类型转换原则进行处理
        //自动类型转换
        double doubleValue = 5;
        System.out.println("doubleValue = " + doubleValue);
        long longValue = 10;
        System.out.println("longValue = " + longValue);

        //强制类型转换
        int intValue = (int) 180.05;
        System.out.println("intValue = " + intValue);
        byte byteValue = (byte) intValue;
        System.out.println("byteValue = " + byteValue);
        System.out.println("******************赋值运算符使用方式2：一次赋值多个变量******************");
        int left;
        int right;
        // int left ;和 int right; 等价于 int left , right;
        //Java支持连续赋值，即同时给多个变量赋相同的值
        left = right = 10;
        System.out.printf("连续赋值 left=%d right=%d\n", left, right);
        //在声明变量时使用逗号分隔，同时为多个变量赋不同的初始值
        int x = 10, y = 20, z = 30;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        //赋值表达式的值就是赋给变量的值，且具有右结合性。
        int value = 10;
        System.out.println("赋值表达式value = 100的结果是 " + (value = 100));
        System.out.println("value = " + value);
    }

}
