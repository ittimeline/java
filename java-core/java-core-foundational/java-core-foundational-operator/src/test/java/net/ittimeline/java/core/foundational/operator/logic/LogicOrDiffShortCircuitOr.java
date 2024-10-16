package net.ittimeline.java.core.foundational.operator.logic;

/**
 * 逻辑或与短路或的区别
 * 逻辑或（|）与短路或（||）的相同点：两个运算符表达的都是或者的关系，只要运算符两边有一边的结果是true，那么运算结果就是true
 * 逻辑或（|）和短路或（||）不同点（执行流程）：
 * 如果运算符左边是false,则逻辑或(|)和短路或(||)都会执行右边的操作
 * 如果运算符左边是true,整个运算结果已经是true，则逻辑或(|)会继续执行右边的操作，但是短路或(||)不会继续执行右边的操作，即短路。
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 19:19
 * @since Java21
 */
public class LogicOrDiffShortCircuitOr {
    public static void main(String[] args) {
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
