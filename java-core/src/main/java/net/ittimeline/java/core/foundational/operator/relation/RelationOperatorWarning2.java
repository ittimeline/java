package net.ittimeline.java.core.foundational.operator.relation;

/**
 * 关系运算符使用注意事项2
 * 大于（>）、大于或者等于（>=）、小于（<）、小于或者等于（<=）用于比较两个数值的大小，
 * 这些运算符只能用于基本数据类型，不能用于引用数据类型
 * <p>
 * 对于浮点数比较（float和double），由于精度问题，可能会出现预期之外的结果。例如，0.1 + 0.2 != 0.3。
 * 因此，在比较浮点数时，通常需要考虑一个误差范围。
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 14:38
 * @since Java 25
 */
public class RelationOperatorWarning2 {
    static void main() {
        // 定义一个双精度浮点数变量left，并赋值为0.1
        double left = 0.1;
        // 定义一个双精度浮点数变量right，并赋值为0.2
        double right = 0.2;
        // 定义一个双精度浮点数变量expectedValue，表示预期的计算结果0.3
        double expectedValue = 0.3;
        // 计算left与right的和，并将结果赋值给actualValue
        double actualValue = left + right;
        // 输出实际计算结果，由于浮点数精度问题，实际结果可能是0.30000000000000004
        System.out.println("0.1 + 0.2 = " + actualValue);
        // 输出0.3与实际计算结果的相等性判断，因为浮点数精度问题，结果通常为false
        System.out.println("0.3 == 0.30000000000000004 相等性判断结果是" + (actualValue == expectedValue));
        // 比较浮点数时，通常考虑一个误差范围，使用差值绝对值来度量误差
        double deviation = Math.abs(actualValue - expectedValue);
        // 判断误差是否小于0.01，如果小于则认为两个浮点数在可接受范围内相等
        System.out.println("0.30000000000000004和0.3 误差小于0.01结果是" + (deviation < 0.01));
    }
}
