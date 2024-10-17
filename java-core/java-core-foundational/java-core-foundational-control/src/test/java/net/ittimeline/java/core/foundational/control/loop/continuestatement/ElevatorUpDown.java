package net.ittimeline.java.core.foundational.control.loop.continuestatement;

/**
 * 模拟电梯升降
 * 需求：当前电梯有10层，最底层是地下室负一层，最高层是第九层，但是电梯经过第四层不停，也没有第零层
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 20:23
 * @since Java21
 */
public class ElevatorUpDown {
    public static void main(String[] args) {
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
