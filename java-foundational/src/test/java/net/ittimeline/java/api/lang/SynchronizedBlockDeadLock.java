package net.ittimeline.java.api.lang;

/**
 * 同步代码块的死锁
 * @author tony 18601767221@163.com
 * @version 2021/5/20 16:31
 * @since JDK11
 */
public class SynchronizedBlockDeadLock {
    /**
     * 两把锁
     */
    private static final  Object lockA=new Object();
    private static final  Object lockB=new Object();

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                String name =Thread.currentThread().getName();
                synchronized (lockA){
                    System.out.println(name+"已经获取到了A锁");
                    synchronized (lockB){
                        System.out.println(name+"已经获取到了A锁和B锁");
                        System.out.println(name+"正执行线程任务");

                    }
                }

            }
        },"线程A: ").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                String name =Thread.currentThread().getName();
                synchronized (lockB){
                    System.out.println(name+"已经获取到了B锁");
                    synchronized (lockA){
                        System.out.println(name+"已经获取到了A锁和B锁");
                        System.out.println(name+"正执行线程任务");

                    }
                }

            }
        },"线程B: ").start();
    }
}
