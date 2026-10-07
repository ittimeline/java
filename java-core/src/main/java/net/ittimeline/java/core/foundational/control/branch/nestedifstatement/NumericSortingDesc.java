package net.ittimeline.java.core.foundational.control.branch.nestedifstatement;

import java.util.Scanner;

/**
 * if else语句嵌套if else if else语句案例：数字降序排序
 * 需求：提示用户从键盘输入三个整数，然后从大到小排序输出
 * 分析：
 * 1. 先比较第一个数和第二个数，决定谁在前面
 * 2. 然后把第三个数分别和前面两个比较，插入到合适的位置
 * 3. 使用 >= 和 <=，避免相等时无法进入分支
 * 示例：
 * 输入：3, 5, 4
 * 输出：5 >= 4 >= 3
 * <p>
 * 输入：3, 3, 2
 * 输出：3 >= 3 >= 2
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 13:12
 * @since Java 25
 */
public class NumericSortingDesc {
    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        //从键盘输入三个整数
        System.out.println("请输入第一个整数：");
        int first = scanner.nextInt();
        System.out.println("请输入第二个整数：");
        int second = scanner.nextInt();
        System.out.println("请输入第三个整数：");
        int third = scanner.nextInt();

        System.out.print("三个整数从大到小的顺序是：");
        /*
            情况一：first >= second
            此时 first 应该排在 second 前面
         */
        if (first >= second) {
            //再判断 third 和first 的关系
            if (third >= first) {
                //third 最大 -> third >= first >= second
                System.out.printf("%d >= %d >= %d\n", third, first, second);
            } else if (third <= second) {
                // third 最小 ->first >= second >= third
                System.out.printf("%d >= %d >= %d\n", first, second, third);
            } else {
                //third 夹在first 和 second 之间 first >= third >= second
                System.out.printf("%d >= %d >= %d\n", first, third, second);
            }
        }
        /*
            情况二：first <= second
            此时 second 应该排在 first前面
         */
        else {
            //再判断thid 和second的关系
            if (third >= second) {
                //third 最大 -> third >= second>= first
                System.out.printf("%d >= %d >= %d\n", third, second, first);
            } else if (third <= first) {
                //third 最小-> second >= first>= thrid
                System.out.printf("%d >= %d >= %d\n", second, first, third);
            } else {
                // third 夹在first 和 second 之间 second >= third >= first
                System.out.printf("%d >= %d >= %d\n", second, third, first);

            }
        }
        // 关闭 Scanner
        scanner.close();
    }
}
