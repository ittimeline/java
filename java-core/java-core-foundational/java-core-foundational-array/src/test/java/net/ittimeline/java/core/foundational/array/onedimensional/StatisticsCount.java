package net.ittimeline.java.core.foundational.array.onedimensional;

import java.util.Arrays;

/**
 * 统计个数
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 9:08
 * @since Java21
 */
public class StatisticsCount {
    public static void main(String[] args) {
        //静态初始化数组
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
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
