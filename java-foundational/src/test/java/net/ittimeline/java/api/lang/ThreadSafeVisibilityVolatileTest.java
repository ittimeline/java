package net.ittimeline.java.api.lang;

/**
 * 使用volatile解决线程安全问题之可见性问题
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/21 8:37
 * @since JDK11
 */
public class ThreadSafeVisibilityVolatileTest {

    public static void main(String[] args) {
        ThreadSafeVisibilityVolatile threadSafeVisibilityVolatile=new ThreadSafeVisibilityVolatile();
        threadSafeVisibilityVolatile.setName("子线程");
        threadSafeVisibilityVolatile.start();


        while (true){
            if(ThreadSafeVisibilityVolatile.flag==true){
                System.out.println("主线程的死循环结束");
                break;
            }
        }

        /**
         * 期望结果：主线程的死循环能结束
         *
         * 实际结果：主线程的死循环能结束
         */



    }
}


class ThreadSafeVisibilityVolatile extends Thread{

    /**
     * 共享变量
     * 加了volatile之后强制操作共享变量的线程每次都从主内存里面获取最新的值，这样可见性问题就解决了
     */
   volatile static boolean flag=false;


    @Override
    public void run() {

        String name = Thread.currentThread().getName();

        try {
            System.out.println(name+"即将睡5秒钟");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        flag=true;
        System.out.println(name+"将flag的值改成了true");



    }
}
