package net.ittimeline.java.core.foundational.array.algorithm;

import java.util.Arrays;

/**
 * 数组元素赋值算法-生成不重复的元素
 * 需求：创建一个长度为6的整数类型数组，要求数组元素的值在1-30之间，且是随机赋值，同时要求元素的值各不相同
 * 实现方式1
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 12:42
 * @since Java21
 */
public class GeneratorUniqueElementV1 {
    public static void main(String[] args) {
        //声明并初始化一个名为arr的整数数组，长度为6。
        int[] arr = new int[6];
        //使用一个for循环来迭代数组arr的每一个位置，i的取值（索引）从0到5。
        for (int i = 0; i < arr.length; i++) {
            //生成1~30之间的随机整数
            int rand = (int) (Math.random() * 30) + 1;
            //标记思想：初始化一个布尔变量isExist为false，用于检查随机生成的数是否已经存在于数组中
            boolean isExist = false;
            //内部for循环，用于检查arr数组中从索引0到当前索引i（不包括i）是否存在与rand相等的元素。
            for (int j = 0; j < i; j++) {
                //如果找到一个与rand相等的元素，则设置isExist为true并跳出内部循环。
                if (arr[j] == rand) {
                    //标记随机数已存在。
                    isExist = true;
                    //结束当前循环
                    break;
                }
            }
            //外层for循环，判断rand是否存在arr数组中
            // 如果 isExist 仍然为 false，即随机数不存在于数组中，则将 rand 赋值给 arr[i]
            if (!isExist) {
                //将随机数赋值给arr数组索引为i的元素
                arr[i] = rand;
            }
            //否则，如果rand已经存在于数组中，则需要重新生成一个新的随机数
            else {
                //递减外部循环的索引i，以便再次尝试为当前位置i分配一个不重复的随机数
                i--;
            }
        }
        System.out.println("数组中的元素内容是" + Arrays.toString(arr));
    }
}
