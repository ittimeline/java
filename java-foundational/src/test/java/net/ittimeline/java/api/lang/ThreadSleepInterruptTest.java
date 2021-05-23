package net.ittimeline.java.api.lang;

/**
 * 线程的睡眠和中断的测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/20 7:39
 * @since JDK11
 */
public class ThreadSleepInterruptTest {


    public static void main(String[] args) {

        Thread thread1 =new Thread("睡觉线程"){
            @Override
            public void run() {
                try {
                    System.out.println(getName()+"我将要睡觉了,不要打扰我");
                    Thread.sleep(50000);
                } catch (InterruptedException e) {
                    System.err.println("我在睡觉，不要打扰我");
                }
            }
        };
        thread1.start();

       /* Thread thread2=new Thread("叫醒线程"){
            @Override
            public void run() {
                //叫醒thread1
                //中断睡觉
                thread1.interrupt();
            }
        };
        thread2.start();*/
        //中断睡觉
        thread1.interrupt();
    }
}
