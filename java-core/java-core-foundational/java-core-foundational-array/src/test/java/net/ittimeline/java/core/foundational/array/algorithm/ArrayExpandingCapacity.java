package net.ittimeline.java.core.foundational.array.algorithm;

import java.util.Arrays;

/**
 * 数组扩容算法
 * 需求：现有数组int[] array= {1,2,3,4,5};，现将数组长度扩容1倍，并将10，20，30三个元素添加到array数组中，如何实现？
 * 分析：
 * 1. 创建新数组newArray，新数组的长度是array的2倍
 * 2. 将原数组的内容复制到新数组
 * 3. 将10，20，30添加到新数组中
 * 4. 将新数组newArray赋值给数组array
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 15:05
 * @since Java21
 */
public class ArrayExpandingCapacity {
    public static void main(String[] args) {
        //静态出初始化数组array
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("初始化后array数组的内容是" + Arrays.toString(array));
        //动态初始化新数组newArray，长度是原数组array的1倍
        int[] newArray = new int[array.length << 2];
        //int[] newArray = new int[array.length * 2];
        //将原数组的内容拷贝到新数组
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        //将10,20,30添加到newArray数组中
        for (int i = 0; i < 3; i++) {
            newArray[array.length + i] = (i + 1) * 10;
        }
        //将newArray赋值给array
        array = newArray;
        System.out.println("扩容后array数组的内容是" + Arrays.toString(array));
    }
}
