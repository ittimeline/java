package net.ittimeline.java.core.foundational.array.onedimensional;

import java.util.Scanner;

/**
 * 一维数组案例3-星期几
 * 需求：用一个数组保存星期一到星期天的 7 个英语单词，从键盘输入 1-7，显示对应的单词，例如输入1，显示Monday，以此类推
 * 分析：
 * 1. 定义数组：存储七天英文单词，按顺序对应 1~7。
 * 2. 输入并校验：提示用户输入 1~7 的数字，读取并检查是否在范围内；若无效则提示重新输入。
 * 3. 输出结果：用输入值减 1 作为下标，输出数组中的对应单词。
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/9 8:04
 * @since Java 25
 */
public class WeekdayLookup {
    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        //1.定义数组：存储七天英文单词，按顺序对应 1~7。
        String[] weeks = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //2.输入并校验：提示用户输入 1~7 的数字，读取并检查是否在范围内；若无效则提示重新输入。
        while (true) {
            System.out.println("请输入数值（1~7）");
            if (!scanner.hasNextInt()) {
                System.out.println("请输入数字！");
                scanner.next(); // 清除错误输入
                continue;
            }
            int number = scanner.nextInt();
            if (number >= 1 && number <= 7) {
                //3. 输出结果：用输入值减 1 作为下标，输出数组中的对应单词。
                //下标的取值范围是0~6
                int index = number - 1;
                System.out.printf("数值%d对应的星期是%s\n", number, weeks[index]);
                break;
            } else {
                System.out.println("你的输入有误，数值范围是1~7");
            }
        }
        //关闭Scanner
        scanner.close();
    }
}
