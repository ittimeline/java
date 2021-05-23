package net.ittimeline.java.api.util.concurrent.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList 线程不安全问题
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/21 15:56
 * @since JDK11
 */
public class ArrayListThreadNotSafe {

    public static void main(String[] args) {
        ArrayListHolder arrayListHolder=new ArrayListHolder();
        arrayListHolder.start();

        //在主线程中往list中添加20万个元素
        for (int i = 0; i < 20_0000; i++) {
            ArrayListHolder.list.add(i);
        }


        //在主线程中睡眠200毫秒，确保40W个元素已经被添加了
        /*try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        System.out.println(Thread.currentThread().getName()+"list集合的元素数量是"+ArrayListHolder.list.size());

        /**
         * 期望的的是40万
         * 实际是小于40万
         * 也有可能会引发异常
         */

    }

}

class ArrayListHolder extends Thread{

    /**
     * 共享变量
     * 多个线程会往list中添加40万个元素
     */
    static List<Integer> list =new ArrayList<>();


    @Override
    public void run() {
        for (int i = 0; i < 20_0000; i++) {
            list.add(i);
        }

        System.out.println(Thread.currentThread().getName()+"list集合的元素数量是"+list.size());
    }
}