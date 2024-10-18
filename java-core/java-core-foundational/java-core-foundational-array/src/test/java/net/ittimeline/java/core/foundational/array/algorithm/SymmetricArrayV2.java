package net.ittimeline.java.core.foundational.array.algorithm;

import java.util.Arrays;

/**
 * 数组反转算法-对称数组
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 13:42
 * @since Java21
 */
public class SymmetricArrayV2 {
    public static void main(String[] args) {

        {
            //对称数组测试用例
            int[] array = {1, 2, 3, 4, 5, 4, 3, 2, 1};
            boolean isSymmetric = true;
            for (int i = 0, j = array.length - 1; i < j; i++, j--) {
                if (array[i] != array[j]) {
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
            for (int i = 0, j = array.length - 1; i < j; i++, j--) {
                if (array[i] != array[j]) {
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
