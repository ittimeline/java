package net.ittimeline.java.api.util.concurrent;


import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * CopyOnWriteArrayList的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/21 16:03
 * @since JDK11
 */
public class CopyOnWriteArrayListTest {

    public static void main(String[] args) {
        CopyOnWriteArrayListHolder copyOnWriteArrayListHolder = new CopyOnWriteArrayListHolder();
        copyOnWriteArrayListHolder.start();

        for (int i = 0; i < 10_0000; i++) {
            CopyOnWriteArrayListHolder.list.add(i);
        }

        //睡10秒 确保 20万个元素添加到list集合中
    /*    try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        //然后再打印集合的元素数量
        System.out.println(Thread.currentThread().getName() + "list集合的元素数量是" + CopyOnWriteArrayListHolder.list.size());

    }
}

class CopyOnWriteArrayListHolder extends Thread {

    /**
     * 共享变量
     * 多个线程会往list中添加20万个元素
     * 使用CopyOnWriteArrayList解决ArrayList线程不安全的问题
     */
    static List<Integer> list = new CopyOnWriteArrayList<>();


    @Override
    public void run() {
        for (int i = 0; i < 10_0000; i++) {
            list.add(i);
        }

        System.out.println(Thread.currentThread().getName() + "list集合的元素数量是" + list.size());
    }
}