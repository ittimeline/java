package net.ittimeline.java.core.foundational.array.algorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 数组常见算法-数组删除元素
 * 需求： 对给定的整数数组int[] array = {10, 20, 30, 40, 50};，从键盘输入一个要删除的元素值（例如30）的操作。
 * 删除后其余元素保持原有顺序，数组长度相应减少。
 * 分析：
 * 1. 查找下标：遍历原数组，定位第一个与输入值相等的元素下标。
 * 2. 判断存在：若未找到（下标为-1），输出提示并结束；否则继续。
 * 3. 创建新数组：长度为原数组长度减1。
 * 4. 复制元素：遍历原数组，跳过目标下标，其余元素按顺序复制到新数组。
 * 5. 更新引用：将原数组引用指向新数组。
 * 6. 输出结果：打印删除后的数组内容。
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 9:13
 * @since Java 25
 */
public class DeleteElement {
    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        int[] array = {10, 20, 30, 40, 50};
        System.out.println("删除之前数组元素内容是：" + Arrays.toString(array));
        System.out.println("请输入要删除的元素");
        int number = scanner.nextInt();
        //1. 查找下标：遍历原数组，定位第一个与输入值相等的元素下标
        // 初始为-1表示未找到
        int targetIndex = -1;
        //查找第一个匹配元素的下标
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                targetIndex = i;
                break; //只删除第一个匹配项
            }
        }
        //2. 判断存在：若未找到（下标为 -1），输出提示并结束；否则继续
        if (targetIndex != -1) {
            //3. 创建新数组：长度为原数组长度减 1
            int[] newArray = new int[array.length - 1];
            //4. 复制元素：遍历原数组，跳过目标下标，其余元素按顺序复制到新数组
            //使用双指针复制元素：原数组指针i，新数组指针j
            for (int i = 0, j = 0; i < array.length; i++) {
                // 跳过要删除的元素下标，其余元素依次复制到新数组
                if (i != targetIndex) {
                    newArray[j++] = array[i];
                }
            }
            //5. 更新引用：将原数组引用指向新数组
            array = newArray;
            //6. 输出结果：打印删除后的数组内容
            System.out.println("删除之后数组元素内容是：" + Arrays.toString(array));
        } else {
            System.out.println("删除的元素" + number + "不存在");
        }
        //关闭Scanner
        scanner.close();
    }
}
