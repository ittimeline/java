package net.ittimeline.java.core.foundational.array.algorithms;

import java.util.Scanner;

/**
 * 数组常见算法-数组扩容-扩容整数数组
 * 需求：
 * <ol>
 *   <li>创建一个初始长度为 5 的整数数组。</li>
 *   <li>循环从键盘接收整数输入，输入 0 时结束（0 不存入数组）。</li>
 *   <li>当数组满时自动扩容至原长度的 1.5 倍（向下取整）。</li>
 *   <li>程序结束后打印数组中所有有效元素。</li>
 * </ol>
 * <p>
 * 分析：
 * <ol>
 *   <li>初始化数组：创建长度为 5 的 int 数组，用于存放用户输入的整数。</li>
 *   <li>定义计数器：用变量 size 记录实际已存储的元素个数，初始为 0。
 *       注意区分：array.length 是当前容量，size 是实际元素个数。</li>
 *   <li>创建 Scanner 对象，用于读取键盘输入。</li>
 *   <li>读取输入：使用 while (true) 循环持续从键盘读取整数。</li>
 *   <li>结束条件：若输入为 0，立即 break 退出循环，且不将 0 存入数组。</li>
 *   <li>数据存储：若输入非零，先判断数组是否已满（size == array.length）。
 *     <ul>
 *       <li>若未满，直接存入 array[size]，然后 size++。</li>
 *       <li>若已满，先扩容再存入。</li>
 *     </ul>
 *   </li>
 *   <li>数组扩容：当 size == array.length 时：
 *     <ul>
 *       <li>计算新长度 newLength = (int)(array.length * 1.5)，向下取整。</li>
 *       <li>创建新数组 int[] newArray = new int[newLength];</li>
 *       <li>用 for 循环把原数组元素逐个复制到新数组。</li>
 *       <li>将原引用 array 指向新数组。</li>
 *     </ul>
 *   </li>
 *   <li>关闭 Scanner，释放资源。</li>
 *   <li>输出结果：只遍历前 size 个元素，避免打印扩容后多余的默认值 0。</li>
 * </ol>
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 9:05
 * @since Java 25
 */
public class DynamicArrayExpansion {
    static void main() {
        //1.初始容量为 5 的数组
        int[] array = new int[5];
        //2.实际已存储的元素个数
        int size = 0;

        //3.创建 Scanner 对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数（输入 0 结束）：");

        //4.循环读取输入
        while (true) {
            int input = scanner.nextInt();

            //5.输入 0 立即退出，不存入数组
            if (input == 0) {
                break;
            }

            //6.判断数组是否已满，满了就扩容
            if (size == array.length) {
                //6.1 计算新长度：原长度的 1.5 倍，向下取整
                int newLength = (int) (array.length * 1.5);
                //6.2 创建新数组
                int[] newArray = new int[newLength];
                //6.3 把原数组元素逐个复制到新数组
                for (int i = 0; i < array.length; i++) {
                    newArray[i] = array[i];
                }
                //6.4 让原引用指向新数组
                array = newArray;
                System.out.println("【数组已满，自动扩容至 " + newLength + "】");
            }

            //7.存入元素并更新计数器
            array[size] = input;
            size++;
        }

        //8.关闭Scanner
        scanner.close();

        //9.输出有效元素：只遍历前 size 个
        System.out.print("最终数组：[");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("实际元素个数：" + size);
    }
}
