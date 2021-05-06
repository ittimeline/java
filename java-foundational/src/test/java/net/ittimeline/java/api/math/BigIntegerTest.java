package net.ittimeline.java.api.math;

import org.testng.annotations.Test;

import java.math.BigInteger;

/**
 * 超大整数常用方法的测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/28 7:25
 * @since JDK11
 */
public class BigIntegerTest {

    /**
     * int和long的取值范围
     */
    @Test
    public void testIntLongLimit(){
        int intMaxValue=Integer.MAX_VALUE;
        System.out.println("int表示的最大值是"+intMaxValue);

        long longMaxValue=Long.MAX_VALUE;
        System.out.println("long表示的最大值是"+longMaxValue);

    }

    /**
     * BigInteger构造方法的使用
     */
    @Test
    public void testBigIntegerConstructor(){

        BigInteger bigInteger=new BigInteger("922337203685477580700");
        String data=bigInteger.toString();
        System.out.println("data = "+data);

    }


    /**
     * 使用BigInteger完成两个超大整数的加法运算
     */
    @Test
    public void testBigIntegerAdd(){
        BigInteger left=new BigInteger("922337203685477580700");
        BigInteger right=new BigInteger("100000000000000000000");
        BigInteger addResult = left.add(right);
        //%s表示字符串
        System.out.printf("%s + %s = %s \n",left,right,addResult);

    }


    /**
     * 使用BigInteger完成两个超大整数的减法运算
     */
    @Test
    public void testBigIntegerSubtract(){
        BigInteger left=new BigInteger("922337203685477580700");
        BigInteger right=new BigInteger("100000000000000000000");
        BigInteger subtractResult = left.subtract(right);
        //%s表示字符串
        System.out.printf("%s - %s = %s \n",left,right,subtractResult);

    }


    /**
     * 使用BigInteger完成两个超大整数的乘法运算
     */
    @Test
    public void testBigIntegerMultiply(){
        BigInteger left=new BigInteger("922337203685477580700");
        BigInteger right=new BigInteger("100000000000000000000");
        BigInteger multiplyResult = left.multiply(right);
        //%s表示字符串
        System.out.printf("%s * %s = %s \n",left,right,multiplyResult);

    }


    /**
     * 使用BigInteger完成两个超大整数的乘法运算
     */
    @Test
    public void testBigIntegerDivide(){
        BigInteger left=new BigInteger("922337203685477580700");
        BigInteger right=new BigInteger("100000000000000000000");
        BigInteger divideResult = left.divide(right);
        //%s表示字符串
        System.out.printf("%s / %s = %s \n",left,right,divideResult);

    }

    /**
     * BigInteger的类型转换
     */
    @Test
    public void testBigIntegerTypeConversion(){
        BigInteger left=new BigInteger("922337203685477580700");
        BigInteger right=new BigInteger("100000000000000000000");
        BigInteger divideResult = left.divide(right);


        //%s表示字符串
        System.out.printf("%s / %s = %s \n",left,right,divideResult);

        int intValue = divideResult.intValue();

        System.out.println("intValue = "+intValue);

        long longValue = divideResult.longValue();
        System.out.println("longValue = "+longValue);


    }



}
