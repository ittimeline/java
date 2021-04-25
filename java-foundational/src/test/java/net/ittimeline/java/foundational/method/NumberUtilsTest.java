package net.ittimeline.java.foundational.method;

/**
 * 整数相关功能测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/11 16:22
 * @since JDK11
 */
public class NumberUtilsTest {

    public static void main(String[] args) {
        int left=10;
        int right=10;
        boolean result= NumberUtils.compare(left,right);
        System.out.println(result==true?"两个整数相等":"两个整数不相等");

        int sum =NumberUtils.sum(1,50);
        System.out.println("1-50之间的整数和是"+sum);

    }
}
