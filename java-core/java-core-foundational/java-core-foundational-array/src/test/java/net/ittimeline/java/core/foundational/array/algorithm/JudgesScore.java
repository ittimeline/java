package net.ittimeline.java.core.foundational.array.algorithm;

/**
 * 数值型数值特征值统计算法-评委打分
 * 需求：评委打分
 * 在编程竞赛中，有10位评委为参赛的选手打分，分数分别为5, 4, 6, 8, 9, 7, 8, 9, 8, 5
 * 求选手最后得分（去掉一个最高分和一个最低分后其余八位评委打分的平均值）
 * 实现方式2
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 12:40
 * @since Java21
 */
public class JudgesScore {
    public static void main(String[] args) {
        //1.静态初始化数组保存评委的打分
        int[] scores = {5, 4, 6, 8, 9, 7, 8, 9, 8, 5};
        //2.求最高分最低分、总分
        int max = scores[0];
        int min = scores[0];
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            //求最高分
            if (scores[i] > max) {
                max = scores[i];
            }
            //求最低分
            if (scores[i] < min) {
                min = scores[i];
            }
            //求总分
            sum += scores[i];
        }
        //3.求最后得分:去掉一个最高分和一个最低分后其余八位评委打分的平均值
        int score = (sum - max - min) / (scores.length - 2);
        System.out.println("去掉最高分和最低分之后，平均得分是" + score);
    }
}
