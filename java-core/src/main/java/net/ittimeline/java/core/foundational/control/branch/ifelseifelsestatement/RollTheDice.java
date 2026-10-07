package net.ittimeline.java.core.foundational.control.branch.ifelseifelsestatement;

import java.util.Random;

/**
 * 多分支结构 if else if else语句案例1-掷骰子
 * 需求：模拟掷骰子
 * 游戏规则：
 * ● 一个骰子的值在[1,6]之间
 * ● 如果三个骰子的和大于15显示手气不错
 * ● 如果三个骰子的和在10-15之间，显示手气一般
 * ● 如果三个骰子的和在10以下，显示手气真差
 * <p>
 * 分析：
 * ① 使用Random类生成3个1~6之间的随机数
 * ② 计算三个骰子的和
 * ③ 根据需求使用多分支结构进行条件判断，满足不同的条件输出不同的结果
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 13:03
 * @since Java 25
 */
public class RollTheDice {
    static void main() {
        //1.使用Random类生成三个1-6之间的随机数
        //创建Random对象
        Random random = new Random();
        //指定范围[a,b]随机数公式：random.nextInt(b-a+1)+a
        int first = random.nextInt(6 - 1 + 1) + 1;
        int second = random.nextInt(6 - 1 + 1) + 1;
        int third = random.nextInt(6 - 1 + 1) + 1;

        //2.计算三个骰子的和
        int sum = first + second + third;
        System.out.println("三个骰子的和是" + sum);
        //3.根据需求使用多分支结构进行条件判断，满足不同的条件输出不同的结果
        System.out.println("********************************实现方式1********************************");
        if (sum > 15) {
            System.out.println("手气不错");
        } else if (sum >= 10) {
            System.out.println("手气一般");
        } else {
            System.out.println("手气真差");
        }
        System.out.println("********************************实现方式2********************************");
        if (sum > 15) {
            System.out.println("手气不错");
        } else if (sum >= 10 && sum <= 15) {
            System.out.println("手气一般");
        } else {
            System.out.println("手气真差");
        }
    }
}
