package net.ittimeline.java.foundational.control.forstatement;

/**
 * 模拟电梯上升,第四层不停
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/17 21:03
 * @since JDK11
 */
public class ForContinueElevator {

    public static void main(String[] args) {

        int count =0;

        for (int level = 1; level <= 20; level++) {

            if(level==4){
                continue;
            }
            System.out.println("第"+level+"层到了");
            count++;
        }

        System.out.println("循环执行的次数是"+count+"次");
    }
}
