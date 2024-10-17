package net.ittimeline.java.core.foundational.control.branch.switchstatement;

import java.util.Scanner;

/**
 * 根据年份查找生肖
 * 需求：提示用户输入年份，输出该年份对应的的生肖
 * 分析：生肖是按照中国农历的12年一个周期循环的，每年对应一种动物。
 * 要查找某一年的生肖，按照如下步骤进行
 * 1. 将该年份除以12，然后取余数。
 * 2. 根据余数确定生肖，余数与生肖的对应关系如下：
 * 0: 猴
 * 1: 鸡
 * 2: 狗
 * 3: 猪
 * 4: 鼠
 * 5: 牛
 * 6: 虎
 * 7: 兔
 * 8: 龙
 * 9: 蛇
 * 10: 马
 * 11: 羊
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 15:46
 * @since Java21
 */
public class GetZodiacByYear {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in 标准输入 也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入出生年份，例如1988");
        int year = scanner.nextInt();
        switch (year % 12) {
            case 0:
                System.out.printf("%d年生肖是猴", year);
                break;
            case 1:
                System.out.printf("%d年生肖是鸡", year);
                break;
            case 2:
                System.out.printf("%d年生肖是狗", year);
                break;
            case 3:
                System.out.printf("%d年生肖是猪", year);
                break;
            case 4:
                System.out.printf("%d年生肖是鼠", year);
                break;
            case 5:
                System.out.printf("%d年生肖是牛", year);
                break;
            case 6:
                System.out.printf("%d年生肖是虎", year);
                break;
            case 7:
                System.out.printf("%d年生肖是兔", year);
                break;
            case 8:
                System.out.printf("%d年生肖是龙", year);
                break;
            case 9:
                System.out.printf("%d年生肖是蛇", year);
                break;
            case 10:
                System.out.printf("%d年生肖是马", year);
                break;
            case 11:
                System.out.printf("%d年生肖是羊", year);
                break;
            default:
                System.out.println("你的输入有误");

        }
        //关闭Scanner
        scanner.close();
    }
}
