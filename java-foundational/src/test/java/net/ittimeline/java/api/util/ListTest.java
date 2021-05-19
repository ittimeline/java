package net.ittimeline.java.api.util;

import net.ittimeline.java.foundational.oop.Cellphone;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.*;

/**
 * List接口常用方法的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/6 17:02
 * @since JDK11
 */
public class ListTest {

    List<String> cities;

    List<Cellphone> cellphoneList;



    @BeforeClass
    public void initList(){
        //此处可以替换成List接口的任意实现类。不会影响程序的结果
        cities=new ArrayList<>();
        cities.add("北京");
        cities.add("上海");
        cities.add("广州");
        cities.add("深圳");

        cities.add("北京");
        cities.add("上海");
        cities.add("广州");
        cities.add("深圳");

        System.out.println("cities集合的元素内容:"+cities);

        //往集合中添加三个匿名的Cellphone对象
        cellphoneList=new ArrayList<>();
        cellphoneList.add(new Cellphone("iphone12 pro max",13999));
        cellphoneList.add(new Cellphone("P50 pro plus",8999));
        cellphoneList.add(new Cellphone("S21 Ultra",10999));

        System.out.println("排序之前cellphoneList集合的元素内容");
        for (Cellphone cellphone : cellphoneList) {
            System.out.println(cellphone);
        }


    }


    @Test
    public void testListFeature(){
        List<String> cities=new ArrayList<>();
        cities.add("北京");
        cities.add("上海");
        cities.add("上海");
        cities.add("广州");
        cities.add("深圳");

        System.out.println("cities集合的元素内容:"+cities);

    }


    /**
     * 基于索引的添加元素
     */
    @Test
    public void testListAddAll(){

        List<String> cities=new ArrayList<>();
        cities.add(0,"北京");
        cities.add(1,"上海");
        cities.add(2,"广州");
        cities.add(3,"深圳");
        System.out.println("往集合中指定的索引添加元素 集合的元素内容是"+cities);


        List<String> otherCities=new ArrayList<>();
        otherCities.add("重庆");
        otherCities.add("成都");
        otherCities.add("武汉");
        otherCities.add("杭州");

        //在深圳的后面加其他的城市
        int index=cities.size();
        cities.addAll(index,otherCities);
        System.out.println("往集合中指定索引 添加指定的集合集合的元素内容是"+cities);

    }


    /**
     * 通过索引获取元素
     */
    @Test
    public void testListGet(){

        String city = cities.get(0);
        System.out.println("集合中第0个索引的元素是"+city);

        //在通过索引获取元素时，索引必须合法，否则会引发异常IndexOutOfBoundsException
        city = cities.get(5);
        System.out.println("集合中第5个索引的元素是"+city);

    }

    /**
     * 集合元素的查找
     * @see List#indexOf(Object) 
     * @see List#lastIndexOf(Object) 
     */
    @Test
    public void testListIndexOfLastIndexOf(){
        int beijingIndex = cities.indexOf("北京");
        System.out.println("北京在cities集合中第一次出现的索引"+beijingIndex);

        String beijing = cities.get(beijingIndex);

        int shanghaiIndex=cities.lastIndexOf("上海");
        System.out.println("上海在cities集合中最后一次出现的索引"+shanghaiIndex);

        String shanghai = cities.get(shanghaiIndex);


    }


    /**
     * 删除指定索引的元素
     * @see List#remove(int)
     */
    @Test
    public void testListRemove(){

        cities.remove(0);
        cities.remove(1);
        cities.remove(2);
        cities.remove(3);
        System.out.println("删除4个元素之后当前cities集合的元素内容是"+cities);
    }


    /**
     * 修改指定索引的元素
     * @see List#set(int, Object) 
     */
    @Test
    public void testListSet(){

        cities.set(4,"天津");
        cities.set(5,"重庆");
        cities.set(6,"杭州");
        cities.set(7,"武汉");
        System.out.println("修改4个元素之后当前cities集合的元素内容是"+cities);

    }


    /**
     *  截取指定范围的元素
     */
    @Test
    public void testListSubList(){

        /**
         * 0是开始索引
         * 4是结束索引
         * 但是不包含结束索引的元素
         */
        List<String> subCities = cities.subList(0, 4);
        System.out.println("截取cities结合的元素，索引从0到4,截取后subCities集合的元素内容是"+subCities);

    }

    /********************************************List集合的遍历和排序***************************************************************/

    /**
     * List集合遍历的三种方式
     */
    @Test
    public void testListIterator(){




        System.out.println("******************************方式1:使用Iterator遍历List集合******************************");

        Iterator<Cellphone> iterator = cellphoneList.iterator();
        // 快捷键 itit
        while (iterator.hasNext()) {
            Cellphone cellphone =  iterator.next();
            System.out.println(cellphone);

        }

        System.out.println("******************************方式2:使用增强for循环遍历List集合******************************");
        for (Cellphone cellphone : cellphoneList) {
            System.out.println(cellphone);
        }
        System.out.println("******************************方式3:使用for循环遍历List集合******************************");
        for (int i = 0; i < cellphoneList.size(); i++) {
            //通过索引获取元素
            System.out.println(cellphoneList.get(i));

        }


    }


    /**
     * 按照手机的价格从低到高排序(升序)
     */
    @Test
    public void testListSortAsc(){

        //匿名内部类
        cellphoneList.sort(new Comparator<Cellphone>() {
            @Override
            public int compare(Cellphone cellphone1, Cellphone cellphone2) {
                return cellphone1.getPrice()-cellphone2.getPrice();
            }
        });

        System.out.println("按照手机的价格从低到高排序(升序)");
        for (Cellphone cellphone : cellphoneList) {
            System.out.println(cellphone);
        }


    }

    /**
     * 按照手机的价格从高到低排序(降序)
     */
    @Test
    public void testListSortDesc(){

        cellphoneList.sort(new Comparator<Cellphone>() {
            @Override
            public int compare(Cellphone cellphone1, Cellphone cellphone2) {
                return cellphone2.getPrice()-cellphone1.getPrice();
            }
        });

        System.out.println("照手机的价格从高到低排序(降序)");
        for (Cellphone cellphone : cellphoneList) {
            System.out.println(cellphone);
        }

    }














}
