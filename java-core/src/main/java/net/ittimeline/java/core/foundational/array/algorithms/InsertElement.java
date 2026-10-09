package net.ittimeline.java.core.foundational.array.algorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 数组常见算法-数组插入元素
 * 需求：现有一个整数数组int[] array = {10, 20, 30, 40, 50};，
 * 需要从键盘接收一个整数输入（例如100），并将该整数插入到指定下标位置（例如下标1），数组其余元素依次后移。
 * 分析：
 * 1. 创建新数组：长度比原数组大1，为插入元素腾出位置。
 * 2. 插入新值：把键盘输入的整数放到指定下标
 * 3. 复制元素：
 * ● 插入位置之前的元素原样复制
 * ● 从插入位置开始的原有元素及其之后的所有元素，在新数组中整体后移一个位置
 * 4. 更新数组引用：用新数组替换原数组
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 9:09
 * @since Java 25
 */
public class InsertElement {
    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        int[] array = {10, 20, 30, 40, 50};
        System.out.println("插入前数组元素内容是：" + Arrays.toString(array));
        System.out.println("请输入插入的元素");
        int number = scanner.nextInt();
        System.out.println("请输入插入的位置");
        int targetIndex = scanner.nextInt();
        //校验插入位置是否合法（0~原数组长度）
        if (targetIndex < 0 || targetIndex > array.length) {
            System.out.println("插入位置无效，应在0~" + array.length + "之间");
            //关闭Scanner
            scanner.close();
            return;
        }
        //1. 创建新数组：长度比原数组大1，为插入元素腾出位置。
        int[] newArray = new int[array.length + 1];
        //2. 插入新值：把键盘输入的整数放到指定下标
        newArray[targetIndex] = number;
        //3. 复制元素
        //插入位置之前的元素原样复制
        for (int i = 0; i < targetIndex; i++) {
            newArray[i] = array[i];
        }
        //从插入位置开始的原有元素及其之后的所有元素，在新数组中整体后移一个位置
        for (int i = targetIndex; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }

        //4. 更新数组引用：用新数组替换原数组
        array = newArray;
        System.out.println("插入后数组元素内容是：" + Arrays.toString(array));
        //关闭Scanner
        scanner.close();

    }
}
