package net.ittimeline.java.core.foundational.control.branch.ifelseifelsestatement;

import java.util.Random;
import java.util.Scanner;

/**
 * 多分支结构if else if else语句案例6-彩票
 * 需求：假设你想开发一个玩彩票的游戏，程序随机地产生一个两位数的彩票，提示用户输入一个两位数，然后按照下面的规则判定用户是否能赢。
 * 1. 如果用户输入的数匹配彩票的实际顺序，奖金500万。
 * 2. 如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金5万。
 * 3. 如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金5000。
 * 4. 如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500。
 * 5. 如果用户输入的数字没有匹配任何一个数字，则彩票作废。
 * <p>
 * 分析：
 * 1. 规则1：用户输入的数与彩票号码完全相同（顺序一致），
 * 例子：彩票号码为12，用户输入12，则符合规则1。
 * 2. 规则2：用户输入的数字与彩票数字全部相同，但顺序相反，条件：用户个位等于彩票十位 且 用户十位等于彩票个位，
 * 例子：彩票号码为12，用户输入21，则符合规则2（因为个位1等于彩票十位1，十位2等于彩票个位2）。
 * 3. 规则3：至少有一个数字在正确的位置上（顺序匹配） ，条件：用户个位等于彩票个位 或者 用户十位等于彩票十位，
 * 例子：彩票号码为12，用户输入13，则符合规则3（十位1相同，个位3不匹配，且没有其他数字出现）。
 * 4. 规则4：至少有一个数字出现在彩票中，但位置不对（非顺序匹配）， 条件：用户个位等于彩票十位 或者 用户十位等于彩票个位，
 * 例子：彩票号码为12，用户输入31，则符合规则4（个位1出现在彩票十位，但位置不对，十位3不在彩票中）。
 * 5. 规则5：没有一个数字匹配（既无顺序匹配也无数字匹配），
 * 例子：彩票号码为12，用户输入34，则符合规则5（数字1和2均未出现）。
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 13:06
 * @since Java 25
 */
public class Lottery {
    static void main() {
        Random random = new Random();
        // 生成 [10, 99] 的随机数
        int luckyNumber = random.nextInt(90) + 10;
        System.out.println("随机数是" + luckyNumber);

        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个两位整数[10,99]：");
        int userNumber = scanner.nextInt();

        if (userNumber < 10 || userNumber > 99) {
            System.out.println("输入无效，请输入一个两位数（10~99）。");
            //关闭Scanner
            scanner.close();
            return;
        }


        // 分离个位和十位
        int userOnes = userNumber % 10;
        int userTens = userNumber / 10 % 10;
        int luckyOnes = luckyNumber % 10;
        int luckyTens = luckyNumber / 10 % 10;

        // 判断中奖等级：按照规则优先级从高到低依次检查
        // 规则1：用户输入的数与彩票号码完全相同（顺序一致）
        if (userNumber == luckyNumber) {
            System.out.println("恭喜，奖金500万！");
        }
        // 规则2：用户输入的数字与彩票数字全部相同，但顺序相反（例如12 vs 21）
        // 条件：用户个位等于彩票十位 且 用户十位等于彩票个位
        else if (userOnes == luckyTens && userTens == luckyOnes) {
            System.out.println("恭喜，奖金5万！");
        }
        // 规则3：至少有一个数字在正确的位置上（顺序匹配）
        // 条件：用户个位等于彩票个位 或者 用户十位等于彩票十位
        else if (userOnes == luckyOnes || userTens == luckyTens) {
            System.out.println("恭喜，奖金5000！");
        }
        // 规则4：至少有一个数字出现在彩票中，但位置不对（非顺序匹配）
        // 条件：用户个位等于彩票十位 或者 用户十位等于彩票个位
        else if (userOnes == luckyTens || userTens == luckyOnes) {
            System.out.println("恭喜，奖金500！");
        }
        // 规则5：没有一个数字匹配（既无顺序匹配也无数字匹配）
        else {
            System.out.println("谢谢惠顾！");
        }

        System.out.printf("您输入的号码是：%d，本次中奖号码是：%d%n", userNumber, luckyNumber);
        //关闭Scanner
        scanner.close();
    }
}
