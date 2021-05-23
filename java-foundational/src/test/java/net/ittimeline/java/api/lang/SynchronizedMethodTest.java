package net.ittimeline.java.api.lang;

/**
 * 使用synchronized  同步方法解决多线程卖票线程安全问题
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/20 14:27
 * @since JDK11
 */
public class SynchronizedMethodTest {

    public static void main(String[] args) {
        //创建售票任务对象
        TicketWindowSynchronizedMethod ticketWindow = new TicketWindowSynchronizedMethod();
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
class TicketWindowSynchronizedMethod implements Runnable {

    /**
     * 四个窗口共享100张票
     * 此时的ticket是一个共享变量，由四个线程共享
     */
   static int ticket = 100;


    /**
     * 售票
     *
     */
    @Override
    public void run() {
        doSellTicket();
    }

    /**
     * 使用synchronized  同步方法解决多线程卖票线程安全问题
     */
    private static synchronized void doSellTicket() {
        while (ticket > 0) {
            //模拟其他业务逻辑的耗时操作
            //此时出现了漏票
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket + "张票");

            //模拟其他业务逻辑的耗时操作
            //此时就出现了负数票
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            ticket--;
        }
    }
}