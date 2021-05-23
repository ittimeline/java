package net.ittimeline.java.api.lang;

/**
 * 线程协作
 * 1. 下载图片
 * 2. 显示图片
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/20 8:04
 * @since JDK11
 */
public class ThreadJoinTest {

    public static boolean isFinish=false;


    public static void main(String[] args) {

        Thread download= new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"开始下载图片");

                //模拟下载进度条
                for (int i = 0; i <=100; i++) {
                    System.out.println("已经下载完成"+i+"%");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                System.out.println(Thread.currentThread().getName()+"图片下载完毕");

                isFinish=true;
            }
        },"下载线程:");

        //启动下载图片的线程
        download.start();

        //显示图片线程
        Thread showImage=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"准备显示图片");
                try {
                    //等待下载图片线程下载完成以后再显示图片
                    download.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(!isFinish){
                    throw new RuntimeException("图片下载失败");
                }
                System.out.println(Thread.currentThread().getName()+"图片显示完成");
            }
        },"显示图片线程:");

        showImage.start();


    }
}
