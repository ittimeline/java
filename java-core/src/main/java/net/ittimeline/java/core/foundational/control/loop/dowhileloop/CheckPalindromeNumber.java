package net.ittimeline.java.core.foundational.control.loop.dowhileloop;

import java.util.Scanner;

/**
 * do while循环案例3-回文数
 * 需求：读取键盘输入的整数，判断是否是回文数
 * 分析：
 * ① 回文数是指一个整数正向读和反向读结果相同的数。例如：
 * ● 0是回文数
 * ● 121 是回文数（从左向右：121，从右向左：121）
 * ● 12321 是回文数
 * ● 12345 不是回文数（反向为54321）
 * ● 负数不是回文数（符号不对称）
 * ●  非0且末尾为0的数不是回文数
 * ② 实现思路：
 * 1. 整数反转
 * a. 提取个位：用取余运算（原数 % 10）得到当前最低位。
 * b. 构建反转结果：将已反转部分乘以10，再加上新提取的位（相当于把新位追加到末尾）。
 * c. 移除已处理位：用整数除法（原数 / 10）去掉最后一位。
 * 2. 判断反转后的整数是否和反转前的整数是否相等
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:20
 * @since Java 25
 */
public class CheckPalindromeNumber {
    static void main() {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要判断的整数：");
        int number = scanner.nextInt();
        //第一步：先排除明显不是回文数的情况
        //1.负数不是回文数（符号不对称）
        //2.非0且末尾为0的数不是回文数
        if (number < 0 || (number != 0 && number % 10 == 0)) {
            System.out.println(number + "不是回文数");
            //关闭Scanner
            scanner.close();
            return;
        }

        //第二步：整数反转
        //临时保存number的副本（避免循环中修改number后，后续打印原始值出错）
        int original = number;
        //存储反转结果
        int reversed = 0;
        do {
            //提取number最后一位数字
            int digit = number % 10;
            //提前溢出校验
            //正数溢出判断
            //Java中的int是32位有符号整数，最大值是Integer.MAX_VALUE=(1<<31)-1=2147483647
            /*

                正数反转时，reversed是正数，我们要保证它不会大于2147483647（Integer.MAX_VALUE）
                条件1：如果当前反转结果reversed大于214748364（Integer.MAX_VALUE/10）,那么下一步reversed * 10必然会溢出
                     （因为214748365 *10 =2147483650 >2147483647 ）
                或者
                条件2：如果reversed等于214748364，那么下一步加上个位数digit必须≤7，否则就溢出
                     （因为214748364*10 +8=2147483648>2147483647）

             */
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                System.out.println(original + "不是回文数");
                //关闭Scanner
                scanner.close();
                return;
            }


            //拼接反转结果
            //如果这步超过Integer取值范围（最大值、最小值），就会发生溢出（数值变成乱码），所以必须在计算之前判断
            reversed = reversed * 10 + digit;
            //去掉number最后一个数字
            number = number / 10;
        } while (number != 0);

        //第三步：判断反转后是否等于原数
        if (reversed == original) {
            System.out.println(original + "是回文数");
        } else {
            System.out.println(original + "不是回文数");
        }

        //关闭Scanner
        scanner.close();
    }
}
