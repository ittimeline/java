package net.ittimeline.java.api.lang;

import org.testng.annotations.Test;

/**
 * 数学工具类常用方法的测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/28 9:16
 * @since JDK11
 */
public class MathTest {


    /**
     * 求绝对值
     */
    @Test
    public void testMathAbs(){
        System.out.println("-10的绝对值是"+Math.abs(-10));
        System.out.println("10的绝对值是"+Math.abs(10));
        System.out.println("-3.14的绝对值是"+Math.abs(-3.14));
        System.out.println("3.14的绝对值是"+Math.abs(3.14));
    }


    /**
     * 求两个数的最大值和最小值
     */
    @Test
    public void testMathMaxMin(){
        int left=10;
        int right=20;

        System.out.println("两个整数的最大值是"+Math.max(left,right));
        System.out.println("两个整数的最小值是"+Math.min(left,right));
    }


    /**
     * 向上取整和向下取整
     */
    @Test
    public void testMathCeilFloor(){

        System.out.println("3.14向上取整的结果"+Math.ceil(3.14));
        System.out.println("3.14向下取整的结果"+Math.floor(3.14));

    }

    /**
     * 四舍五入
     */
    @Test
    public void testMathRound(){

        //4
        System.out.println("3.5四舍五入的结果是"+Math.round(3.5));
        //3
        System.out.println("3.4四舍五入的结果是"+Math.round(3.4));
    }


    /**
     * 计算a的b次方
     */
    @Test
    public  void testMathPow(){

        System.out.println("2的3次方的结果是"+Math.pow(2.0,3.0));
    }


    /**
     * 开方的运算
     */
    @Test
    public void testMathSqrt(){

        System.out.println("4开方的结果是"+Math.sqrt(4));
    }


}
