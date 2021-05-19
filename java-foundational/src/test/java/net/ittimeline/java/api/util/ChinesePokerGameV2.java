package net.ittimeline.java.api.util;

import java.util.*;

/**
 * 斗地主游戏第二个版本
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/13 9:48
 * @since JDK11
 */
public class ChinesePokerGameV2 {

    public static void main(String[] args) {
        //1.造牌
        System.out.println("***************第二版本 步骤1:造牌***************");

        // 要有个Map<Integer,String>存储54张牌，编号是从小到大，对应的牌的顺序是从大到小
        Map<Integer,String> pokerBox=new HashMap<>();
        int id=0;
        // 大王和小王需要单独存放
        pokerBox.put(id++,"大王");
        pokerBox.put(id++,"小王");

        // 有个集合放四个花色 ♥ ♠ ♣ ♦
        List<String> colors =new ArrayList<>();
        colors.addAll(Arrays.asList("♥","♠","♣","♦"));

        //有个集合放其他的13张牌  2 A K Q J 10 9 8 7 6 5 4 3
        List<String> numbers= new ArrayList<>();
        numbers.addAll(Arrays.asList("2","A","K","Q","J","10","9","8","7","6","5","4","3"));
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < colors.size(); j++) {
                String pokerCard=colors.get(j)+numbers.get(i);
                pokerBox.put(id++,pokerCard);
            }
        }
        System.out.println("造牌之后牌的数量"+pokerBox.size());
        System.out.println("造牌之后的牌"+pokerBox);

        System.out.println("***************第二版本 步骤2:洗牌***************");

        Set<Integer> idSet = pokerBox.keySet();
        List<Integer> idList =new ArrayList<>(idSet);
        Collections.shuffle(idList);
        System.out.println("洗牌之后的标记"+idList);

        System.out.println("***************第二版本 步骤3:发牌***************");

        // 要四个集合存放3个玩家以及底牌的牌的标记
        List<Integer> player1Ids=new ArrayList<>();
        List<Integer> player2Ids=new ArrayList<>();
        List<Integer> player3Ids=new ArrayList<>();
        List<Integer> cardIds=new ArrayList<>();

        //将54张牌的编号给3个玩家和底牌
        for (int i = 0; i < idList.size(); i++) {
            Integer pokerId = idList.get(i);
            if(i>=51){
                cardIds.add(pokerId);
            }else if(i%3==0){
                player1Ids.add(pokerId);
            }else if(i%3==1){
                player2Ids.add(pokerId);
            }else if(i%3==2){
                player3Ids.add(pokerId);
            }
        }

        //根据3个玩家以及底牌的牌的标记到Map中找到对应的牌存放到另外的四个集合中，这四个集合分别存放3个玩家的牌以及底牌的牌。
        List<String> player1=new ArrayList<>();
        List<String> player2=new ArrayList<>();
        List<String> player3=new ArrayList<>();
        List<String> cards=new ArrayList<>();

        Set<Map.Entry<Integer, String>> entrySet = pokerBox.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            if(player1Ids.contains(entry.getKey())){
                player1.add(entry.getValue());
            }else if(player2Ids.contains(entry.getKey())){
                player2.add(entry.getValue());
            }else if(player3Ids.contains(entry.getKey())){
                player3.add(entry.getValue());
            }else{
                cards.add(entry.getValue());
            }
        }

        System.out.println("玩家1的牌的数量"+player1.size());
        System.out.println("玩家1的牌"+player1);
        System.out.println("玩家2的牌的数量"+player2.size());
        System.out.println("玩家2的牌"+player2);
        System.out.println("玩家3的牌的数量"+player3.size());
        System.out.println("玩家3的牌"+player3);
        System.out.println("底牌的牌"+cards);
    }
}
