package net.ittimeline.java.foundational.control.whilestatement;

/**
 * while死循环注意事项
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/17 21:51
 * @since JDK11
 */
public class WhileEndlessLoopWarning {

    public static void main(String[] args) {

        int i=0;
        while(i<50){
            System.out.print(i+" ");
            i++;
        }

    }
}
