package net.ittimeline.java.api.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 斗地主游戏第一个版本
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/13 9:31
 * @since JDK11
 */
public class ChinesePokerGameV1 {

    public static void main(String[] args) {
        //1.造牌
        System.out.println("***************步骤1:造牌***************");

        // 有一个集合存放54张牌
        List<String> pokerBox=new ArrayList<>();

        // 有个集合放四个花色 ♥ ♠ ♣ ♦
        List<String> colors =new ArrayList<>();
        colors.addAll(Arrays.asList("♥","♠","♣","♦"));

        //有个集合放其他的13张牌  2 A K Q J 10 9 8 7 6 5 4 3
        List<String> numbers= new ArrayList<>();
        numbers.addAll(Arrays.asList("2","A","K","Q","J","10","9","8","7","6","5","4","3"));

        pokerBox.add("大王");
        pokerBox.add("小王");
        for (String number : numbers) {
            for (String color : colors) {
                String pokerCard=color+number;
                pokerBox.add(pokerCard);
            }
        }

        System.out.println("当前扑克牌的数量"+pokerBox.size());
        System.out.println("当前扑克牌的牌"+pokerBox);


        System.out.println("***************步骤2:洗牌***************");

        Collections.shuffle(pokerBox);
        System.out.println("洗牌之后的牌"+pokerBox);

        System.out.println("***************步骤3:发牌***************");

        // 需要有4个集合存放3个玩家以及底牌的牌
        List<String> player1=new ArrayList<>();
        List<String> player2=new ArrayList<>();
        List<String> player3=new ArrayList<>();
        List<String> cards=new ArrayList<>();

        for (int i = 0; i < pokerBox.size(); i++) {
            String pokerCard = pokerBox.get(i);
            if(i>=51){
                cards.add(pokerCard);
            }else if(i%3==0){
                player1.add(pokerCard);
            }else if(i%3==1){
                player2.add(pokerCard);
            }else if(i%3==2){
                player3.add(pokerCard);
            }
        }

        System.out.println("玩家1牌的数量"+player1.size());
        System.out.println("玩家1牌的牌"+player1);

        System.out.println("玩家2牌的数量"+player2.size());
        System.out.println("玩家2牌的牌"+player2);

        System.out.println("玩家3牌的数量"+player3.size());
        System.out.println("玩家3牌的牌"+player3);

        System.out.println("底牌牌的数量"+cards.size());
        System.out.println("底牌牌的牌"+cards);
    }
}
