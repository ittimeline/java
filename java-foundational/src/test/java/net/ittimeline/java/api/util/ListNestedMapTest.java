package net.ittimeline.java.api.util;

import org.testng.annotations.Test;

import java.util.*;

/**
 * 集合的嵌套使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/12 10:32
 * @since JDK11
 */
public class ListNestedMapTest {


    /**
     * List嵌套List
     */
    @Test
    public void testListNestedList() {

        List<String> asia = new ArrayList<>();
        asia.add("中国");
        asia.add("日本");
        asia.add("韩国");

        List<String> europe = new ArrayList<>();
        europe.add("英国");
        europe.add("法国");
        europe.add("德国");

        List<List<String>> world = new ArrayList<>();
        world.add(asia);
        world.add(europe);

        System.out.println("List嵌套List集合的元素遍历");
        for (List<String> allCountries : world) {
            for (String country : allCountries) {
                System.out.println(country);
            }
        }
    }

    /**
     * List嵌套Map
     */
    @Test
    public void testListNestedMap(){

        Map<String,String> asiaMap=new HashMap<>();
        asiaMap.put("中国","北京");
        asiaMap.put("日本","东京");
        asiaMap.put("韩国","首尔");

        Map<String,String> europeMap=new HashMap<>();
        europeMap.put("英国","伦敦");
        europeMap.put("法国","巴黎");
        europeMap.put("德国","柏林");

        List<Map<String,String>> world =new ArrayList<>();

        world.add(asiaMap);
        world.add(europeMap);

        System.out.println("************************List嵌套Map 集合的元素遍历************************");
        for (Map<String, String> map : world) {

            Set<Map.Entry<String, String>> entrySet = map.entrySet();

            for (Map.Entry<String, String> entry : entrySet) {

                String country = entry.getKey();
                String capital = entry.getValue();
                System.out.println("国家:"+country+"首都:"+capital);
            }
        }
    }


    /**
     * Map嵌套List
     */
    @Test
    public void testMapNestedList(){

        List<String> cityOfChina=new ArrayList<>();
        cityOfChina.add("北京");
        cityOfChina.add("上海");
        cityOfChina.add("广州");
        cityOfChina.add("深圳");

        List<String> cityOfAmerican=new ArrayList<>();
        cityOfAmerican.add("纽约");
        cityOfAmerican.add("旧金山");
        cityOfAmerican.add("波士顿");
        cityOfAmerican.add("底特律");

        Map<String,List<String>> map=new LinkedHashMap<>();
        map.put("中国",cityOfChina);
        map.put("美国",cityOfAmerican);


        System.out.println("****************************Map嵌套List集合元素的遍历***********************");
        Set<Map.Entry<String, List<String>>> entrySet = map.entrySet();
        for (Map.Entry<String, List<String>> entry : entrySet) {
            String country = entry.getKey();
            List<String> cities = entry.getValue();
            System.out.println("国家:"+country+"的主要城市有"+cities);
        }
    }


    /**
     * Map嵌套Map
     */
    @Test
    public void  testMapNestedMap(){
        Map<String,String> asiaMap=new HashMap<>();
        asiaMap.put("中国","北京");
        asiaMap.put("日本","东京");
        asiaMap.put("韩国","首尔");

        Map<String,String> europeMap=new HashMap<>();
        europeMap.put("英国","伦敦");
        europeMap.put("法国","巴黎");
        europeMap.put("德国","柏林");

        Map<String,Map<String,String>> map=new LinkedHashMap<>();
        map.put("亚洲",asiaMap);
        map.put("欧洲",europeMap);

        System.out.println("********************Map嵌套Map集合元素的遍历******************");
        Set<Map.Entry<String, Map<String, String>>> world = map.entrySet();
        for (Map.Entry<String, Map<String, String>> continent : world) {
            //洲名
            String continentName = continent.getKey();
            //每个洲对应的主要国家，以及国家对应的首都
            Map<String, String> continentMap = continent.getValue();
            Set<Map.Entry<String, String>> entrySet = continentMap.entrySet();
            for (Map.Entry<String, String> entry : entrySet) {
                String country = entry.getKey();
                String capital = entry.getValue();
                System.out.println("洲名:"+continentName+"\t国家:"+country+"\t首都"+capital);
            }
            //打印完每个洲的国家对应的首都信息后换行
            System.out.println();
        }
    }

















}
