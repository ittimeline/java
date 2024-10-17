package net.ittimeline.java.core.foundational.control.branch.switchstatement;

import java.util.Scanner;

/**
 * 分支结构switch语句使用注意事项2
 * case语句后面跟的都是字面量值，而且不能重复，否则会出现编译错误。
 * 需求：根据输入不同的性别生成不同的招呼用语
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 11:37
 * @since Java21
 */
public class SwitchStatementWarning2 {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in 标准输入 也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入性别");
        String gender = scanner.next();
        String greeting = "你好";
        switch (gender) {
            case "男":
                greeting += "先生";
                break;
            // 字符串男对应的Unicode编码值就是\u7537 因此造成了case语句的字面值重复
            /*
            case "\u7537":
                greeting += "先生";
                break;
             */
            case "女":
                greeting += "女士";
                break;
            default:
                greeting += "顾客";
                break;
        }
        System.out.println(greeting);
        //关闭Scanner
        scanner.close();
    }
}
