package net.ittimeline.java.api.lang;

import java.io.Serializable;

/**
 * 线程创建和启动的两种方式
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/19 17:35
 * @since JDK11
 */
public class ThreadCreateStartTest {


    /**
     * main方法也是一个线程，即主线程
     * 主线程由JVM创建的
     * JVM启动的时候，还创建了一些其他的线程
     * @param args
     */
    public static void main(String[] args) {

       /* //创建Thread类的子类对象
        CustomThread customThread=new CustomThread();
        //调用Thread类的start()方法
        customThread.start();*/

        Thread thread=new Thread(new CustomRunnable());
        thread.start();


        for (int i = 0; i < 100; i++) {
            System.out.println("主线程 i = "+i);
        }


        // 匿名内部类的方式创建线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类创建线程");
            }
        }).start();

        //lambda表达式创建线程
        new Thread(()->{
            System.out.println("lambda表达式创建线程");
        }).start();

    }
}

/**
 * 第一种创建线程的方式
 * 继承Thread类 重写run方法
 */
class CustomThread extends Thread{

    /**
     *
     */
    @Override
    public void run() {
        for (int j = 0; j < 100; j++) {
            System.out.println("子线程 j = "+j);
        }
    }
}


/**
 * 第二种实现线程的方式
 * 实现Runnable接口，重写run方法
 */
class CustomRunnable implements Runnable, Serializable {

    @Override
    public void run() {
        for (int j = 0; j < 100; j++) {
            System.out.println("子线程 j = "+j);
        }
    }
}