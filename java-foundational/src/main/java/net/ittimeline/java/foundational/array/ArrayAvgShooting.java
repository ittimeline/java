package net.ittimeline.java.foundational.array;

/**
 * 射击游戏
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/22 15:10
 * @since JDK11
 */
public class ArrayAvgShooting {

    public static void main(String[] args) {
        /*
        需求: 模拟射击游戏 ,每个人可以射击10次,每次的分数是0-10之间,求平均分

            去掉最高分
            去掉最低分

         */

        // 1. 静态初始化10次射击的成绩
        int[] scores=new int []{1,2,4,5,7,8,9,6,3,0};

        int max =scores[0];

        int min= scores[0];

        int sum =scores[0];



        //2. 遍历10次的成绩,求最大值,最小值以及求和都可以在一个for循环中搞定
        for (int i = 1; i < scores.length; i++) {

            if(scores[i]>max){
                max=scores[i];
            }

            if(scores[i]<min){
                min=scores[i];
            }

            sum+=scores[i];

        }

        System.out.println("10次射击的最高分:"+max);
        System.out.println("10次射击的最低分:"+min);
        System.out.println("10次射击的总分"+sum);

        //求去掉最高分和最低分后的平均分
        double avg =(sum-max-min)/8.0;
        System.out.println("10次射击的平均分"+avg);


    }
}
