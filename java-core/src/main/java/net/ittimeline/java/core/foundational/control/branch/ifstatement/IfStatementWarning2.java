package net.ittimeline.java.core.foundational.control.branch.ifstatement;

/**
 * 单分支结构if语句使用注意事项2
 * 如果对布尔类型的变量进行判断，可以直接将这个变量写在括号()中，
 * 默认会判断布尔变量是否为true，但是需要注意区分==和=，==表示判断是否相等，=表示赋值。
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 11:30
 * @since Java 25
 */
public class IfStatementWarning2 {
    static void main() {
        boolean flag = true;
        //判断flag是否为true方式1
        if (flag == true) {
            System.out.println("1.flag为true");
        }
        //判断flag是否为true方式2
        if (flag) {
            System.out.println("2.flag为true");
        }
        //但是需要注意区分==和=，==表示判断是否相等，=表示赋值
        flag = false;
        if (flag = true) {
            //一定会执行
            System.out.println("3.flag为true");
        }
    }
}
