package net.ittimeline.java.api.lang;

/**
 * 生产者/消费者模式实现
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/22 8:05
 * @since JDK11
 */
public class ThreadProducerConsumerTest {

    public static void main(String[] args) {

        final StatusHolder statusHolder=new StatusHolder();
        final Object lock =new Object();


        new Consumer(statusHolder,lock).start();
        new Producer(statusHolder,lock).start();
    }
}


/**
 * 生产者
 */
class Producer extends Thread {

    //状态持有者
    final StatusHolder statusHolder;
    //锁对象
    final Object lock;

    Producer(final StatusHolder statusHolder, final Object lock) {
        this.statusHolder = statusHolder;
        this.lock = lock;
        setName("生产者线程: ");
    }


    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                String name = getName();
                //有商品
                if (statusHolder.status == true) {
                    System.out.println(name + "现在有商品，生产者不需要生产商品,生产者将进入无限等待");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //没有商品
                if (statusHolder.status == false) {
                    System.out.println(name + "现在没有商品，生产者需要生产商品");
                    //耗时操作，模拟生产商品
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    statusHolder.status = true;
                    System.out.println(name+"生产者生产商品完毕");
                    lock.notify();
                    System.out.println(name+"生产者通知消费者，可以来消费商品了");


                }
            }
        }

    }
}

/**
 * 消费者
 */
class Consumer extends Thread {
    //状态持有者
    final StatusHolder statusHolder;
    //锁对象
    final Object lock;

    Consumer(final StatusHolder statusHolder, final Object lock) {
        this.statusHolder = statusHolder;
        this.lock = lock;
        setName("消费者线程: ");
    }


    @Override
    public void run() {

        while (true) {
            synchronized (lock){
                String name =getName();
                //没有商品
                if(statusHolder.status==false){
                    System.out.println(name+"当前没有商品可以消费，消费者进入无限等待");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if(statusHolder.status==true){
                    System.out.println(name+"当前有商品可以消费,消费者开始消费商品");
                    //耗时操作，模拟消费商品
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //商品消费完成以后修改状态
                    statusHolder.status=false;
                    System.out.println(name+"消费者已经消费完了商品");

                    //商品消费完成以后通知生产者
                    lock.notify();
                    System.out.println(name+"消费者通知生产者");
                }
            }
        }
    }
}

/**
 * 状态维护者
 * status等于true表示有商品
 * status等于false表示有商品
 */
class StatusHolder {
    boolean status;
}



