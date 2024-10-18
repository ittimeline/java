package net.ittimeline.java.core.foundational.array.algorithm;

/**
 * 打乱数组顺序算法-扑克牌洗牌
 * 分析：
 * ● 生成54张扑克牌
 * ● 遍历54张牌，将每张扑克牌和随机索引对应的扑克牌进行交换，通过(int)(Math.random()*54)生成随机索引
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 15:00
 * @since Java21
 */
public class PokerShuffle {
    public static void main(String[] args) {
        //1.准备一副牌
        //4种花色
        String[] colors = {"♥", "♠", "♣", "♦"};
        //11种数字
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        //54张牌
        String[] pokers = new String[54];
        //0号索引放大王
        pokers[0] = "大王";
        //1号索引放小王
        pokers[1] = "小王";
        //生成54张牌
        int index = 2;
        for (int i = 0; i < colors.length; i++) {
            String color = colors[i];
            for (int j = 0; j < numbers.length; j++) {
                String number = numbers[j];
                pokers[index] = color + number;
                index++;
            }
        }

        //洗牌：打乱扑克牌顺序
        //遍历54张牌，将每张扑克牌和随机索引对应的扑克牌进行交换
        for (int i = 0; i < pokers.length; i++) {
            //通过(int)(Math.random()*54)生成随机索引
            int randIndex = (int) (Math.random() * pokers.length);
            String temp = pokers[i];
            pokers[i] = pokers[randIndex];
            pokers[randIndex] = temp;
        }
        System.out.println("******************遍历扑克牌******************");
        for (int i = 0; i < pokers.length; i++) {
            System.out.print(pokers[i] + " ");
            if ((i + 12) % 13 == 0) {
                System.out.println();
            }
        }
    }
}
