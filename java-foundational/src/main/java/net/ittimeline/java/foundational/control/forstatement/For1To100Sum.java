package net.ittimeline.java.foundational.control.forstatement;

/**
 * 计算1-100的整数和
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/16 22:11
 * @since JDK11
 */
public class For1To100Sum {

    public static void main(String[] args) {

        int sum =0;
        // 计算1-100的整数和
        for (int i = 1; i <=100 ; i++) {
            sum+=i;
        }

        System.out.println("1-100之间的整数和是"+sum);
    }
}
