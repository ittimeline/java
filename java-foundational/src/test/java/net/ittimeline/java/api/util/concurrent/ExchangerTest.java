package net.ittimeline.java.api.util.concurrent;

import java.util.concurrent.Exchanger;

/**
 * Exchanger的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/21 18:27
 * @since JDK11
 */
public class ExchangerTest {

    public static void main(String[] args) {

      final  Exchanger<String> exchanger =new Exchanger<>();

      new ThreadC(exchanger).start();
      new ThreadD(exchanger).start();


    }
}


class ThreadC extends Thread{
    final Exchanger<String> exchanger;

    ThreadC(Exchanger<String> exchanger){
        this.exchanger=exchanger;
        setName("C线程: ");
    }

    @Override
    public void run() {

        String name = Thread.currentThread().getName();
        System.out.println(name+"准备把200块钱给D线程");
        try {
            String returnValue = exchanger.exchange("200块钱");
            System.out.println(name+"D线程给C线程的数据是"+returnValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class ThreadD extends Thread{
    final Exchanger<String> exchanger;

    ThreadD(Exchanger<String> exchanger){
        this.exchanger=exchanger;
        setName("D线程: ");
    }

    @Override
    public void run() {

        String name = Thread.currentThread().getName();
        System.out.println(name+"准备把5斤龙虾给C线程");
        try {
            String returnValue = exchanger.exchange("5斤龙虾");
            System.out.println(name+"C线程给D线程的数据是"+returnValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}