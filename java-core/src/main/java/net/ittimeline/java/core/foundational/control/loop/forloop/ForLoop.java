package net.ittimeline.java.core.foundational.control.loop.forloop;

/**
 * for循环语法格式和执行流程
 * <pre>
 *     for(①初始化语句;②循环条件判断语句;④循环迭代语句){
 *         ③循环体;
 *     }
 * </pre>
 * 1. 执行①初始化语句
 * 2. 执行②循环条件判断语句，看执行结果是true还是false
 * a. 如果②循环条件判断语句执行结果为true，那么执行③循环体语句，然后再执行④循环迭代语句，然后再重复执行②循环条件判断语句、③循环体语句、④循环迭代语句
 * b. 如果②循环条件判断语句执行结果为false，那么就立刻结束当前循环结构
 * <pre>
 *
 * </pre>
 * <p>
 * for循环使用
 * 需求：使用for循环输出5个HelloWorld
 * 分析：① 循环5次   ② 循环体打印输出HelloWorld
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:03
 * @since Java 25
 */
public class ForLoop {
    static void main() {
        System.out.println("1.不使用for循环实现输出5个Hello World");

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        System.out.println("2.使用for循环实现输出5个Hello World");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }
}
