package net.ittimeline.java.api.util.concurrent.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap线程不安全问题
 * @author tony 18601767221@163.com
 * @version 2021/5/21 16:39
 * @since JDK11
 */
public class HashMapThreadNotSafeTest {

    public static void main(String[] args) {
        HashMapHolder hashMapHolder=new HashMapHolder();
        hashMapHolder.setName("子线程: ");
        hashMapHolder.start();


        //在主线程中往map集合添加10W个元素
        for (int i = 0; i < 10_0000; i++) {
            HashMapHolder.map.put(i,i);
        }
        System.out.println(Thread.currentThread().getName()+" map集合的元素个数"+HashMapHolder.map.size());
        /**
         * 期望的个数是10万，因为HashMap的键是唯一的
         * 实际结果：大于10万
         */
    }
}

class HashMapHolder extends Thread{

    static Map<Integer,Integer> map =new HashMap<>();

    @Override
    public void run() {

        for (int i = 0; i < 10_0000; i++) {
            map.put(i,i);
        }

        System.out.println(Thread.currentThread().getName()+" map集合的元素个数"+map.size());

    }
}