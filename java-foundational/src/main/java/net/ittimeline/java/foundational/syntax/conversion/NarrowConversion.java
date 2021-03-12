package net.ittimeline.java.foundational.syntax.conversion;

/**
 * 强制类型转换
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/11 19:45
 * @since JDK11
 */
public class NarrowConversion {
    public static void main(String[] args) {
        // 取值范围较小的数据类型 变量名  = (取值范围较小的数据类型 ) 取值范围较大的数据类型的数值 ;
        double salary =10000.0;
        System.out.println("salary = "+salary);
        int intSalary=(int)salary;
        System.out.println("intSalary = "+intSalary);


    }
}
