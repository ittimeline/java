package net.ittimeline.java.core.foundational.control.branch.ifelsestatement;

import java.util.Scanner;

/**
 * 吃网红餐厅还是沙县小吃
 * 需求：键盘输入身上的钱（用整数表示），如果大于等于20000，就吃高端大气上档次的米其林餐厅，否则就吃经济实惠的沙县小吃
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 9:46
 * @since Java21
 */
public class EatSomething {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in 标准输入 也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入身上的钱");
        //键盘录入一个整数表示身上的钱
        int money = scanner.nextInt();
        //对身上的钱进行判断（二选一）
        if (money >= 20000) {
            System.out.println("吃高端大气上档次的米其林餐厅");
        } else {
            System.out.println("吃经济实惠的沙县小吃");
        }
        //关闭Scanner
        scanner.close();
    }
}
