package net.ittimeline.java.foundational.array;

import java.util.Arrays;

/**
 * 数组的遍历
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/22 14:56
 * @since JDK11
 */
public class ArrayTraversal {

    public static void main(String[] args) {

        //保存5个分数
        int[] scores = new int []{100,90,80,85,75};

        //通过数组名.length可以动态获取数组的长度
        for (int i = 0; i <scores.length ; i++) {
            System.out.println("获取数组中第"+i+"个元素的结果是"+scores[i]);
        }
        //使用字符串拼接的方式打印数组的每个元素
        System.out.println(Arrays.toString(scores));

        System.out.print("数组元素列表:[");

        for (int i = 0; i < scores.length; i++) {
            //最后一个元素
            if(scores.length-1==i){
                System.out.println(scores[i]+"]");
            }else{
                System.out.print(scores[i]+", ");
            }
        }

    }
}
