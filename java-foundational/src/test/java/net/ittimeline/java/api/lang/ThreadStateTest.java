package net.ittimeline.java.api.lang;

/**
 * 线程的状态信息
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/20 7:45
 * @since JDK11
 */
public class ThreadStateTest {

    public static void main(String[] args) {
        //创建Thread类的子类对象
        PrintThread printThread=new PrintThread();

        printThread.setName("打印线程:");

        System.out.println(printThread.getName()+"线程状态:"+printThread.getState());

        printThread.start();
        System.out.println(printThread.getName()+"线程状态:"+printThread.getState());

        //等待打印线程任务执行完成
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(printThread.getName()+"线程状态:"+printThread.getState());

    }
}
