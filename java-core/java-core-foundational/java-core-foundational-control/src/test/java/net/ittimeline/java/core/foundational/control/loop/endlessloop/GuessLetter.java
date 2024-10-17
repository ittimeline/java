package net.ittimeline.java.core.foundational.control.loop.endlessloop;

import java.util.Scanner;

/**
 * 猜字母游戏
 * 需求：让用户猜随机生成的字母，如果猜中了就结束游戏，如果没有猜中就继续（重复）猜，但是继续猜的前提是猜的次数小于等于5次(5次机会)，字母分大写字母和小写字母，由于还没有学数组，我们目前将大写字母和小写字母分开猜。
 * 分析
 * ● 随机生成大写字母和小写字母
 * ● 让用户选择猜大写字母还是小写字母
 * ● 将用户猜的字母和随机生成的字母进行比较
 * a.  如果用户猜的字母比电脑随机生成的字母更大，那么提示用户 你猜的字母太大了
 * b.  如果用户猜的字母比电脑随机生成的字母更小，那么提示用户 你猜的字母太小了
 * c.  如果用户猜的字母和电脑随机生成的字母相同，那么提示用户 恭喜你猜对了，然后结束游戏
 * ● 控制用户猜字母的次数，如果等于5次就结束游戏
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 21:22
 * @since Java21
 */
public class GuessLetter {
    public static void main(String[] args) {
        /*
            a的ASCII字符集编号是97
            z的ASCII字符集编号是122

            A的ASCII字符集编号是65
            Z的ASCII字符集编号是90

            随机数生成公式： (int)(Math.random()*(b-a+1))+a
         */
        //System.out.println("a的ASCII字符集编号是"+(int) 'a');
        //System.out.println("z的ASCII字符集编号是"+(int) 'z');
        //System.out.println("A的ASCII字符集编号是"+(int) 'A');
        //System.out.println("Z的ASCII字符集编号是"+(int) 'Z');

        //随机生成26个大写字母
        char randomUpperCaseLetter = (char) ((Math.random() * (90 - 65 + 1)) + 65);
        System.out.println("随机生成的大写字母是" + randomUpperCaseLetter);
        //随机生成26个小写字母
        char randomLowerCaseLetter = (char) ((Math.random() * (122 - 97 + 1)) + 97);
        System.out.println("随机生成的小写字母是" + randomLowerCaseLetter);

        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择猜大写字母还是猜小写字母");
        System.out.println("1.猜大写字母");
        System.out.println("2.猜小写字母");
        int selection = scanner.nextInt();
        //一共有五次机会
        int count = 5;
        outer:
        while (true) {
            if (count > 0) {
                switch (selection) {
                    case 1:
                        System.out.println("请输入你猜的大写字母");
                        char guessUpperCaseLetter = scanner.next().charAt(0);
                        count--;
                        if (guessUpperCaseLetter > randomUpperCaseLetter) {
                            System.out.print("你猜的大写字母太大了！！！");
                        } else if (guessUpperCaseLetter < randomUpperCaseLetter) {
                            System.out.print("你猜的大写字母太小了！！！");
                        } else {
                            System.out.print("恭喜你猜中了！！！");
                            //结束while循环
                            break outer;
                        }
                        if (count > 0) {
                            System.out.println("你还有" + count + "次机会");
                        }
                        //结束switch case语句
                        break;
                    case 2:
                        System.out.println("请输入你猜的小写字母");
                        char guessLowerCaseLetter = scanner.next().charAt(0);
                        count--;
                        if (guessLowerCaseLetter > randomLowerCaseLetter) {
                            System.out.print("你猜的小写字母太大了！！！");
                        } else if (guessLowerCaseLetter < randomLowerCaseLetter) {
                            System.out.print("你猜的小写字母太小了！！！");
                        } else {
                            System.out.print("恭喜你猜中了！！！");
                            //结束while循环
                            break outer;
                        }
                        if (count > 0) {
                            System.out.println("你还有" + count + "次机会");
                        }
                        //结束switch case语句
                        break;
                }
            } else {
                System.out.println("5次机会都用完了，游戏结束");
                //结束循环
                break;
            }
        }
        //关闭Scanner
        scanner.close();
    }
}
