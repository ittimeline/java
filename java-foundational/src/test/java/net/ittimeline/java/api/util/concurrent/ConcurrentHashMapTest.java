package net.ittimeline.java.api.util.concurrent;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ConcurrentHashMap解决HashMap的线程不安全问题
 * @author tony 18601767221@163.com
 * @version 2021/5/21 16:44
 * @since JDK11
 */
public class ConcurrentHashMapTest {

    public static void main(String[] args) {
        ConcurrentHashMapHolder concurrentHashMapHolder=new ConcurrentHashMapHolder();
        concurrentHashMapHolder.setName("子线程: ");
        concurrentHashMapHolder.start();


        for (int i = 0; i < 10_0000; i++) {
            ConcurrentHashMapHolder.map.put(i,i);
        }
        System.out.println(Thread.currentThread().getName()+" map集合的元素个数"+ConcurrentHashMapHolder.map.size());

    }

    /**
     * 期望结果10万
     * 实际结果10万
     */
}


class ConcurrentHashMapHolder extends Thread{

    static Map<Integer,Integer> map =new ConcurrentHashMap<>();

    @Override
    public void run() {

        for (int i = 0; i < 10_0000; i++) {
            map.put(i,i);
        }

        System.out.println(Thread.currentThread().getName()+" map集合的元素个数"+map.size());

    }
}