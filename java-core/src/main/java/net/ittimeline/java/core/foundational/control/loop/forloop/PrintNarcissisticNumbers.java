package net.ittimeline.java.core.foundational.control.loop.forloop;

/**
 * for循环案例10-求三位数水仙花数
 * 需求：控制台打印输出三位数的水仙花数
 * 分析：水仙花数指的是每个位上的数字的 3次幂之和等于它本身
 * 三位的水仙花数共有4个：153，370，371，407
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:10
 * @since Java 25
 */
public class PrintNarcissisticNumbers {
    static void main() {
        System.out.print("三位的水仙花数是");
        // 标志位，用于控制第一个数字前不加逗号，后续数字前先打印逗号
        boolean isFirst = true;
        // 遍历所有三位数（100-999）
        for (int i = 100; i < 1000; i++) {
            // 水仙花数指的是每个位上的数字的 3次幂之和等于它本身
            // 获取当前数的个位、十位、百位
            int ones = i / 1 % 10;
            int tens = i / 10 % 10;
            int hundreds = i / 100 % 10;

            int sum = ones * ones * ones
                    + tens * tens * tens
                    + hundreds * hundreds * hundreds;

            // 如果立方和等于原数，则为水仙花数，打印输出
            if (i == sum) {
                if (isFirst) {
                    // 第一个水仙花数前面不加逗号，直接打印
                    System.out.print(i);
                    // 打印后将标志置为false，后续数字需要先加逗号
                    isFirst = false;
                } else {
                    // 非第一个水仙花数，先打印中文逗号，再打印数字
                    System.out.print("，" + i);
                }
            }
        }
    }
}
