package net.ittimeline.java.foundational.array;

/**
 * 数组不可变性
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/21 19:53
 * @since JDK11
 */
public class ArrayImmutability {

    public static void main(String[] args) {
        //静态初始化一个整数数组
        int[] scores =new int []{100,90,80};
        /*
           [I@6cd8737
         */
        System.out.println("第一次静态初始化打印数组名"+scores);

        scores=new int[]{100,90,80,95,75};

        /*
        [I@22f71333
         */
        System.out.println("数组扩容之后打印数组名"+scores);


    }
}
