package net.ittimeline.java.api.util;

/**
 * 自定义数组工具类
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/26 15:28
 * @since JDK11
 */
public class ArrayUtils {

    /**
     * 产生一个整数数组，数组的值是随机的，在int的取值范围之内
     * @param length
     * @return
     */
    public static int[] generatorArray(int length){
        if(length<1){
            throw new RuntimeException("数组的长度非法");
        }
        return RandomUtils.randomArray(length);
    }

    public static int[] generatorArray(int length,int bound){
        if(length<1){
            throw new RuntimeException("数组的长度非法");
        }
        if(bound<1){
            throw new RuntimeException("指定的区间非法");
        }
        return RandomUtils.randomArray(length,bound);
    }

}
