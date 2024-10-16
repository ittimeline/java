package net.ittimeline.java.core.foundational.operator.logic;

/**
 * 逻辑与和短路与的区别
 * 逻辑与（&）和短路与（&&）相同点：两个运算符表达的都是并且的关系，只有当符号左右两边的结果都为true，结果才为true
 * 逻辑与（&）和短路与（&&）不同点（执行流程）：
 * 如果运算符左边是true，则逻辑与（&）、短路与（&&）都会执行运算符右边的操作。
 * 如果运算符左边是false，则逻辑与（&）会继续执行运算符右边的操作，但是短路与（&&）不会执行运算符右边的操作，即短路。
 * 日常开发中推荐使用短路与
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 18:58
 * @since Java21
 */
public class LogicAndDiffShortCircuitAnd {
    public static void main(String[] args) {
        System.out.println("******************1.逻辑与的使用******************");
        {
            int x = 1;
            int y = 1;
            /*
                x++等于1，x等于2，x++ == 2，结果是false
                ++y等于2，y等于2，++y == 2，结果是true
                x++ ==2 & ++y ==2，即false & true 结果是false
                因此x = 7;不会执行
             */
            if (x++ == 2 & ++y == 2) {
                x = 7;
            }
            /*
                x等于2
                y等于2
             */
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }

        System.out.println("******************2.短路与的使用******************");
        int x = 1, y = 1;
        /*
             x++等于1，x等于2，x++ == 2结果是false
             x++ == 2 && ++y == 2，结果是false
             由于&&短路特性不会执行++y == 2，y等于1
         */
        if (x++ == 2 && ++y == 2) {
            x = 7;
        }
        /*
            x等于2
            y等于1
         */
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
