package net.ittimeline.java.core.foundational.control.loop.forloop;

/**
 * for循环案例7-打印满足条件的字符串
 * 需求：打印100-150之间的数
 * ● 如果这个数被3整除打印 foo
 * ● 如果这个数被5整除打印biz
 * ● 如果这个数被7整除打印baz
 * 分析：循环51次，循环体判断数字是否满足条件，三个条件是并列（独立）的关系
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:08
 * @since Java 25
 */
public class PrintFooBizBaz {
    static void main() {
        for (int i = 100; i <= 150; i++) {
            System.out.print(i + "\t");
            //如果这个数被3整除打印 foo
            if (i % 3 == 0) {
                System.out.print("foo\t");
            }
            //如果这个数被5整除打印biz
            if (i % 5 == 0) {
                System.out.print("biz\t");
            }
            //如果这个数被7整除打印baz
            if (i % 7 == 0) {
                System.out.print("baz\t");
            }
            //换行
            System.out.println();
        }
    }
}
