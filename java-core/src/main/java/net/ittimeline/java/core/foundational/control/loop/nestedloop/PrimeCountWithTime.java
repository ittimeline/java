package net.ittimeline.java.core.foundational.control.loop.nestedloop;

/**
 * 嵌套循环案例9-统计质数
 * 需求：统计100万以内的质数数量，并计算程序耗时的时间
 * 分析：如果一个自然数（大于1）只能被1和本身整除，那么就是质数，否则就是合数
 * ● 3是质数 因为只有1 * 3 = 3，即3只能被1和3整除
 * ● 7是质数 因为只有1 * 7 = 7，即7只能被1和7整除
 * ● 4是合数 因为除了 1 * 4 = 4以外，还有2 * 2 = 4，即4除了能被1和4整除，还能被2整除
 * ● 9是合数 因为除了1 * 9 = 9以外，还有3 * 3 = 9，即9除了能被1和9整除，还能被3整除
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:47
 * @since Java 25
 */
public class PrimeCountWithTime {
    static void main() {
        //开始时间
        long startTime = System.currentTimeMillis();

        //统计100以内质数的个数
        int primeNumberCount = 0;

        for (int number = 2; number <= 100_0000; number++) {
            //定义一个布尔变量表示标记
            //标记number是质数
            boolean isPrimeNumber = true;
            //提前排除偶数：除了2以外，所有偶数都不是质数
            if (number % 2 == 0) {
                //2是唯一的偶质数，单独处理并计数
                if (number == 2) {
                    primeNumberCount++;
                }
                //其他偶数跳过本次循环，不再进行后续判断
                continue;
            }

            //至此，number是大于2的奇数，检查其是否为质数
            //只要检查从3开始到sqrt(number)之间的奇数因子即可
            for (int i = 3; i <= Math.sqrt(number); i += 2) {
                //如果number能被某个奇数整除，则不是质数
                if (number % i == 0) {
                    isPrimeNumber = false; //标记为非质数
                    break; //无需继续检查，提前结束内层循环
                }

            }
            // 根据标记判断number是否为质数，若是则计数器加1
            if (isPrimeNumber) {
                primeNumberCount++;
            }
        }

        //结束时间
        long endTime = System.currentTimeMillis();
        //耗时的时间
        long time = endTime - startTime;
        System.out.printf("100万以内质数的个数是%d个，程序的耗时时间是%d毫秒\n", primeNumberCount, time);
    }
}
