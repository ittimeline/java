package net.ittimeline.java.api.util.concurrent.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 同步锁的使用
 * @author tony 18601767221@163.com
 * @version 2021/5/20 16:22
 * @since JDK11
 */
public class LockTest {

    public static void main(String[] args) {

        TicketWindowSynchronizedLock ticketWindow=new TicketWindowSynchronizedLock();
        //创建并启动4个线程模拟4个窗口来卖票
        new Thread(ticketWindow, "窗口1: ").start();
        new Thread(ticketWindow, "窗口2: ").start();
        new Thread(ticketWindow, "窗口3: ").start();
        new Thread(ticketWindow, "窗口4: ").start();
    }

}
/**
 * 售票任务
 */
class TicketWindowSynchronizedLock implements Runnable {

    private static final Lock lock =new ReentrantLock();

    volatile
    /**
     * 四个窗口共享100张票
     * 此时的ticket是一个共享变量，由四个线程共享
     */
    int ticket = 100;


    /**
     * 售票 未考虑线程安全问题
     */
    @Override
    public void run() {
        //对多线程环境下共享资源加锁
        lock.lock();
        try {
            while (ticket > 0) {
                //模拟其他业务逻辑的耗时操作
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket + "张票");

                //模拟其他业务逻辑的耗时操作
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ticket--;
            }
        } finally {
            lock.unlock();
        }
    }
}