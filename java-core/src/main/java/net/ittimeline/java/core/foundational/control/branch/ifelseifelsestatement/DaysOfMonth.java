package net.ittimeline.java.core.foundational.control.branch.ifelseifelsestatement;

import java.util.Scanner;

/**
 *
 * 多分支结构 if else if else语句案例8-根据年份和月份判断当月天数
 * 需求：键盘输入年份和月份，输出该年该月有多少天
 * <p>
 * 分析：
 * ① 判断月份是否合法 [1,12]，不合法则提示
 * ② 大月(1,3,5,7,8,10,12) 31天；小月(4,6,9,11) 30天
 * ③ 2月需判断闰年：闰年29天，平年28天
 * 闰年条件：(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 13:19
 * @since Java 25
 */
public class DaysOfMonth {
    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份");
        if (!scanner.hasNextInt()) {
            System.out.println("输入错误：年份必须是整数！");
            return;
        }
        int year = scanner.nextInt();

        System.out.println("请输入月份");
        if (!scanner.hasNextInt()) {
            System.out.println("输入错误：月份必须是整数！");
            return;
        }

        int month = scanner.nextInt();

        // 3. 判断月份是否合法 [1,12]
        if (month >= 1 && month <= 12) {

            int days;
            // 4. 按月份分类判断天数
            if (month == 2) {
                // 2月：判断闰年
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29;   // 闰年
                } else {
                    days = 28;   // 平年
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                days = 30;       // 小月
            } else {
                days = 31;       // 大月
            }

            System.out.printf("%d年%d月共有%d天%n", year, month, days);

        } else {
            System.out.println("月份非法：请输入 1~12 之间的月份！");
        }


        //关闭Scanner
        scanner.close();
    }
}
