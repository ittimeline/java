package net.ittimeline.java.core.foundational.array.algorithms;

import java.util.Arrays;

/**
 * 数组常见算法-数组元素赋值-生成不重复元素
 * 需求：创建一个长度为6的整数数组，要求数组元素的值在1-30之间，且是随机赋值，同时要求元素的值各不相同
 * 分析：
 * ① 声明并初始化长度为6的整型数组
 * ② 外层循环遍历数组索引，为每个位置确定一个不重复的随机值
 * ③ 生成1-30范围内的随机数
 * ④ 内层循环检查该数是否已存在于数组中（标记法）
 * ⑤ 若存在则重新生成（回到步骤 3），若不存在则赋值给当前索引
 * ⑥ 输出结果
 * 实现方式1
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 8:54
 * @since Java 25
 */
public class RandomUniqueArrayV1 {
    static void main() {
        //1.声明并初始化长度为6的整型数组
        int[] arr = new int[6];
        //2.外层循环遍历数组索引，为每个位置确定一个不重复的随机值
        for (int i = 0; i < arr.length; i++) {
            //3.生成1-30范围内的随机数
            int randomNumber = (int) (Math.random() * 30) + 1;
            //4.内层循环检查该数是否已存在于数组中（标记法）
            boolean isExist = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] == randomNumber) {
                    //存在则将标记改为true
                    isExist = true;
                    //找到即退出循环
                    break;
                }
            }
            //5.若存在则重新生成（回到步骤 3），若不存在则赋值给当前索引
            //不存在则存入数组
            if (!isExist) {
                arr[i] = randomNumber;
            } else {
                //存在则重新执行本次赋值
                i--;
            }
        }
        //6.输出结果
        System.out.println("数组中的元素内容是" + Arrays.toString(arr));
    }
}
