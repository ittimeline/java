package net.ittimeline.java.api.util;

import net.ittimeline.java.foundational.oop.Cellphone;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.*;

/**
 * Map集合常用方法的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/11 20:43
 * @since JDK11
 */
public class MapTest {
    Map<String,String> map;


    @BeforeClass
    public void initLinkedHashMap(){
        map=new LinkedHashMap<>();
        map.put("中国","北京");
        map.put("韩国","首尔");
        map.put("日本","东京");
        map.put("新加坡","新加坡");
        System.out.println("初始化map之后当前map集合的元素的内容"+map);
    }


    /**
     * 往map集合添加元素
     */
    @Test
    public void testMapPut(){
        Map<String,String> map =new LinkedHashMap<>();
        map.put("中国","北京");
        map.put("韩国","首尔");
        map.put("日本","东京");
        map.put("新加坡","新加坡");
        System.out.println("当前map集合的元素的内容"+map);

        Map<String,String> subMap=new LinkedHashMap<>();
        subMap.put("法国","巴黎");
        subMap.put("英国","伦敦");
        subMap.put("德国","柏林");

        map.putAll(subMap);
        System.out.println("将subMap集合添加到map集合后，当前map集合的元素的内容"+map);


    }


    /**
     * 删除Map集合的元素
     */
    @Test
    public void testMapRemove(){
        String value = map.remove("日本");
        System.out.println("删除日本之后map集合的内容"+map);
        System.out.println("删除日本之后返回的值的结果"+value);
    }


    /**
     * map集合元素的替换
     */
    @Test
    public void testMapReplace(){
        map.replace("日本","大阪");
        System.out.println("日本的首都换成大阪之后map集合元素的内容"+map);
        map.replace("日本","大阪","名古屋");
        System.out.println("日本的首都换成名古屋之后map集合元素的内容"+map);

    }


    /**
     * 集合是否包含指定的key和value
     */
    @Test
    public void testMapContainsKeyContainsValue(){

        boolean isContainsChina = map.containsKey("中国");
        System.out.println("map集合中是否包含中国:"+isContainsChina);

        boolean isContainsBeijing = map.containsValue("北京");
        System.out.println("map集合中是否包含北京:"+isContainsBeijing);

    }

    /**
     * 分别获取Map集合的所有key和value
     */
    @Test
    public void testMapKetSetValues(){
        Set<String> allCountries = map.keySet();
        System.out.println("map集合所有的key是"+allCountries);
        Collection<String> values = map.values();
        System.out.println("map集合所有的value是"+values);
    }

    /**
     *获取Map集合所有的 键值对 对象
     */
    @Test
    public void testMapEntrySet(){
        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        //遍历Set
        for (Map.Entry<String, String> entry : entrySet) {
            String country = entry.getKey();
            String capital = entry.getValue();
            //将键值对对象获取到的键和值拼接后输出
            System.out.println("国家:"+country+"   首都:"+capital);
        }
    }


