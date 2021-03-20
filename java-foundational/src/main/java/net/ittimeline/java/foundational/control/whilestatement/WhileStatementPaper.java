package net.ittimeline.java.foundational.control.whilestatement;

/**
 * 折纸
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/18 7:24
 * @since JDK11
 */
public class WhileStatementPaper {

    public static void main(String[] args) {
        // 珠穆朗玛峰的高度是8848.86米
        //一张纸的厚度是0.1毫米,折叠多少次能超过珠穆朗玛峰的高度

        int height=88488600;
        int paperHeight=1;

        int count =0;

        while (paperHeight<=height){
            // paperHeight = paperHeight *2
            paperHeight*=2;
            count++;
        }

        System.out.println("一共折叠了"+count+"次"+"当前纸张的高度"+paperHeight+"毫米");


    }
}
