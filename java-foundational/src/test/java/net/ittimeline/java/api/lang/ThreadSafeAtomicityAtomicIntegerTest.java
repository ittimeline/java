package net.ittimeline.java.api.lang;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 使用原子类解决线程安全问题之原子性问题
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/21 14:35
 * @since JDK11
 */
public class ThreadSafeAtomicityAtomicIntegerTest {

    public static void main(String[] args) {
        ThreadSafeAtomicityAtomicInteger threadSafeAtomicity=new ThreadSafeAtomicityAtomicInteger();
        threadSafeAtomicity.setName("子线程");
        //启动子线程
        threadSafeAtomicity.start();

        //在主线程中对共享变量自增20万次
        for (int i = 0; i < 20_0000; i++) {
            ThreadSafeAtomicityAtomicInteger.number.getAndIncrement();;
        }

        //增加耗时操作确保主线程和子线程对共享变量自增20万次完成
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"对共享变量自增20万次 number  = "+ThreadSafeAtomicityAtomicInteger.number.get());

        /**
         * 期望结果  number =400000
         * 实际结果  number=400000
         */
    }
}


class ThreadSafeAtomicityAtomicInteger extends Thread{

    /**
     *  共享变量：多个线程共同使用一个变量
     */
    static AtomicInteger number =new AtomicInteger();

    @Override
    public void run() {

        //对共享变量自增20万次
        for (int i = 0; i < 20_0000; i++) {
            //number++;
            number.getAndIncrement();
        }

        System.out.println(Thread.currentThread().getName()+"对共享变量自增20万次 number  = "+number.get());

    }
}

