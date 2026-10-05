package net.ittimeline.java.core.foundational.operator.arithmetic;

/**
 * 字符类型与算术运算
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 14:30
 * @since Java 25
 */
public class CharTypeArithmetic {
    static void main() {
        //通过Unicode字符集编码进行算术运算实现大小写转换
        //需求：大写A转换为小写a
        //字符a对应的Unicode字符集码点（编码）是97
        char upperA = 'A';
        //实现方式1
        //(char)(upperA + 32)表示将65和32相加的结果强制转换为字符类型
        char lower = (char) (upperA + 32);
        System.out.println("大写A转换为小写a 实现方式1 lower = " + lower);
        //实现方式2
        //32的十六进制是20
        lower = (char) (upperA + 0x20);
        System.out.println("大写A转换为小写a 实现方式2  lower = " + lower);

        //需求：小写z转换为大写z
        char lowerZ = 'z';
        char upperZ = (char) (lowerZ - 32);
        System.out.println("小写z转换为大写z 实现方式1 upperZ = " + upperZ);
        upperZ = (char) (lowerZ - 0x20);
        System.out.println("小写z转换为大写z 实现方式2 upperZ = " + upperZ);
    }
}
