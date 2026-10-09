package net.ittimeline.java.core.foundational.array.algorithms;

import java.util.Arrays;

/**
 * 数组常见算法-判断对称数组
 * 需求：判断数组是不是对称数组，例如 5 4 3 2 1 2 3 4 5 是一个对称数组
 * 分析：
 * ● 假设array表示数组，i表示数组元素的索引，i的取值范围是从0到array.length-1
 * ● 判断是否为对称就是依次判断array[i]和array[array.length-1-i]是否相等，如果相等就是对称数组，否则就不是对称数组。
 * ● 判断次数是array.length/2
 * 实现方式1
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 9:00
 * @since Java 25
 */
public class SymmetricArrayV1 {
    static void main() {
        //对称数组测试用例
        int[] array = {5, 4, 3, 2, 1, 2, 3, 4, 5};
        //非对称数组测试用例
        //int[] array = {1, 2, 3, 4, 5, 4, 3, 2, 1, 0};

        boolean isSymmetric = true;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                isSymmetric = false;
                break;
            }
        }
        if (isSymmetric) {
            System.out.println(Arrays.toString(array) + "是对称数组");
        } else {
            System.out.println(Arrays.toString(array) + "不是对称数组");
        }

    }
}
