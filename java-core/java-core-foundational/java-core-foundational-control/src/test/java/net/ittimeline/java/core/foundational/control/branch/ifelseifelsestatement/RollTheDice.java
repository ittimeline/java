package net.ittimeline.java.core.foundational.control.branch.ifelseifelsestatement;

/**
 * 需求：模拟掷骰子
 * 游戏规则
 * ● 一个骰子的值在[1,6]之间
 * ● 如果三个骰子的和大于15 手气不错
 * ● 如果三个骰子的和在10-15之间，手气一般
 * ● 如果三个骰子的和在10以下，手气真差
 * 分析：
 * ① 生成3个1-6之间的随机数
 * ② 计算三个骰子的和，然后根据需求使用多分支if else if进行条件判断，满足不同的条件输出不同的结果
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 10:00
 * @since Java21
 */
public class RollTheDice {
    public static void main(String[] args) {
        //1.生成三个1-6之间的随机数
        //获取指定范围[a，b]随机数公式：(int)(Math.random() * (b - a + 1 ) ) + a
        int first = (int) (Math.random() * (6 - 1 + 1) + 1);
        int second = (int) (Math.random() * (6 - 1 + 1) + 1);
        int third = (int) (Math.random() * (6 - 1 + 1) + 1);

        //2.计算三个骰子的和，然后根据需求使用单分支if进行条件判断，满足不同的条件输出不同的结果
        int sum = first + second + third;
        System.out.println("三个骰子的和是" + sum);
        //如果三个骰子的和大于15 手气不错
        if (sum > 15) {
            System.out.println("手气不错");
        }
        //如果三个骰子的和在10-15之间，手气一般
        else if (sum >= 10 && sum <= 15) {
            System.out.println("手气一般");
        }
        //如果三个骰子的和小于10，手气真差
        else if (sum < 10) {
            System.out.println("手气真差");
        }
    }
}
