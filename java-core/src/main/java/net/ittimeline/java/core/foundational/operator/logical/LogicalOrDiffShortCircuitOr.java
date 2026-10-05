package net.ittimeline.java.core.foundational.operator.logical;

/**
 * 逻辑或与短路或的区别
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 14:44
 * @since Java 25
 */
public class LogicalOrDiffShortCircuitOr {

    static void main() {
        System.out.println("******************1.逻辑或的使用******************");
        {
            int x = 1;
            int y = 1;
            /*
                x++等于1，x++ == 1，结果是true
                ++y等于2，y等于2，++y == 1，结果是false
                x++ == 1 | ++y == 1，即true |false 结果是true
                执行x = 7;
                x等于7
             */
            if (x++ == 1 | ++y == 1) {
                x = 7;
            }
            /*
                x等于7
                y等于2
             */
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
        System.out.println("******************2.短路或的使用******************");
        {
            int x = 1, y = 1;
            /*
                x++等于1，x等于2，x++ == 1，结果是true
                x++ == 1 || ++y == 1，结果是true
                由于||具有短路特性，不会执行++y == 1，y等于1
                执行x = 7;
                x等于7

             */
            if (x++ == 1 || ++y == 1) {
                x = 7;
            }
            /*
                x等于7
                y等于1
             */
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}
