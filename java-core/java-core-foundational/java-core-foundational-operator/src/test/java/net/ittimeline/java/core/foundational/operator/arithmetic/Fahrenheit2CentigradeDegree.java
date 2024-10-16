package net.ittimeline.java.core.foundational.operator.arithmetic;

import java.util.Scanner;

/**
 * 温度转换
 * 需求：根据用户输入的华氏温度转换成对应的摄氏温度,华氏温度转换为摄氏温度的公式是 5 / 9 *(华氏温度 - 32 )
 * 分析：华氏温度转换为摄氏温度的公式中5 / 9在Java的运算结果是0,0乘以任何数都是0,应该将5 / 9 换成 5.0 / 9
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 10:06
 * @since Java21
 */
public class Fahrenheit2CentigradeDegree {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in表示标准输入,也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入加利福尼亚州的死亡谷在1913年7月10日记录到的高温");
        //加利福尼亚州的死亡谷在1913年7月10日记录到了53.9°C（129°F）的高温,这是官方认可的世界最高气温记录
        double fahrenheit = scanner.nextDouble();
        double centigradeDegree = 5.0 / 9 * (fahrenheit - 32);
        System.out.println("华氏温度" + fahrenheit + "转换为摄氏温度的结果是" + centigradeDegree);
        //格式化输出 %.1f 表示保留小数点后1位数
        System.out.printf("华氏温度%.1f转换为摄氏温度的结果是%.1f\n", fahrenheit, centigradeDegree);

        //关闭Scanner
        scanner.close();
    }
}
