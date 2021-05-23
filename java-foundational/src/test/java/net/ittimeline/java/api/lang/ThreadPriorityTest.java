package net.ittimeline.java.api.lang;

import net.ittimeline.java.api.util.DateTimeUtils;

/**
 * 线程优先级测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/20 7:52
 * @since JDK11
 */
public class ThreadPriorityTest {

    public static void main(String[] args) {

        Thread thread1 =new Thread("最高优先级"){
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("线程名称:"+getName()+"线程优先级"+getPriority());
                }

            }
        };
        //设置当前线程为最高优先级
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread1.start();


        Thread thread3 =new Thread("最小优先级"){
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("线程名称:"+getName()+"线程优先级"+getPriority());
                }

            }
        };
        //设置当前线程为最小优先级
        thread3.setPriority(Thread.MIN_PRIORITY);
        thread3.start();


        Thread thread2 =new Thread("普通优先级"){
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("线程名称:"+getName()+"线程优先级"+getPriority());
                }

            }
        };
        //设置当前线程为普通优先级
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread2.start();
    }


}
