package net.ittimeline.java.core.foundational.control.loop.forloop;

import java.util.Scanner;

/**
 * for循环案例8-统计满足条件的数字
 * 需求：键盘输入两个数字表示一个范围，统计该范围中既能被3整除又能被5整除数字的数量
 * 分析：
 * 1. 处理输入范围：通过比较开始的数字和结束的数字并交换，确保遍历的方向正确（从小到大），避免循环出错。
 * 2. 循环遍历：用for循环覆盖范围内的每一个数（包含两端），这是统计类问题的标准做法。
 * 3. 计数与输出：使用计数器变量累加符合条件的数字，最终输出结果。
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:08
 * @since Java 25
 */
public class CountMultiplesOfThreeAndFive {
    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入开始的数字（整数）");
        int startNumber = scanner.nextInt();
        System.out.println("请输入结束的数字（整数）");
        int endNumber = scanner.nextInt();

        //确保范围从小到大
        // 如果起始值大于结束值，则交换两者，保证遍历时 startNumber <= endNumber
        if (startNumber > endNumber) {
            int temp = endNumber;
            endNumber = startNumber;
            startNumber = temp;
        }
        // 计数器，初始为0
        int count = 0;

        for (int i = startNumber; i <= endNumber; i++) {
            // 判断当前数 i 是否能同时被3和5整除（等价于能被15整除）
            if (i % 3 == 0 && i % 5 == 0) {
                //满足条件，计数器加1
                count++;
            }
        }
        System.out.printf("在%d到%d之间，既能被3整除又能被5整除的数字个数为%d\n", startNumber, endNumber, count);

        //关闭Scanner
        scanner.close();

    }
}
