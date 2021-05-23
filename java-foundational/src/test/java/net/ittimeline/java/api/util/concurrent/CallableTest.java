package net.ittimeline.java.api.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Callable接口的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/21 19:53
 * @since JDK11
 */
public class CallableTest {


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> returnValue = executorService.submit(new Calculator());
        try {
            Integer result = returnValue.get();
            System.out.println("1-100的整数和的结果" + result);
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}


class Calculator implements Callable<Integer> {


    /**
     * 任务:计算1-100之间的和
     *
     * @return
     * @throws Exception
     */
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}