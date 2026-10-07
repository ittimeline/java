package net.ittimeline.java.core.foundational.control.loop;

/**
 * 三种循环结构对比
 * for循环、while循环、do while循环都具有四个要素
 * 1. 初始化语句
 * 2. 循环条件判断语句
 * 3. 循环体语句
 * 4. 循环迭代语句
 * 从循环次数角度分析
 * ● do while循环至少会执行一次循环体
 * ● for循环和while循环首先判断循环条件是否成立，然后决定是否执行循环体
 * 三种循环的各自应用场景
 * ● 明确循环次数的使用for循环
 * ● 不明确循环次数的使用while循环
 * ● 如果循环体至少执行一次，可以考虑使用do while循环，实际开发中使用较少
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:21
 * @since Java 25
 */
public class ForLoopWhileLoopDoWhileLoop {
    static void main() {
        //三种循环打印输出0~4
        // 1. for 循环
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // 2. 等价转换为 while 循环
        int i = 0; // 初始条件移到外面
        while (i < 5) { // 循环条件判断
            System.out.println(i);
            i++; // 循环迭代语句移到里面
        }

        // 3. 等价转换为 do-while 循环
        int j = 0; // 初始条件
        do {
            System.out.println(j);
            j++; // 循环迭代语句
        } while (j < 5); // 循环条件判断
    }
}
