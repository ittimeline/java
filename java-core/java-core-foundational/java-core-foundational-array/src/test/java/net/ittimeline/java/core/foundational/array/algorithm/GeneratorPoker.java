package net.ittimeline.java.core.foundational.array.algorithm;

/**
 * 数组元素赋值算法-生成扑克牌
 * 需求：生成并遍历54张扑克牌
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 12:54
 * @since Java21
 */
public class GeneratorPoker {
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

        int index = 2;
        for (int i = 0; i < colors.length; i++) {
            String color = colors[i];
            for (int j = 0; j < numbers.length; j++) {
                String number = numbers[j];
                pokers[index] = color + number;
                index++;
            }
        }
        System.out.println("遍历扑克牌");
        for (int i = 0; i < pokers.length; i++) {
            System.out.print(pokers[i] + " ");
            if ((i + 12) % 13 == 0) {
                System.out.println();
            }
        }
    }
}
