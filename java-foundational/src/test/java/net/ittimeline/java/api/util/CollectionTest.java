package net.ittimeline.java.api.util;

import net.ittimeline.java.foundational.oop.Cellphone;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Collection接口常用方法的测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/6 10:54
 * @since JDK11
 */
public class CollectionTest {

    Collection<String> collection = new ArrayList<>();


    /**
     * 初始化collection,该方法会在所有的测试方法之前执行
     */
    @BeforeClass
    public void initCollection() {
        collection.add("北京");

        System.out.println("往集合中添加一个元素后  当前集合元素:" + collection);

        //子集合
        Collection<String> subCollection = new ArrayList<>();
        subCollection.add("上海");
        subCollection.add("广州");
        subCollection.add("深圳");
        collection.addAll(subCollection);
        System.out.println("将subCollection的全部元素添加到collection集合后  当前集合元素:" + collection);

    }


    /**
     * 集合添加元素
     *
     * @see java.util.Collection#add(Object)
     * @see java.util.Collection#addAll(Collection)
     */
    @Test
    public void testCollectionAddAll() {
        //创建一个集合对象，规定了集合存储的元素必须是字符串
        Collection<String> collection = new ArrayList<>();
        //往集合中添加一个元素，元素的类型是字符串，元素的值是北京
        collection.add("北京");

        System.out.println("往集合中添加一个元素后  当前集合元素:" + collection);

        //子集合
        Collection<String> subCollection = new ArrayList<>();
        subCollection.add("上海");
        subCollection.add("广州");
        subCollection.add("深圳");
        collection.addAll(subCollection);
        System.out.println("将subCollection的全部元素添加到collection集合后  当前集合元素:" + collection);

    }


    /**
     * 判断是否包含指定的元素(单个元素，集合)
     *
     * @see java.util.Collection#contains(Object)
     * @see java.util.Collection#containsAll(Collection)
     */
    @Test
    public void testCollectionContainsAll() {


        boolean isContains = collection.contains("北京");
        System.out.println("collection集合中是否包含北京" + isContains);

        Collection<String> sameCollection = new ArrayList<>();
        sameCollection.add("北京");
        sameCollection.add("上海");
        sameCollection.add("广州");
        sameCollection.add("深圳");
        boolean isSame = collection.containsAll(sameCollection);
        System.out.println("collection集合中是否包含sameCollection集合的全部元素" + isSame);

        // equals()方法哪里来的？

        System.out.println(collection.equals(sameCollection));


    }


    /**
     * 删除集合中指定的元素
     *
     * @see java.util.Collection#remove (Object)
     * @see java.util.Collection#removeAll(Collection)
     */
    @Test
    public void testCollectionRemoveAll() {

        collection.remove("深圳");
        System.out.println("删除深圳之后 当前collection集合的元素" + collection);

        Collection<String> subCollection=new ArrayList<>();
        subCollection.add("北京");
        subCollection.add("广州");

        collection.removeAll(subCollection);
        System.out.println("删除北京和广州之后 当前collection集合的元素" + collection);

    }


    /**
     * 删除集合中的所有元素 慎用
     *
     * @see Collection#clear()
     */
    @Test
    public void testCollectionClear(){

        collection.clear();
        System.out.println("清空集合的所有元素，当前collection集合的元素" + collection);
    }


    /**
     * 集合属性相关方法
     * @see Collection#size()
     * @see Collection#isEmpty()
     */
    @Test
    public void testCollectionSizeIsEmpty(){

        System.out.println("没有清空集合之前,当前collection集合的元素个数"+collection.size());
        System.out.println("没有清空集合之前,当前collection集合是否为空(是否没有元素)"+collection.isEmpty());
        collection.clear();
        System.out.println("清空集合之后,当前collection集合的元素个数"+collection.size());
        System.out.println("清空集合之后,当前collection集合是否为空(是否没有元素)"+collection.isEmpty());
    }


    /**
     * 集合和数组的相互转换
     */
    @Test
    public void testCollection2Array(){

        //Collection集合转数组
        System.out.println("Collection集合转数组");
        Object[] cities = collection.toArray();
        for (Object city : cities) {
            System.out.println(city);

        }

        //数组转List
        List<String> anotherCities = Arrays.asList("苏州", "重庆", "长沙");

        System.out.println("数组转List");
        for (String anotherCity : anotherCities) {
            System.out.println(anotherCity);
        }
    }


    @Test
    public void testCollectionUsage(){
        List<Cellphone> cellphoneList =new ArrayList<>();
        cellphoneList.add(new Cellphone("iphone12"));
        cellphoneList.add(new Cellphone("小米11ultra"));
        cellphoneList.add(new Cellphone("三星s21Ultra"));

        System.out.println(cellphoneList);

        //常用的方法都是组合使用，针对不同的业务场景

    }
}
