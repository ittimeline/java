package net.ittimeline.java.core.foundational.array.algorithms;

import java.util.Arrays;
import java.util.Random;

/**
 * 数组常见算法-数值型数组特征值统计-随机两位数
 * 需求：定义一个int类型的一维数组，包含10个元素，分别赋值一些随机两位数，
 * 然后求出所有元素的最大值及其下标、最小值及其下标、总和、平均值，并统计多少个元素比平均值小。
 * 分析：
 * ① 动态初始化数组
 * ② 通过循环给数组元素赋值
 * ③ 求最大值、最小值、总和
 * ④ 求所有最大值下标
 * ⑤ 求所有最小值下标
 * ⑥ 计算平均值（注意要用double保存小数）
 * ⑦ 统计比平均值小的元素个数
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 8:53
 * @since Java 25
 */
public class RandomArrayStatistics {
    static void main() {
        //1.动态初始化数组
        int[] numbers = new int[10];

        //2.通过循环给数组元素赋值（生成10~99之间的随机数）
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            //获取指定范围[a,b]随机数公式：random.nextInt(b - a + 1) + a
            int number = random.nextInt(99 - 10 + 1) + 10;
            numbers[i] = number;
        }
        System.out.println("数组中的元素是：" + Arrays.toString(numbers));

        //3.求最大值、最小值、总和
        int max = numbers[0];
        int min = numbers[0];
        int sum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
            sum += numbers[i];
        }
        System.out.println("最大值是：" + max);
        System.out.println("最小值是：" + min);
        System.out.println("总和是：" + sum);

        //4.求所有最大值下标
        StringBuilder maxIndexStr = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == max) {
                maxIndexStr.append(i).append("\t");
            }
        }
        System.out.println("最大值下标：" + maxIndexStr);

        //5.求所有最小值下标
        StringBuilder minIndexStr = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == min) {
                minIndexStr.append(i).append("\t");
            }
        }
        System.out.println("最小值下标：" + minIndexStr);

        //6.计算平均值（注意要用double保存小数）
        double avg = sum * 1.0 / numbers.length;
        System.out.println("平均值：" + avg);

        //7.统计比平均值小的元素个数
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < avg) {
                count++;
            }
        }
        System.out.println("比平均值小的元素个数有" + count + "个");


    }
}
