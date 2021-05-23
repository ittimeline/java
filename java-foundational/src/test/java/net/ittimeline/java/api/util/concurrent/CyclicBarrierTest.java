package net.ittimeline.java.api.util.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * CyclicBarrier的使用
 * @author tony 18601767221@163.com
 * @version 2021/5/21 17:55
 * @since JDK11
 */
public class CyclicBarrierTest {

    public static void main(String[] args) {
        String[]employees={"项目经理","前端开发","后端开发","运维","产品经理"};

        CyclicBarrier cyclicBarrier=new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("员工正在开需求评审会");
            }
        });

        Meeting meeting=new Meeting(cyclicBarrier);

        for (int i = 0; i < 5; i++) {
            new Thread(meeting,employees[i]).start();
        }
    }
}


class Meeting implements Runnable{
    final CyclicBarrier cyclicBarrier;

    Meeting (final CyclicBarrier cyclicBarrier){
        this.cyclicBarrier=cyclicBarrier;
    }



    @Override
    public void run() {

        String name =Thread.currentThread().getName();
        System.out.println(name+" 到达了会议室");

        //员工到达会议室之后要等其他人
        try {
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

        System.out.println(name+"离开会议室");

    }
}