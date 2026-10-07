package net.ittimeline.java.core.foundational.control.branch.switchstatement;

import java.util.Scanner;

/**
 * 分支结构switch语句使用注意事项3
 * switch 语句使用表达式和case语句后面的字面量值做相等性判断，不能进行范围判断
 * 开发项目时使用switch语句时，通常case匹配的情况有限，例如判断一个数值是正数还是负数时使用switch语句就不太合适。
 * 需求：判断一个数值是正数还是负数
 * 分析：正数，表示大于0的数，负数，表示小于0的数
 * @author tony 18601767221@163.com
 * @version 2026/10/7 13:34
 * @since Java 25
 */
public class SwitchStatementWarning3 {
    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = scanner.nextInt();
        switch (number) {
            /*
                //编译错误-> 不兼容类型: boolean无法转换为int
                case number > 0:
                    System.out.println("正数");
                    break;
                //编译错误-> 不兼容类型: boolean无法转换为int
                case number < 0:
                    System.out.println("负数");
                    break;
             */

            default:
                System.out.println(0);
                break;

        }
        scanner.close();
    }

}
