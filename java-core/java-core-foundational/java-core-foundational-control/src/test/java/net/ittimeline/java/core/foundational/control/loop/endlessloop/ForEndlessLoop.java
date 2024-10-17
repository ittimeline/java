package net.ittimeline.java.core.foundational.control.loop.endlessloop;

/**
 * for循环死循环使用
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 21:06
 * @since Java21
 */
public class ForEndlessLoop {
    public static void main(String[] args) {
        //for循环死循环
        for (; ; ) {
            //每间隔1秒打印好好学习并换行
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("好好学习");
        }
        //无限循环后不能有执行语句
        //编译错误：无法访问的语句
        //System.out.println("天天向上");
    }
}
