package net.ittimeline.java.core.foundational.operator.arithmetic;

/**
 * 算术运算符使用注意事项1
 * 在使用加法（+）时可能会遇到以下三种情况
 * 1. 数字相加：如果+左右两边是数字就进行加法运算,数字在进行运算是,数据类型不一样是不能进行运算的,需要转成一样的才能运算。
 * 2. 字符串相加：如果+左右两边有一边是字符串,那么就进行字符串拼接运算并产生一个新的字符串,如果有多个+操作时,会从左到右逐个执行
 * 3. 字符相加：如果+左右两边都是是字符或者是字符+数字时,那么就按照字符的ASCII进行加法运算
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/16 9:44
 * @since Java21
 */
public class ArithmeticOperatorWarning1 {
    public static void main(String[] args) {
        //加法操作的三种情况
        System.out.println("1.数字相加");
        int left = 10;
        double right = 20.3;
        //int和double进行运算 int会自动提升为double 结果类型是double类型
        double result = left + right;
        // %d会被整数类型变量left的值替换
        // %.1f会被浮点类型变量right的值替换
        // %.1f会被浮点类型变量result的值替换
        System.out.printf("%d + %.1f  = %.1f\n", left, right, result);

        System.out.println("2.字符串拼接");
        //第一个加法表示数字相加,因为加法左右两边都是数字
        //第二个加法表示字符串拼接,因为加法右边有字符串
        System.out.println(1 + 99 + "年树人");
        String name = "tony";
        System.out.println("姓名是" + name);
        int age = 30;
        //age会被30替换
        System.out.println("年龄是" + age + "岁");
        double height = 180.00;
        //height会被180.00替换
        System.out.println("身高是" + height + "厘米");

        System.out.println("3.字符相加");
        // a的ASCII值是97
        System.out.println("1 + 'a' = " + (1 + 'a'));
        //0的ASCII值是48
        System.out.println("1 + '0' = " + (1 + '0'));
        //A的ASCII值是65
        System.out.println("1 + 'A' = " + (1 + 'A'));
        //a的ASCII值是97
        //b的ASCII值是98
        System.out.println("'a' + 'b ' = " + ('a' + 'b'));
    }
}
