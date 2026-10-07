package net.ittimeline.java.core.foundational.control.loop.continuestatement;

/**
 * continue语句案例1-模拟电梯升降
 * 需求：当前电梯有十层，最底层是地下室负一层，最高层是第九层，但是电梯经过第四层不停，也没有第零层
 * 分析：哪层不停（第0层、第4层）就忽略本次循环，继续下一次循环
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:30
 * @since Java 25
 */
public class ElevatorSimulation {
    static void main() {
        //模拟电梯上升
        System.out.println("******************模拟电梯上升******************");
        for (int i = -1; i < 10; i++) {
            if (i == 4 || i == 0) {
                continue;
            }
            System.out.printf("当前电梯正在上升，目前是%d层\n", i);
        }

        //模拟电梯下降
        System.out.println("******************模拟电梯下降******************");
        for (int i = 9; i >= -1; i--) {
            if (i == 4 || i == 0) {
                continue;
            }
            System.out.printf("当前电梯正在下降，目前是%d层\n", i);
        }
    }
}
