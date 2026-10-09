package net.ittimeline.java.core.foundational.array.onedimensional;

import java.util.Arrays;

/**
 * 一维数组内存分析案例4-一个引用先后指向两个数组内存分析
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 8:21
 * @since Java 25
 */
public class ReassignedArrayMemory {
    static void main() {
        int[] array = new int[]{10, 20, 30};
        System.out.println("查看array数组名（逻辑地址）： " + array);
        System.out.println("查看array数组元素内容： " + Arrays.toString(array));
        array = new int[]{40, 50, 60};
        System.out.println("再次查看array数组名（逻辑地址）： " + array);
        System.out.println("再次查看array数组元素内容：" + Arrays.toString(array));
    }
}
