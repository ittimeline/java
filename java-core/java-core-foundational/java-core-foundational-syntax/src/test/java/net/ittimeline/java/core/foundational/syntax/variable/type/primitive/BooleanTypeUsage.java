package net.ittimeline.java.core.foundational.syntax.variable.type.primitive;

/**
 * 布尔类型使用
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 9:42
 * @since Java21
 */
public class BooleanTypeUsage {
    public static void main(String[] args) {
        /******************boolean类型的变量和字面量******************/
        //boolean类型的字面值只能是true或者false
        //boolean类型的变量只能存储true或者false
        boolean flag = true;
        System.out.println("flag = " + flag);
        flag = true;
        System.out.println("flag = " + flag);
        // 不能将非布尔类型的字面值、变量赋值给布尔类型的变量
        //flag = 1;
        /******************布尔类型使用场景******************/
        //1.布尔变量在if/else条件判断语句中的使用
        //是否成年
        boolean isGrowUp = false;
        if (isGrowUp) { //等价于isGrowUp==true 在Java中=表示赋值，==表示是否相等
            System.out.println("恭喜你已经成年了,你就可以去网咖上网打游戏了");
        } else {
            System.out.println("你还没有成年，你不能去网咖上网打游戏");
        }

        //2. 布尔类型字面值在while循环中的使用
        while (true) {
            //每隔1秒打印我是一个死循环并换行
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("我是一个死循环");
        }
    }
}
