package net.ittimeline.java.api.math;

import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * 超大浮点数的常用方法测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/28 7:48
 * @since JDK11
 */
public class BigDecimalTest {

    /**
     * 浮点数的精度问题
     */
    @Test
    public void testFloatPrecision(){
        System.out.println("1.0 - 0.1 = "+(1.0-0.1));
        System.out.println("1.0 - 0.32 = "+(1.0-0.32));
    }

    /**
     * 错误使用的构造方法
     */
    @Test
    public void testBigDecimalConstructorDouble(){
        BigDecimal left=new BigDecimal(1.0);
        BigDecimal right=new BigDecimal(0.32);

        BigDecimal subtractResult = left.subtract(right);

        System.out.printf("%s - %s = %s\n",left,right,subtractResult);
    }

    /**
     * 正确的方法
     */
    @Test
    public void testBigDecimalConstructorString(){
        BigDecimal left=new BigDecimal("1.0");
        BigDecimal right=new BigDecimal("0.32");

        BigDecimal subtractResult = left.subtract(right);

        System.out.printf("%s - %s = %s\n",left,right,subtractResult);
    }

    /**
     * BigDecimal的除法运算
     *
     */
    @Test
    public void testBigDecimalDivide(){
        BigDecimal left=new BigDecimal("10.0");
        BigDecimal right=new BigDecimal("3.0");
        /**
         * scale 2表示小数点后保留2位
         * RoundingMode.HALF_UP 表示四舍五入
         */
        BigDecimal divideResult = left.divide(right,2, RoundingMode.HALF_UP);
        System.out.printf("%s / %s = %s\n",left,right,divideResult);

    }


}
