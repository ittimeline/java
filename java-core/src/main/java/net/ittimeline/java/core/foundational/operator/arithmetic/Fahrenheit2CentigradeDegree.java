package net.ittimeline.java.core.foundational.operator.arithmetic;

import java.util.Scanner;

/**
 * 算术运算符案例3：温度转换
 * 需求：根据用户输入的华氏温度转换成对应的摄氏温度
 * <p>
 * 分析：华氏温度转换为摄氏温度的公式是5 / 9 *(华氏温度 - 32 )，
 * 华氏温度转换为摄氏温度的公式中5 / 9在Java的运算结果是0，0乘以任何数都是0，应该将5/9换成5.0/9
 * <p>
 * 案例：官方认可的世界最高气温纪录是在美国加利福尼亚州死亡谷（Death Valley）的炉溪牧场（原名Greenland Ranch），
 * 于1913年7月10日测得的56.7摄氏度（134华氏度）。这个记录被世界气象组织（WMO）确认为地球上表面最高的气温纪录。
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 14:31
 * @since Java 25
 */
public class Fahrenheit2CentigradeDegree {
    static void main() {
        System.out.println("请输入华氏温度");
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        //读取用户从键盘输入的华氏温度并且赋值给fahrenheit
        double fahrenheit = scanner.nextDouble();
        //根据华氏温度转换为摄氏温度的公式计算摄氏温度
        double centigradeDegree = 5.0 / 9 * (fahrenheit - 32);
        System.out.println("华氏温度" + fahrenheit + "转换为摄氏温度的结果是" + centigradeDegree);
        //格式化输出 %.1f 表示保留小数点后1位小数
        System.out.printf("华氏温度%.1f转换为摄氏温度的结果是%.1f\n", fahrenheit, centigradeDegree);

        //关闭Scanner
        scanner.close();

    }
}