    /**
     * Map遍历的方式
     */
    @Test
    public void testMapTraversal(){
        System.out.println("********************方式1:根据键找值遍历map********************");

        Set<String> allKey = map.keySet();

        for (String country : allKey) {
            String capital = map.get(country);
            System.out.println("国家:"+country+"   首都:"+capital);
        }

        System.out.println("********************方式2:根据键值对对象遍历map********************");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            String country = entry.getKey();
            String capital = entry.getValue();
            //将键值对对象获取到的键和值拼接后输出
            System.out.println("国家:"+country+"   首都:"+capital);
        }
    }


    /**
     * 1. 键唯一  由哈希表保证唯一
     * 2. 键值对存取无序
     */
    @Test
    public void testHashMapFeature(){

        Map<Cellphone,String> map =new HashMap<>();
        map.put(new Cellphone("小米12 ultra",10999,218),"小米");
        map.put(new Cellphone("华为mate 50 pro plus",11999,228),"华为");
        map.put(new Cellphone("iphone13 pro max",12999,238),"苹果");
        map.put(new Cellphone("小米12 ultra",10999,218),"小米");
        System.out.println("当前map集合的元素个数为:"+map.size());
        System.out.println("***************************当前map集合的元素内容为***************************");
        Set<Map.Entry<Cellphone, String>> entrySet = map.entrySet();
        for (Map.Entry<Cellphone, String> entry : entrySet) {
            Cellphone cellphone = entry.getKey();
            String name = entry.getValue();
            System.out.println("手机信息:"+cellphone+"手机厂商名称"+name);
        }
    }


    /**
     * 1. 键唯一  由哈希表保证唯一
     * 2. 键值对存取有序
     */
    @Test
    public void testLinkedHashMapFeature(){
        Map<Cellphone,String> map =new LinkedHashMap<>();
        map.put(new Cellphone("小米12 ultra",10999,218),"小米");
        map.put(new Cellphone("华为mate 50 pro plus",11999,228),"华为");
        map.put(new Cellphone("iphone13 pro max",12999,238),"苹果");
        map.put(new Cellphone("小米12 ultra",10999,218),"小米");
        System.out.println("当前map集合的元素个数为:"+map.size());
        System.out.println("***************************当前map集合的元素内容为***************************");
        Set<Map.Entry<Cellphone, String>> entrySet = map.entrySet();
        for (Map.Entry<Cellphone, String> entry : entrySet) {
            Cellphone cellphone = entry.getKey();
            String name = entry.getValue();
            System.out.println("手机信息:"+cellphone+"手机厂商名称"+name);
        }
    }

    /**
     * 1. 键唯一  由哈希表保证唯一
     * 2. 有序，按照元素的默认排序规则来排序的，元素所数的类必须实现Comparable接口的compareTo()方法来实现默认排序规则。
     */
    @Test
    public void testTreeMapFeature(){
        Map<Cellphone,String> map =new TreeMap<>();
        map.put(new Cellphone("小米12 ultra",10999,218),"小米");
        map.put(new Cellphone("华为mate 50 pro plus",11999,228),"华为");
        map.put(new Cellphone("iphone13 pro max",12999,238),"苹果");
        map.put(new Cellphone("小米12 ultra",10999,218),"小米");
        System.out.println("当前map集合的元素个数为:"+map.size());
        System.out.println("***************************当前map集合的元素内容为***************************");
        Set<Map.Entry<Cellphone, String>> entrySet = map.entrySet();
        for (Map.Entry<Cellphone, String> entry : entrySet) {
            Cellphone cellphone = entry.getKey();
            String name = entry.getValue();
            System.out.println("手机信息:"+cellphone+"手机厂商名称"+name);
        }

    }

    /**
     * TreeMap自定义排序规则
     * 按照价格从低到高升序排序
     */
    @Test
    public void testTreeMapCustomSort(){
        Map<Cellphone,String> map =new TreeMap<>(new Comparator<Cellphone>() {
            @Override
            public int compare(Cellphone cellphone1, Cellphone cellphone2) {
                return cellphone1.getPrice()-cellphone2.getPrice();
            }
        });
        map.put(new Cellphone("小米12 ultra",10999,218),"小米");
        map.put(new Cellphone("华为mate 50 pro plus",11999,228),"华为");
        map.put(new Cellphone("iphone13 pro max",12999,238),"苹果");
        map.put(new Cellphone("小米12 ultra",10999,218),"小米");
        System.out.println("当前map集合的元素个数为:"+map.size());
        System.out.println("***************************按照价格从低到高升序排序 当前map集合的元素内容为***************************");
        Set<Map.Entry<Cellphone, String>> entrySet = map.entrySet();
        for (Map.Entry<Cellphone, String> entry : entrySet) {
            Cellphone cellphone = entry.getKey();
            String name = entry.getValue();
            System.out.println("手机信息:"+cellphone+"手机厂商名称"+name);
        }
    }







}
