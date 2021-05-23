package net.ittimeline.java.api.lang;

/**
 * 线程安全问题之原子性问题
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/21 14:18
 * @since JDK11
 */
public class ThreadSafeAtomicityTest {

    public static void main(String[] args) {
        ThreadSafeAtomicity threadSafeAtomicity=new ThreadSafeAtomicity();
        threadSafeAtomicity.setName("子线程");
        //启动子线程
        threadSafeAtomicity.start();

        //在主线程中对共享变量自增20万次
        for (int i = 0; i < 20_0000; i++) {
            ThreadSafeAtomicity.number++;
        }
        System.out.println(Thread.currentThread().getName()+"对共享变量自增20万次 number  = "+ThreadSafeAtomicity.number);

        /**
         * 期望结果  number =400000
         *
         * 实际结果  number小于400000
         */
    }
}
class ThreadSafeAtomicity extends Thread{

    /**
     *  共享变量：多个线程共同使用一个变量
     *  volatile不能解决原子性问题
     */
  volatile  static int number =0;

    @Override
    public void run() {

        //对共享变量自增20万次
        for (int i = 0; i < 20_0000; i++) {
            number++;
        }

        System.out.println(Thread.currentThread().getName()+"对共享变量自增20万次 number  = "+number);

    }
}