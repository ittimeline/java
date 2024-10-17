package net.ittimeline.java.core.foundational.control.loop.whileloop;

/**
 * while循环使用注意事项2
 * while循环使用时特别容易忘记写④循环迭代语句，这样会造成死循环
 * 需求：使用while循环打印输出5个跟光磊学Java从小白到架构师
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 19:22
 * @since Java21
 */
public class WhileLoopWarning2 {
    public static void main(String[] args) {
        //初始化语句
        int i = 0;
        //循环条件判断语句
        while (i < 5) {
            //循环体语句
            //每隔1秒打印跟光磊学Java从小白到架构师并换行
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("跟光磊学Java从小白到架构师");

        }
    }
}
