package net.ittimeline.java.core.foundational.control.loop.infiniteloop;

/**
 * while循环死循环语法格式
 * while(true){
 * <p>
 * }
 * while循环死循环使用
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:34
 * @since Java 25
 */
public class WhileInfiniteLoop {
    static void main() {
        //while循环无限循环
        while (true) {
            //每间隔1秒打印好好学习并换行
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("好好学习");
        }
        //死循环后不能有执行语句
        //编译错误：无法访问的语句
        //System.out.println("天天向上");
    }
}
