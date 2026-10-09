package net.ittimeline.java.core.foundational.array.onedimensional;

import java.util.Arrays;

/**
 * 一维数组案例1-统计个数
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 8:01
 * @since Java 25
 */
public class CountDivisibleByThree {
    static void main() {
        //静态初始化数组
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        //存储能被3整除的数字个数
        int count = 0;
        //遍历数组
        for (int i = 0; i < numbers.length; i++) {
            //如果数组的元素能被3整除
            if (numbers[i] % 3 == 0) {
                //个数自增一次
                count++;
            }
        }
        System.out.printf("数组%s所有元素能被3整除的数字有%d个\n", Arrays.toString(numbers), count);
    }
}
