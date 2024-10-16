package net.ittimeline.java.core.foundational.operator.relation;

/**
 * 关系运算符使用注意事项2
 * ● 大于（>）、大于或者等于（>=）、小于（<）、小于或者等于（<=）用于比较两个数值的大小，这些运算符只能用于基本数据类型，不能用于对象
 * ● 对于浮点数比较（float和double），由于精度问题，可能会出现预期之外的结果。例如，0.1 + 0.2 != 0.3。因此，在比较浮点数时，通常需要考虑一个误差范围。
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 13:25
 * @since Java21
 */
public class RelationOperatorWarning2 {
    public static void main(String[] args) {
        double left = 0.1;
        double right = 0.2;
        double expectedValue = 0.3;
        double actualValue = left + right;

        System.out.println("0.1 + 0.2 = " + (left + right));
        //可能输出false
        System.out.println("0.3 == 0.30000000000000004 相等性判断结果是" + (actualValue == (left + right)));
        //比较浮点数时，通常考虑一个误差范围
        double deviation = actualValue - expectedValue;
        System.out.println("0.30000000000000004和0.3 误差小于0.01结果是" + (deviation < 0.01));
    }
}
