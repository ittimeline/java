package net.ittimeline.java.api.util;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * 字符串工具类测试用例
 * @author tony 18601767221@163.com
 * @version 2021/4/29 10:04
 * @since JDK11
 */
public class StringUtilsTest {


    @Test
    public void testStringUtilsReverse(){
        String str=null;
        System.out.println(StringUtils.reverse(str));
    }

    @Test
    public void testStringUtilsArrayToString(){
        int[]array={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(array));
        System.out.println(StringUtils.arrayToString(array));
    }

    @Test
    public void testStringOperator(){
        String str=null;
        System.out.println(str.indexOf("0"));

    }

}
