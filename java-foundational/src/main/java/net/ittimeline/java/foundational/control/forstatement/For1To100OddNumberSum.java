package net.ittimeline.java.foundational.control.forstatement;

/**
 * 计算1-100之间的奇数和
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/16 22:16
 * @since JDK11
 */
public class For1To100OddNumberSum {

    public static void main(String[] args) {

        int sum =0;
        // 计算1-100之间的奇数和
        
        for (int i =1;i<100;i++){
            // 判断i是不是奇数
            if(i%2!=0){
                sum+=i;
            }
        }

        System.out.println("1-100之间的奇数和是"+sum);


    }
}
