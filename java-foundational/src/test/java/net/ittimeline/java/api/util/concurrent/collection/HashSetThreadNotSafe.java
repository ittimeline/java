package net.ittimeline.java.api.util.concurrent.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * HashSet线程不安全的问题
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/21 16:18
 * @since JDK11
 */
public class HashSetThreadNotSafe {

    public static void main(String[] args) {

        HashSetHolder hashSetHolder=new HashSetHolder();
        hashSetHolder.setName("子线程");
        hashSetHolder.start();

        for (int i = 0; i < 10_0000; i++) {
            HashSetHolder.hashSet.add(i);
        }
        System.out.println(Thread.currentThread().getName()+" hashSet集合元素的数量"+HashSetHolder.hashSet.size());

        /**
         * HashSet会去掉重复的元素
         * 期望的结果 10万
         * 实际的结果 大于十万 小于十万
         */

    }

}

class HashSetHolder extends Thread{

    static HashSet<Integer> hashSet=new HashSet<>();

    @Override
    public void run() {

        for (int i = 0; i < 10_0000; i++) {
            hashSet.add(i);
        }
        System.out.println(Thread.currentThread().getName()+" hashSet集合元素的数量"+hashSet.size());
    }
}