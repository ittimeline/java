package net.ittimeline.java.core.foundational.operator.arithmetic;

/**
 * 算术运算符使用注意事项2
 * 两个整数相加、相乘，结果超过了该类型的表示范围，就会发生溢出，导致结果不正确。在处理大数值时，可以考虑使用long类型
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 9:46
 * @since Java21
 */
public class ArithmeticOperatorWarning2 {
    public static void main(String[] args) {
        int maxValue = 0x7fffffff;
        System.out.println("int所能存储的最大值是" + maxValue);
        //当两个整数相加、相乘，结果超过了该类型的表示范围，就会发生溢出。
        int intSum = maxValue + 1;
        //导致结果不正确
        System.out.println("intSum = " + intSum);
        //在处理大数值时，可以考虑使用long类型
        //方式1：将整数字面量1提升为long类型
        long longSumWay1 = maxValue + 1L;
        System.out.println("longSumWay1 = " + longSumWay1);
        //方式2：将maxValue强制转换为long类型
        long longSumWay2 = (long) maxValue + 1;
        System.out.println("longSumWay2 = " + longSumWay2);
    }
}
