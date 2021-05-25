package net.ittimeline.java.jdk.feature.java8;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream API的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/24 10:39
 * @since JDK11
 */
public class StreamAPITest {

    List<String> list;

    @BeforeClass
    public void initList(){
        list =new ArrayList<>();

        list.add("孙悟空");
        list.add("猪八戒");
        list.add("沙和尚");
        list.add("唐僧");
        list.add("刘备");
        list.add("刘邦");

        System.out.println("初始化list集合的元素"+list);

    }


    /**
     * 使用传统方式操作集合
     * 1. 遍历
     * 2. 创建新集合存储结果
     */
    @Test
    public void testListOperator(){


        //需求 获取名字长度为3的元素

        System.out.println("1.使用传统方式获取名字长度为3的元素");

        List<String> result =new ArrayList<>();
        for (String name : list) {
            if(name.length()==3){
                result.add(name);
            }
        }
        for (String name : result) {
            System.out.println(name);
        }

        System.out.println("2.使用传统方式获取名字姓刘的元素");
        List<String> liuList=new ArrayList<>();
        for (String name : list) {
            if(name.startsWith("刘")){
                liuList.add(name);
            }
        }
        for (String name : liuList) {
            System.out.println(name);
        }

    }


    /**
     * Stream API 不需要遍历集合，也不需要创建新的集合存储结果
     */
    @Test
    public void testStreamAPI(){
        System.out.println("1.使用Stream API方式获取名字长度为3的元素");
        list.stream().filter((name)->name.length()==3).forEach((name)->{
            System.out.println(name);
        });

        System.out.println("2.使用Stream API方式获取名字姓刘的元素");
        list.stream().filter((name)->name.startsWith("刘")).forEach(name-> System.out.println(name));

    }


    /**
     * Collection获取Stream
     */
    @Test
    public void testCollectionGetStream(){

        List<String> list=new ArrayList<>();
        list.add("北京");
        list.add("上海");
        list.add("广州");
        list.add("深圳");

        //List获取Stream
        Stream<String> listStream = list.stream();

        Set<String> set =new HashSet<>(list);

        //Set获取Stream
        Stream<String> setStream = set.stream();

    }


    /**
     * Map集合获取Stream的三种方式
     */
    @Test
    public void testMapGetStream(){

        Map<String,String > map =new HashMap<>();
        map.put("中国","北京");
        map.put("德国","柏林");
        map.put("英国","伦敦");

        //map通过keySet()获取Stream
        Stream<String> setStream=  map.keySet().stream();
        //map通过values()获取Stream
        Stream<String> collectionStream = map.values().stream();
        //map通过entrySet()获取Stream
        Stream<Map.Entry<String, String>> entrySetStream = map.entrySet().stream();
    }


    /**
     * 数组获取Stream
     */
    @Test
    public void testArrayGetStream(){
        String[] cities={"北京","上海","广州","深圳"};
        Stream<String> arrayStream = Stream.of(cities);
    }


    /**
     * Stream的forEach的使用
     */
    @Test
    public void testStreamForEach(){
        list.stream().forEach((name)->{
            System.out.println(name);
        });

    }


    /**
     * Stream的count的使用
     */
    @Test
    public void testStreamCount(){
        long count = list.stream().count();
        System.out.println("集合元素的个数"+count);

    }

    /**
     * Stream的filter方法的使用
     */
    @Test
    public void testStreamFilter(){

        //filter方法是延迟方法，单独调用是不会执行的。
        //该方法的作用就是用来按照指定的过滤条件过滤流的数据
        list.stream().filter((name)->{
            return name.length()==3;
        }).forEach(System.out::println);
    }


    /**
     *   Stream的limit方法的使用
     *   如果limit的maxSize超过了流中元素的数量，limit不操作
     *   比如说这里的流中只有3个元素，maxSize是5个，那么limit不操作
     */
    @Test
    public void testStreamLimit(){
        list.stream().filter(name->name.length()==3).limit(5)
                .forEach(name-> System.out.println(name));
    }


    /**
     * Stream的skip的使用
     */
    @Test
    public void testStreamSkip(){

        System.out.println("skip之前");
        list.stream().forEach((name)->{
            System.out.println(name);
        });

        System.out.println("skip之后");
        list.stream().skip(2).forEach(name-> System.out.println(name));


    }


    /**
     * 使用Stream的map方法将集合元素的字符串类型转换为整数(Integer)类型
     */
    @Test
    public void testStreamMapString2Integer(){
        List<String> orderStrIdList=new ArrayList<>();
        orderStrIdList.add("10000");
        orderStrIdList.add("10001");
        orderStrIdList.add("10002");

        List<Integer> orderIdList=new ArrayList<>();
        orderStrIdList.stream().map((orderStrId)->{
            //将字符串的订单号转换为整数的订单号
            return Integer.valueOf(orderStrId);
        }).forEach((orderId)->{
            orderIdList.add(orderId);
        });

        System.out.println("使用Stream的map方法将集合元素的字符串类型转换为整数(Integer)类型");
        for (Integer orderId : orderIdList) {
            System.out.println(orderId);
        }


    }
    /**
     * 使用Stream的map方法将集合元素的字符串类型转换为字符串类型
     */
    @Test
    public void testStreamMapString(){
        List<String> orderStrIdList=new ArrayList<>();
        orderStrIdList.add("10000");
        orderStrIdList.add("10001");
        orderStrIdList.add("10002");

        List<String> taoBaoOrderIdList=new ArrayList<>();

        //将数字订单号转换为带TB前缀的订单号
        orderStrIdList.stream().map((orderStrId)->{
            return "TB"+orderStrId;
        }).forEach((taoBaoOrderStrId)->{
            taoBaoOrderIdList.add(taoBaoOrderStrId);
        });

        for (String taoBaoOrderId : taoBaoOrderIdList) {
            System.out.println(taoBaoOrderId);
        }

    }


    /**
     * Stream的collect方法的使用
     * collect方法用于收集相关操作之后的结果
     */
    @Test
    public void testStreamCollector(){

        List<String> collectList = list.stream().filter(name->name.length()==3).filter(name->name.startsWith("孙"))
                .collect(Collectors.toList());
        for (String name : collectList) {
            System.out.println(name);
        }

    }





}
