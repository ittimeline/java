package net.ittimeline.java.foundational.control.forstatement;

/**
 * 九九乘法表
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/18 20:58
 * @since JDK11
 */
public class ForNestNineNineMultiplicationTable {

    public static void main(String[] args) {

        //外层循环控制行数
        for (int i = 1; i <=9 ; i++) {
            //内层循环控制列数
            for (int j = 1; j <=i ; j++) {
                System.out.printf("%d * %d = %2d \t",j,i,j*i);
            }
            //每次所有的列的表达式打印完成后换行
            System.out.println();
        }
    }
}
