package net.ittimeline.java.core.foundational.array.algorithm;

import java.util.Arrays;

/**
 * 数组元素赋值算法-生成不重复的元素
 * 需求：创建一个长度为6的整数类型数组，要求数组元素的值在1-30之间，且是随机赋值，同时要求元素的值各不相同
 * 实现方式2
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 12:50
 * @since Java21
 */
public class GeneratorUniqueElementV2 {
    public static void main(String[] args) {
        //声明并初始化一个名为 arr 的整数数组，长度为6。
        int[] arr = new int[6];
        //使用一个for循环来迭代数组arr的每一个位置，i的取值（索引）从0到5。
        for (int i = 0; i < arr.length; i++) {
            //计数器思想：初始化一个计数器 count，用来记录生成的随机数 rand 在数组 arr 中是否存在
            int count = 0;
            //生成1~30之间的随机整数
            int rand = (int) (Math.random() * 30) + 1;
            //内部for循环，用于检查arr数组中从索引0到当前索引当前索引i（不包括i）是否存在与rand相等的元素。
            for (int j = 0; j < i; j++) {
                //如果在数组 arr 中找到了一个等于rand的元素，则增加count的值，并退出内层循环。
                if (arr[j] == rand) {
                    //增加计数器count的值，表示找到了一个与rand相等的元素。
                    count++;
                    //立刻退出内层循环，因为只要找到一个相等的元素就足够了
                    break;
                }
            }
            //外层for循环，判断rand是否存在arr数组中
            //检查count是否等于1，如果等于1，则表示rand已经存在于数组中。
            if (count == 1) {
                i--;
            }
            //如果count不等于1，说明rand未在数组中找到，则将rand赋值给arr[i]。
            else {
                //将rand赋值给数组arr的当前索引位置 i。
                arr[i] = rand;
            }
        }
        System.out.println("数组中的元素内容是" + Arrays.toString(arr));
    }
}
