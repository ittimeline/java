package net.ittimeline.java.web.foundational;

import org.testng.annotations.Test;

/**
 * ThreadLocal的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/21 14:19
 * @since JDK11
 */
public class ThreadLocalUsageTest {

    /**
     * ThreadLocal名叫线程本地变量(容器)
     * 它的作用保证在同一个线程中使用的对象相同，也就是说在同一个线程中只能存放一个数据，这样在同一个线程获取的时候是同一个值
     */
    @Test
    public void testThreadLocalUsage(){
        ThreadLocal<String>  threadLocal=new ThreadLocal<>();
        threadLocal.set("C++");
        System.out.println(Thread.currentThread().getName()+" ---> "+threadLocal.get());

        //在main线程中创建一个线程
        new Thread(()->{
            //在Thread-0中将ThreadLocal对象的值改成Java
            threadLocal.set("Java");
            System.out.println(Thread.currentThread().getName()+" ---> "+threadLocal.get());

        }).start();

        System.out.println(Thread.currentThread().getName()+" ---> "+threadLocal.get());
    }



}
