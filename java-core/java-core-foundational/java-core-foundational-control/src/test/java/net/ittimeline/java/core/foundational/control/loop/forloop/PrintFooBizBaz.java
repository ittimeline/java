package net.ittimeline.java.core.foundational.control.loop.forloop;

/**
 * 打印满足条件的字符串
 * 需求：打印100-150之间的数
 * ● 如果这个数被3整除打印foo
 * ● 如果这个数被5整除打印biz
 * ● 如果这个数被7整除打印baz
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 18:03
 * @since Java21
 */
public class PrintFooBizBaz {
    public static void main(String[] args) {
        for (int i = 100; i <= 150; i++) {
            System.out.print(i + "\t");
            if (i % 3 == 0) {
                System.out.print("foo\t");
            }
            if (i % 5 == 0) {
                System.out.print("biz\t");
            }
            if (i % 7 == 0) {
                System.out.print("baz\t");
            }
            //换行
            System.out.println();
        }
    }
}
