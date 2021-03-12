package net.ittimeline.java.foundational.syntax.conversion;

/**
 * 类型转换注意事项
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/12 8:52
 * @since JDK11
 */
public class TypeConversionWarning {
    public static void main(String[] args) {
        // 1. boolean不能和其他七种基本数据类型进行类型转换
        boolean booleanVar = true;
        byte byteVar = 100;
        // 编译错误
        // byteVar=booleanVar;

        // 2.强制类型转换，数据可能会损失精度
        double salary = 10000.88;
        System.out.println("salary = " + salary);
        int intSalary = (int) salary;
        System.out.println("intSalary = " + intSalary);

        byte byteLeft=10;
        byte byteRight=20;
        byte byteResult=(byte)(byteLeft+byteRight);
        System.out.println("byteResult = "+byteResult);


        // 3.强制类型转换，数据可能会溢出
        // byte的表示范围  -128 - +127
        // 128 =127+1
        // byteVar =-128
        byteVar = (byte) 128;
        System.out.println("byteVar = " + byteVar);

        //129 =127 +2
        // byteVar =-127
        byteVar = (byte) 129;
        System.out.println("byteVar = " + byteVar);


        //130 =127 +3
        // byteVar =-126
        byteVar = (byte) 130;
        System.out.println("byteVar = " + byteVar);

        // 4. byte,short,char三种类型的变量在进行运算(+)的时候，首先会提升为int类型，再参与运算
        short shortLeft = 100;
        short shortRight = 100;
        //变量的加法运算
        int intResult = shortLeft+shortRight;
        System.out.println("intResult = "+intResult);





    }
}
