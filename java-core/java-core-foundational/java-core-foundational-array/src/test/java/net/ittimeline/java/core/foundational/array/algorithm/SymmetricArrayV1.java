package net.ittimeline.java.core.foundational.array.algorithm;

import java.util.Arrays;

/**
 * 数组反转算法-对称数组
 * 需求：判断数组是不是对称数组，例如 1 2 3 4 5 4 3 2 1 是一个对称数组，1 2 3 4 5 4 3 2 1 0不是一个对称数组
 * 分析：
 * 假设array表示数组，i表示数组元素的索引，i的取值范围是从0到array.length-1
 * 判断是否为对称就是依次判断array[i]和array[array.length-1-i]是否相等，如果相等就是对称数组，否则就不是对称数组。
 * 实现方式1
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 13:39
 * @since Java21
 */
public class SymmetricArrayV1 {
    public static void main(String[] args) {
        {
            //对称数组测试用例
            int[] array = {1, 2, 3, 4, 5, 4, 3, 2, 1};
            boolean isSymmetric = true;
            for (int i = 0; i < array.length / 2; i++) {
                if (array[i] != array[array.length - i - 1]) {
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

        {
            //非对称数组测试用例
            int[] array = {1, 2, 3, 4, 5, 4, 3, 2, 1, 0};
            boolean isSymmetric = true;
            for (int i = 0; i < array.length / 2; i++) {
                if (array[i] != array[array.length - i - 1]) {
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
}
