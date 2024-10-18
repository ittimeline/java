package net.ittimeline.java.core.foundational.array.algorithm;

import java.util.Arrays;

/**
 * 线性查找算法
 * 需求：定义数组int[] array = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};，查找元素5是否在数组中出现过，如果出现输出首次出现的索引值
 * 分析：遍历数组，将查找的元素和数组中的元素依次进行比较，如果第一次相等则表示出现过（找到了），此时记录对应的索引并终止循环，否则表示没有出现过（没找到）
 * 实现方式1
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 15:25
 * @since Java21
 */
public class LinearSearchIntDataV1 {
    public static void main(String[] args) {
        //静态初始化数组
        int[] array = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};
        //查找元素的索引
        int index = -1;
        //查找的元素
        int target = 5;
        //遍历数组
        for (int i = 0; i < array.length; i++) {
            //如果数组的元素和查找的元素相等
            if (array[i] == target) {
                //将该元素的索引赋值给index
                index = i;
                //结束查找
                break;
            }
        }
        if (index != -1) {
            System.out.printf("【线性查找实现方式1】元素%d在数组%s的索引是%d\n", target, Arrays.toString(array), index);
        } else {
            System.out.printf("【线性查找实现方式1】数组%s中不存在元素%d\n", Arrays.toString(array), target);
        }
    }
}
