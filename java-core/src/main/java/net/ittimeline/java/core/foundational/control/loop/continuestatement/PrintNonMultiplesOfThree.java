package net.ittimeline.java.core.foundational.control.loop.continuestatement;

/**
 * continue语句案例2-输出满足条件的数据
 * 需求：将100到150之间不能被3整除的数输出，并且每行输出5个
 * 分析： ① 确定范围 ② 判断条件不能被3整除 ③ 输出格式：每行输出5个数
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:31
 * @since Java 25
 */
public class PrintNonMultiplesOfThree {
    static void main() {
        System.out.println("100到150之间不能被3整除的数如下");
        int count = 0;
        for (int i = 100; i <= 150; i++) {
            //i能被3整除
            if (i % 3 == 0) {
                //结束本次循环，继续下次循环
                continue;
            }
            count++;
            System.out.print(i + " ");
            //每行显示5个
            if (count % 5 == 0) {
                System.out.println();
            }
        }
    }
}
