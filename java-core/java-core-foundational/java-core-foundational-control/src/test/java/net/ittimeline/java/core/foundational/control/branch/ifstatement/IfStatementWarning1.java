package net.ittimeline.java.core.foundational.control.branch.ifstatement;

/**
 * 单分支结构if语句使用注意事项1
 * 如果if语句的语句块{}中只有一条语句，那么if语句的语句块{}可以省略，但是不建议省略，因为会降低代码的可读性。
 * 而且如果if语句的语句块{}省略不写，那么if语句只能控制距离它最近的一条语句
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 7:58
 * @since Java21
 */
public class IfStatementWarning1 {
    public static void main(String[] args) {
        int age = 20;
        if (age >= 18)
            //①如果if语句的语句块{}只有一条执行语句，可以省略语句块{}，但是不建议，因为会降低代码的可读性
            System.out.println("年龄大于或者等于18，可以去网吧上网");

        age = 16;
        if (age >= 18)
            System.out.println("年龄大于或者等于18，可以去网吧上网");
        //②这里的语句不属于if语句，因此会执行
        System.out.println("年龄大于或者等于18，可以办理信用卡");

        //③因此在日常开发中不要省略{}
        if (age >= 18) {
            System.out.println("年龄大于或者等于18，可以上网");
            System.out.println("年龄大于或者等于18，可以办理信用卡");
        }
    }
}
