package net.ittimeline.java.core.foundational.array.algorithms;

import java.util.Random;

/**
 * 数组常见算法-数组打乱元素顺序-扑克牌洗牌
 * 需求：打乱54张扑克牌的顺序
 * 分析：
 * 1. 生成54张扑克牌（4种花色×13种点数+大王+小王）。
 * 2. 使用Fisher-Yates（费舍尔-耶茨）洗牌算法：
 * ● 遍历数组pokers，索引i从0到pokers.length-1。
 * ● 在[i,pokers.length-1]范围内随机生成索引j。
 * ● 交换pokers[i]与pokers[j]。
 * 该算法保证每个排列等概率出现，且只需一次遍历。
 * 3. 分别打印生成后的牌和洗牌后的牌，每行13张。
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 9:03
 * @since Java 25
 */
public class ShufflePoker {
    static void main() {
        System.out.println("********************************1.生成54张牌********************************");
        //1.定义花色数组（4种）
        String[] colors = {"♠", "♥", "♣", "♦"};
        //2.定义点数数组（13种）
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        //3.创建长度为54的字符串数组，用于存放所有牌
        String[] pokers = new String[54];

        //4.使用双层循环（外层花色，内层点数）生成52张普通牌，通过索引变量依次填入
        //扑克牌索引
        int index = 0;
        //遍历花色
        for (int i = 0; i < colors.length; i++) {
            //遍历点数
            for (int j = 0; j < numbers.length; j++) {
                //拼接扑克牌
                pokers[index++] = colors[i] + numbers[j];
            }
        }
        //5.将“大王”存入数组倒数第二个位置，“小王”存入最后一个位置
        pokers[pokers.length - 2] = "大王";
        pokers[pokers.length - 1] = "小王";

        //6.遍历数组，每打印13张换行
        //打印生成后的牌，每行13张
        for (int i = 0; i < pokers.length; i++) {
            System.out.print(pokers[i] + " ");
            if ((i + 1) % 13 == 0) {
                System.out.println();
            }
        }
        //换行
        System.out.println();
        System.out.println("********************************2.洗牌********************************");
        //使用Fisher-Yates（费舍尔-耶茨）洗牌算法：
        //1.遍历数组pokers，索引i从0到pokers.length-1。
        Random random = new Random();

        for (int i = 0; i < pokers.length; i++) {
            //2.在[i,pokers.length-1]范围内随机生成索引j。
            int j = random.nextInt(i, pokers.length);
            //3.交换pokers[i]与pokers[j]。
            String temp = pokers[i];
            pokers[i] = pokers[j];
            pokers[j] = temp;
        }
        //打印洗牌后的牌，每行13张
        for (int i = 0; i < pokers.length; i++) {
            System.out.print(pokers[i] + " ");
            if ((i + 1) % 13 == 0) {
                System.out.println();
            }
        }

    }
}
