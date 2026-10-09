package net.ittimeline.java.core.foundational.array.algorithms;

/**
 * 数组常见算法-数组元素赋值-生成扑克牌
 * 需求：生成并遍历54张扑克牌
 * 分析：
 * ① 定义花色数组（4种）
 * ② 定义点数数组（13种）
 * ③ 创建长度为54的字符串数组，用于存放所有牌
 * ④ 使用双层循环（外层花色，内层点数）生成52张普通牌，通过索引变量依次填入
 * ⑤ 将“大王”存入数组倒数第二个位置，“小王”存入最后一个位置
 * ⑥ 遍历数组，每打印13张换行
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 8:56
 * @since Java 25
 */
public class PokerGenerator {
    static void main() {
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
        //将“大王”存入数组倒数第二个位置，“小王”存入最后一个位置
        pokers[pokers.length - 2] = "大王";
        pokers[pokers.length - 1] = "小王";

        //6.遍历数组，每打印13张换行
        System.out.println("遍历扑克牌");
        for (int i = 0; i < pokers.length; i++) {
            System.out.print(pokers[i] + " ");
            if ((i + 1) % 13 == 0) {
                System.out.println();
            }
        }

    }
}
