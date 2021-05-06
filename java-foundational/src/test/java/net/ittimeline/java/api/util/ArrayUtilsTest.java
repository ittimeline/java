package net.ittimeline.java.api.util;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * 自定义数组工具类测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/26 15:32
 * @since JDK11
 */
public class ArrayUtilsTest {

    @Test
    public void testGeneratorArray(){
        int[]numbers=ArrayUtils.generatorArray(10);
        System.out.println("生成的数组内容"+ Arrays.toString(numbers));
    }

    @Test
    public void testGeneratorArrayBound(){
        int[]numbers=ArrayUtils.generatorArray(10,100);
        System.out.println("生成的数组内容"+ Arrays.toString(numbers));
    }
}
