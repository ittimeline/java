package net.ittimeline.java.core.foundational.control.loop.nestedloop;

/**
 * 统计100万以内的质数个数
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 22:06
 * @see net.ittimeline.java.core.foundational.control.loop.breakstatement.JudgeIsPrimeNumberV2
 * @since Java21
 */
public class StatisticsMillionPrimeNumber {
    public static void main(String[] args) {
        //开始时间
        long startTime = System.currentTimeMillis();
        //统计100万以内质数的数量，最小的质数是2
        int primeNumberCount = 0;
        //遍历从2到100万
        for (int number = 2; number <= 100_0000; number++) {
            //假设number是质数
            boolean isPrimeNumber = true;
            //遍历2到number的平方根
            for (int i = 2; i <= Math.sqrt(number); i++) {
                //如果number能被2到number的平方根这个范围内的数整除
                if (number % i == 0) {
                    //number不是质数
                    isPrimeNumber = false;
                    //2到number的平方根这个范围的其他数不需要在进行判断，结束循环
                    break;
                }
            }
            if (isPrimeNumber) {
                primeNumberCount++;
            }
        }
        //结束时间
        long endTime = System.currentTimeMillis();
        //程序耗时
        long time = endTime - startTime;
        System.out.printf("100万以内的质数个数是%d个，程序耗时%d毫秒", primeNumberCount, time);
    }
}
