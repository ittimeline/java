package net.ittimeline.java.foundational.control.forstatement;

/**
 * for循环嵌套的执行流程
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/18 15:37
 * @since JDK11
 */
public class ForNest {

    public static void main(String[] args) {

        //统计外层循环的次数
        int outerCount=0;

        //统计内层循环的次数
        int innerCount=0;

        //外层循环
        for (int i = 0; i < 3; i++) {

            outerCount++;
            System.out.print("i = "+i+"\t\t");

            //内层循环
            for (int j = 0; j <5 ; j++) {
                innerCount++;
                System.out.print("j = "+j+"\t\t");

            }
            //外层循环循环一次就换行
            System.out.println();
        }
        System.out.println("外层循环执行的次数"+outerCount+"次");
        System.out.println("内层循环执行的次数"+innerCount+"次");


    }
}
