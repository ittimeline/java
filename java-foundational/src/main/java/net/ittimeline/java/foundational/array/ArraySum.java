package net.ittimeline.java.foundational.array;

/**
 * 数组累加求和
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/22 15:03
 * @since JDK11
 */
public class ArraySum {

    public static void main(String[] args) {
        //保存5个分数
        int[] scores = new int []{100,90,80,85,75};

        //1. 定义变量保存累加求和的结果 sum

        int sum =0;
        //2. 遍历数组,获取每个元素并且累加求和 sum+=scores[i]

        for (int i = 0; i < scores.length ; i++) {
            sum+=scores[i];
        }
        //3. 打印输出累加求和的结果
        System.out.println("总分:"+sum);

    }
}
