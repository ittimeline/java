package net.ittimeline.java.core.foundational.control.loop.nestedloop;

/**
 * 嵌套循环使用注意事项1
 * break语句只能结束当前循环，也就是说如果break语句在内层循环使用只能结束内层循环，而不能结束外层循环。
 * 如果想要结束外层循环，可以使用带标签的嵌套循环后，使用break加上外层循环的标签来结束外层循环。
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 21:30
 * @since Java21
 */
public class NestedLoopWarning1 {
    public static void main(String[] args) {
        System.out.println("******************不带标签的嵌套for循环结合break语句的使用******************");
        //外层循环
        for (int i = 0; i < 2; i++) {
            //内层循环
            for (int j = 0; j < 3; j++) {
                if (j == 2) {
                    //这里的break语句结束内层循环
                    break;
                }
                /*
                        程序运行结果
                        i的取值是0，1
                        j的取值0，1

                        i = 0 j = 0
                        i = 0 j = 1

                        i = 1 j = 0
                        i = 1 j = 1
                 */
                System.out.println("i = " + i + " j = " + j);
            }
        }

        System.out.println("******************带标签的嵌套for循环结合break语句的使用******************");

        //带标签的外层循环 标签名是outer 标签名只要是一个合法的标识符即可，后面跟: 例如这里的outer:
        outer:
        for (int i = 0; i < 2; i++) {
            //带标签的内层循环 标签名是inner
            inner:
            //内层循环
            for (int j = 0; j < 3; j++) {
                if (j == 2) {
                    //这里的break outer;表示结束外层循环
                    break outer;
                    //这里的break inner;语句表示结束内层循环
                    //break inner;
                }
                /*
                        程序运行结果
                        i的取值是0，1
                        j的取值0，1

                        i = 0 j = 0
                        i = 0 j = 1
                 */
                System.out.println("i = " + i + " j = " + j);
            }
        }
    }
}
