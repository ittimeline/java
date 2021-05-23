package net.ittimeline.java.api.util.concurrent;

import net.ittimeline.java.api.util.DateTimeUtils;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * 使用CopyOnWriteArraySet解决HashSet的线程安全问题
 * @author tony 18601767221@163.com
 * @version 2021/5/21 16:25
 * @since JDK11
 */
public class CopyOnWriteArraySetTest {

    public static void main(String[] args) {
        CopyOnWriteArraySetHolder copyOnWriteArraySetHolder=new CopyOnWriteArraySetHolder();
        copyOnWriteArraySetHolder.start();

        for (int i = 0; i < 10_0000; i++) {
            CopyOnWriteArraySetHolder.copyOnWriteArraySet.add(i);
        }

        //因为copyOnWriteArraySet添加10万个整数(int)需要8秒 ，因此这里等一等
        /*try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println(Thread.currentThread().getName()+" copyOnWriteArraySet集合元素的数量"+CopyOnWriteArraySetHolder.copyOnWriteArraySet.size());


    }
}
class CopyOnWriteArraySetHolder extends Thread{

    static Set<Integer> copyOnWriteArraySet=new CopyOnWriteArraySet<>();

    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 10_0000; i++) {
            copyOnWriteArraySet.add(i);
        }
        long endTime = System.currentTimeMillis();
        long time =DateTimeUtils.calculatorTime(beginTime,endTime);
        System.out.println("copyOnWriteArraySet 添加10万个元素的耗时"+time);
        System.out.println(Thread.currentThread().getName()+" copyOnWriteArraySet集合元素的数量"+copyOnWriteArraySet.size());
    }
}