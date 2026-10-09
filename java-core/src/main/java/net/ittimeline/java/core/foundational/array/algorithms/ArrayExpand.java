package net.ittimeline.java.core.foundational.array.algorithms;

import java.util.Arrays;

/**
 * 数组常见算法-数组扩容-扩容整数数组
 * 需求：现有数组int[] array= {1,2,3,4,5};，现将数组长度扩容1倍
 * 分析：
 * 1. 初始化数组array
 * 2. 创建新数组newArray，新数组的长度是array的2倍
 * 3. 将原数组的内容复制到新数组
 * 4. 将新数组newArray赋值给数组array
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 9:03
 * @since Java 25
 */
public class ArrayExpand {
    static void main() {
        // 1. 初始化数组array
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("初始化后array数组的内容是" + Arrays.toString(array));
        // 2. 创建新数组newArray，新数组的长度是array的2倍
        //int[] newArray = new int[array.length * 2];
        int[] newArray = new int[array.length << 1];
        // 3. 将原数组的内容复制到新数组
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        // 4. 将新数组newArray赋值给数组array
        array = newArray;
        //新数组长度变为10，未赋值位置默认为0
        System.out.println("扩容后array数组的内容是" + Arrays.toString(array));
    }
}
