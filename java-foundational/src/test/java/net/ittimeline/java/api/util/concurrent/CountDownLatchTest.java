package net.ittimeline.java.api.util.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatch的使用
 * @author tony 18601767221@163.com
 * @version 2021/5/21 17:40
 * @since JDK11
 */
public class CountDownLatchTest {

    public static void main(String[] args) {

        final CountDownLatch countDownLatch=new CountDownLatch(1);

        new ThreadA(countDownLatch).start();
        new ThreadB(countDownLatch).start();
    }
}


class ThreadA extends  Thread{
    final CountDownLatch countDownLatch;

    ThreadA(final CountDownLatch countDownLatch){
        this.countDownLatch=countDownLatch;
    }


    @Override
    public void run() {
        System.out.println("1");
        //当调用countDown()减1之后，计数器的值是0，此时会结束等待
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("3");
    }
}

class ThreadB extends Thread{
    ThreadB(final CountDownLatch countDownLatch){
        this.countDownLatch=countDownLatch;
    }

   final CountDownLatch countDownLatch;

    @Override
    public void run() {
        System.out.println("2");
        countDownLatch.countDown();
    }
}