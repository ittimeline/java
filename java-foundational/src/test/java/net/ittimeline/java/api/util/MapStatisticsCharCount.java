package net.ittimeline.java.api.util;

import java.util.*;

/**
 * 需求:要求用户从控制台输入一段字符串，然后读取这段字符串，统计用户输入的每个字符的个数。
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/12 9:41
 * @since JDK11
 */
public class MapStatisticsCharCount {

    public static void main(String[] args) {
        System.out.println("请输入一段字符串");
        Scanner input =new Scanner(System.in);
        //读取用户输入的字符串保存到text中
        String text=input.nextLine();
        //将字符串转换为字符数组
        char[] chars = text.toCharArray();
        //创建map对象存储统计的字符对应的个数信息
        Map<Character,Integer> map =new TreeMap<>();
        //遍历字符数组，统计每个字符的个数
        for (char ch : chars) {
            //用户输入了重复的字符
            if(map.containsKey(ch)){
                //把字符的个数取出来
                Integer count = map.get(ch);
                //然后自增1
                count++;
                //覆盖原来的个数
                map.put(ch,count);
            }
            //用户输入的字符没有重复
            else{
                map.put(ch,1);
            }
        }

        System.out.println("当前map集合的内容"+map);


        System.out.println("*****************统计用户输入的字符个数信息*****************");
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            Character ch = entry.getKey();
            Integer count = entry.getValue();
            System.out.println("字符"+ch+" 个数"+count);
        }
    }
}
