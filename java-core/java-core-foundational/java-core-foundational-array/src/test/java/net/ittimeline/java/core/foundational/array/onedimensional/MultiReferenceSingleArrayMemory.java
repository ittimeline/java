package net.ittimeline.java.core.foundational.array.onedimensional;

import java.util.Arrays;

/**
 * 两个引用指向同一个一维数组内存分析
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 9:06
 * @since Java21
 */
public class MultiReferenceSingleArrayMemory {
    public static void main(String[] args) {
        //初始化numbers1数组
        int[] numbers1 = {10, 20, 30};
        System.out.println("numbers1 = " + numbers1);
        //初始化numbers2数组
        int[] numbers2 = numbers1;
        System.out.println("numbers2 = " + numbers2);
        System.out.println("numbers1数组的元素内容是" + Arrays.toString(numbers1));
        System.out.println("numbers2数组的元素内容是" + Arrays.toString(numbers2));
        System.out.println("将numbers2数组的0号索引元素的值修改为8");
        //将numbers2数组的0号索引元素的值修改为8
        numbers2[0] = 8;
        System.out.println("numbers1数组的元素内容是" + Arrays.toString(numbers1));
        System.out.println("numbers2数组的元素内容是" + Arrays.toString(numbers2));
    }
}
