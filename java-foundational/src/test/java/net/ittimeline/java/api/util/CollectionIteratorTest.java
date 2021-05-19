package net.ittimeline.java.api.util;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection集合的遍历
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/6 14:10
 * @since JDK11
 */
public class CollectionIteratorTest {


    Collection<String> collection;

    @BeforeClass
    public void initCollection() {
        collection = new ArrayList<>();
        collection.add("北京");
        collection.add("上海");
        collection.add("广州");
        collection.add("深圳");
        System.out.println("当前collection集合的元素:" + collection);

    }


    /**
     * 使用Iterator遍历Collection集合
     */
    @Test
    public void testCollectionIterator() {

        System.out.println("使用Iterator遍历Collection集合");
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String city = iterator.next();
            System.out.println(city);
        }
    }

    /**
     * 使用Iterator遍历Collection集合是产生NoSuchElementException
     */
    @Test
    public void testCollectionIteratorNoSuchElementException() {

        System.out.println("使用Iterator遍历Collection集合");
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String city = iterator.next();
            System.out.println(city);
        }
        //此处会引发NoSuchElementException异常
        // String city = iterator.next();
        //System.out.println(city);

        //再创建一个Iterator对象，重新开始迭代，这样就解决了NoSuchElementException
        iterator = collection.iterator();
        while (iterator.hasNext()) {
            String city = iterator.next();
            System.out.println(city);
        }


    }


    /**
     * 使用Iterator遍历Collection集合是产生ConcurrentModificationException
     */
    @Test
    public void testCollectionIteratorConcurrentModificationException() {

        System.out.println("使用Iterator遍历Collection集合");
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String city = iterator.next();
            //在迭代时删除集合的元素会产生产生ConcurrentModificationException
            //collection.remove("深圳");
            if (city.equals("深圳")) {
                iterator.remove();
            } else {
                System.out.println(city);
            }
        }
        System.out.println("当前集合元素的内容" + collection);

    }

    /**
     * 使用增强for循环遍历集合和数组
     */
    @Test
    public void testForeachCollectionArray() {

        System.out.println("使用增强for循环遍历集合");
        for (String city : collection) {
            System.out.println(city);
        }

        System.out.println("使用增强for循环遍历数组");

        Object[] objects = collection.toArray();
        for (Object city : objects) {
            System.out.println(city);
        }


    }

}
