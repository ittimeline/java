package net.ittimeline.java.api.util.concurrent;

import net.ittimeline.java.api.util.DateTimeUtils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/21 19:27
 * @since JDK11
 */
public class ExecutorsTest {


    public static void main(String[] args) {

        //创建一个线程池
        ExecutorService executorService = Executors.newFixedThreadPool(2);


        for (int i = 0; i < 5; i++) {
            //提交任务并执行任务
            executorService.submit(new PrintTask());
        }
        //main线程会等到所有的业务线程执行完毕后才会销毁
        //销毁线程池
       // executorService.shutdown();

    }
}



class PrintTask implements Runnable{

    @Override
    public void run() {
        String name =Thread.currentThread().getName()+":    ";
        System.out.println(name+DateTimeUtils.getCurrentTime());

        //当前线程等待3秒
        try {
            System.out.println(name+"准备等3秒");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name+ DateTimeUtils.getCurrentTime());


    }
}


