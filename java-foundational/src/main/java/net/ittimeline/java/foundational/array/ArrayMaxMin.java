package net.ittimeline.java.foundational.array;

/**
 * 求数组元素的最大值和最小值
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/22 15:05
 * @since JDK11
 */
public class ArrayMaxMin {


    public static void main(String[] args) {
        //保存5个分数
        int[] scores = new int []{100,90,120,85,75};


      //  1. 定义变量保存最大值
        int max =scores[0];

        int min=scores[0];
      //  2. 遍历数组,将数组中的每个元素和最大值进行对比,如果比最大值还要大,那么就将数组的元素赋值给最大值

        for (int i = 1; i <scores.length ; i++) {
            if(scores[i]>max){
                max=scores[i];
            }

            if(scores[i]<min){
                min=scores[i];
            }
        }
      //  3. 打印输出最大值
        System.out.println("最高分:"+max);


        System.out.println("最低分:"+min);

    }
}
