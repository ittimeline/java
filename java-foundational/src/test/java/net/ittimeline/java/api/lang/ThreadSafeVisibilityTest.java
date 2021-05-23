package net.ittimeline.java.api.lang;

/**
 * 线程安全问题之可见性问题
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/21 8:37
 * @since JDK11
 */
public class ThreadSafeVisibilityTest {

    public static void main(String[] args) {
        ThreadSafeVisibility threadSafeVisibility=new ThreadSafeVisibility();
        threadSafeVisibility.setName("子线程");
        threadSafeVisibility.start();


        while (true){
            //死循环中睡眠100毫秒，有机会从主内存中获取flag的值，因此有机会结束主线程的死循环
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(ThreadSafeVisibility.flag==true){
                System.out.println("主线程的死循环结束");
                break;
            }
        }

        /**
         * 期望结果：主线程的死循环能结束
         *
         * 实际结果是不会结束主线程的死循环
         */



    }
}


class ThreadSafeVisibility extends Thread{

    /**
     * 共享变量
     */
    static boolean flag=false;


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
