package net.ittimeline.java.core.foundational.control.loop.nestedloop.label;

/**
 * continue跳到外层下一轮
 * continue语句只能忽略当前所在循环的本次循环，然后继续下一次循环。也就是如果continue语句在内层循环使用的时候只能忽略内层循环的本次循环，然后继续内层循环的下一次循环。
 * 如果想要忽略外层循环的本次循环，继续外层循环的下一次循环，可以使用带标签的嵌套循环，然后使用continue加上外层循环的标签名即可。
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:51
 * @since Java 25
 */
public class ContinueOuterLoop {

    static void main() {
        System.out.println("********************************不带标签的嵌套for循环结合continue语句的使用********************************");
        //外层循环
        for (int i = 0; i < 2; i++) {
            //内层循环
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    //continue只能忽略内层循环的本次循环，然后进入内层循环的下一次循环
                    continue;
                }
                    /*
                        i 的取值是0，1
                        j 的取值是0，2
                        程序运行结果
                        i = 0  j = 0
                        i = 0  j = 2

                        i = 1  j = 0
                        i = 1  j = 2
                     */
                System.out.println("i = " + i + " j = " + j);
            }
        }

        System.out.println("********************************带标签的嵌套for循环结合continue语句的使用********************************");

        //带标签的外层循环
        outer:
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    //continue outer;能忽略外层循环的本次循环，然后进入外层循环的下一次循环
                    continue outer;
                    // continue inner; 能忽略内层循环的本次循环，然后进入内层循环的下一次循环

                }
                    /*
                        i 的取值是0，1
                        j 的取值是0
                        程序运行结果
                        i = 0  j = 0
                        i = 1  j = 0
                     */
                System.out.println("i = " + i + " j = " + j);
            }
        }


        System.out.println("========== 带标签的 continue inner（仅跳过内层本次） ==========");
        for (int i = 0; i < 2; i++) {
            //带标签的内层循环
            inner:
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    continue inner; // 只跳过内层本次，效果同无标签 continue
                }
                System.out.println("i = " + i + " j = " + j);
            }
        }
    }

}
