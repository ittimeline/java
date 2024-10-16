package net.ittimeline.java.core.foundational.syntax.variable.type.primitive;

/**
 * 字符类型与算术运算
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 9:10
 * @since Java21
 */
public class CharacterTypeArithmeticOperator {
    public static void main(String[] args) {
        //通过Unicode字符集编码进行算术运算实现大小写转换
        //需求：大写A转小写a
        //字符a对应的Unicode字符集码点（编号）是97
        char uppercaseLetterA = 'A';
        //(char)(upperA+32) 表示将65和32相加的结果强制转换为字符类型
        char lowercaseLetterA = (char) (uppercaseLetterA + 32);
        //另一种实现方式
        //32的十六进制表示为20
        //lowercaseLetterA = (char) (uppercaseLetterA + 0x20);
        System.out.println("lowercaseLetterA = " + lowercaseLetterA);

        //需求:小写z转换为大写Z
        char lowerCaseLettersZ = 'z';
        //(char)(lowerCaseLettersZ+0x20) 表示将122-32结果强制转换为字符类型
        char uppercaseLetterZ = (char) (lowerCaseLettersZ - 32);
        System.out.println("uppercaseLetterZ = " + uppercaseLetterZ);
    }
}
