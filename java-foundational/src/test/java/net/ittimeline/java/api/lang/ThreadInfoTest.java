package net.ittimeline.java.api.lang;

import net.ittimeline.java.api.util.DateTimeUtils;

/**
 * 线程信息测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/20 7:25
 * @since JDK11
 */
public class ThreadInfoTest {

    public static void main(String[] args) {

        System.out.println("当前正在执行的线程  名称是"+Thread.currentThread().getName());

        PrintThread printThread=new PrintThread();
        printThread.setName("打印线程");
        printThread.start();
    }
}


class  PrintThread extends  Thread{
    /**
     * 定义线程任务
     * 每间隔1秒打印当前时间，打印100次
     */
    @Override
    public void run() {

        for (int j = 0; j <5 ; j++) {
            try {
                //睡眠1秒钟
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程名称"+getName()+"当前时间: "+ DateTimeUtils.getCurrentTime());
        }
    }
}