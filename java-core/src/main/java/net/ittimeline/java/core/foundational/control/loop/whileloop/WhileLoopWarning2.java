package net.ittimeline.java.core.foundational.control.loop.whileloop;

/**
 * while循环使用注意事项2
 * while循环使用时特别容易忘记写 ④循环迭代语句，这样会造成死循环
 * 需求：使用while循环打印输出5个跟光磊学Java从小白到架构师
 * 分析：千万别忘记循环迭代语句
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:15
 * @since Java 25
 */
public class WhileLoopWarning2 {
    static void main() {
        //①初始化语句
        int i = 0;
        //②循环条件判断语句
        while (i < 5) {
            //③循环体语句
            //每隔1秒打印跟光磊学Java从小白到架构师并换行
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("跟光磊学Java从小白到架构师");
            //没有④循环迭代语句

        }
    }
}
