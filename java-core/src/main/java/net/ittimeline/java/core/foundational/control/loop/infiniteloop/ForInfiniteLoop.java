package net.ittimeline.java.core.foundational.control.loop.infiniteloop;

/**
 * for循环死循环语法格式
 * for(;;){
 * }
 * for循环死循环使用
 * 需求：使用for循环死循环每隔一秒打印好好学习
 * 分析：① 循环次数为无数次  ② 循环体每隔一秒打印好好学习
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:32
 * @since Java 25
 */
public class ForInfiniteLoop {
    static void main() {
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
        // System.out.println("天天向上");
    }
}
