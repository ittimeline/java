package net.ittimeline.java.foundational.method;

/**
 * 整数相关操作的工具类
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/11 16:19
 * @since JDK11
 */
public class NumberUtils {


    /**
     * 比较两个整数是否相等
     * @param left 第一个整数参数
     * @param right 第二个整数参数
     * @return 两个整数是否相等
     */
    public static  boolean compare(int left,int right){

        return left==right;
    }


    /**
     * 实现指定区间的整数和
     * @param start 开始区间
     * @param end 结束区间
     * @return 指定区间的整数和
     */
    public static int sum(int start,int end){
        int result=0;
        for (int i = start; i <=end ; i++) {
            result+=i;
        }

        return result;
    }
}
