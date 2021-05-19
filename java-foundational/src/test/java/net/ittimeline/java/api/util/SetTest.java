package net.ittimeline.java.api.util;

import net.ittimeline.java.foundational.oop.Cellphone;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

import java.util.*;

/**
 * Set集合常用实现类的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/11 17:42
 * @since JDK11
 */
public class SetTest {

    /**
     * HashSet的特性
     * 1. 无索引，也就意味着没有基于索引操作集合的方法
     * 2. 唯一，元素不允许重复
     * 3. 存取无序。存储和取出来的顺序不一致
     */
    @Test
    public void testHashSetFeature(){
        Set<String> hashSet =new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Go");
        hashSet.add("Rust");
        hashSet.add("Java");

        System.out.println("hashSet集合的元素内容是"+hashSet);

        /**
         * 程序运行结果
         * hashSet集合的元素内容是[Java, Rust, Go]
         */

    }


    @Test
    public void testHashSetElementHashCode(){

        Set<String> hashSet =new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Go");
        hashSet.add("Rust");
        hashSet.add("Java");



        for (String language : hashSet) {

            System.out.println("集合元素的值"+language+"集合元素的哈希值"+language.hashCode());
        }

    }

    @Test
    public void testHashSetAddCellphone(){

        Set<Cellphone> cellphoneHashSet =new HashSet<>();
        cellphoneHashSet.add(new Cellphone("iphone12 pro max",13999,200));
        cellphoneHashSet.add(new Cellphone("P50 pro plus",8999,209));
        cellphoneHashSet.add(new Cellphone("S21 Ultra",10999,211));
        cellphoneHashSet.add(new Cellphone("iphone12 pro max",13999,200));
        System.out.println("当前cellphoneHashSet集合的元素个数"+cellphoneHashSet.size());
    }


    /**
     * 1. 无索引，没有基于索引操作集合元素的方法
     * 2. 唯一，集合的元素不允许重复
     * 3. 存取有序，存储和取出来的顺序一致
     */
    @Test
    public void testLinkedHashSetFeature(){

        Set<String> linkedHashSet =new LinkedHashSet<>();
        linkedHashSet.add("Java");
        linkedHashSet.add("Go");
        linkedHashSet.add("Rust");
        linkedHashSet.add("Java");
        //Java Go Rust
        System.out.println("当前linkedHashSet集合元素的内容是"+linkedHashSet);


    }


    /**
     * 1. 无索引，没有基于索引操作集合元素的方法
     * 2. 唯一，集合的元素不允许重复
     * 3. 有序，添加元素时按照元素对应的默认排序规则排序,元素必须实现Comparable接口的compareTo(T o)方法。
     */
    @Test
    public void testTreeSetFeature(){
        Set<String> treeSet =new TreeSet<>();
        treeSet.add("Java");
        treeSet.add("Go");
        treeSet.add("Rust");
        treeSet.add("Java");
        // Go, Java, Rust
        //字符串默认排序是按照字典顺序升序排序 abcdefghijklmnopqrstuvwxyz
        System.out.println("当前treeSet集合元素的内容是"+treeSet);

    }

    /**
     * 需求: 集合的元素按照字符串的字典顺序降序排序
     */
    @Test
    public void testTreeSetElementStringDesc(){
        Set<String> treeSet =new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                //整数的降序 后面减前面
                //字符串的降序
                return str2.compareTo(str1);
            }
        });
        treeSet.add("Java");
        treeSet.add("Go");
        treeSet.add("Rust");
        treeSet.add("Java");
        // 期望结果  Rust , Java, Go
        System.out.println("treeSet集合的元素按照字符串的字典顺序降序排序"+treeSet);
    }















}
