package net.ittimeline.java.foundational.control.forstatement;

/**
 * 打印输出1-100的偶数
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/16 22:06
 * @since JDK11
 */
public class For1To100EvenNumber {

    public static void main(String[] args) {
        // 打印输出1-100的偶数

        for (int i = 1; i <=100 ; i++) {
            // 判断i是不是偶数
            if (i % 2==0){
                System.out.print(i+" ");
            }
        }
    }
}
