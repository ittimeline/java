package net.ittimeline.java.core.foundational.control.branch.ifstatement;

/**
 * 单分支结构if语句使用注意事项1
 * 如果if语句的语句块{}只有一条语句，那么if语句的语句块{}可以省略，但是不建议省略，因为会降低代码的可读性。
 * 而且如果if语句的语句块{}省略不写，那么if语句只能控制距离它最近的一条语句。
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 11:30
 * @since Java 25
 */
public class IfStatementWarning1 {
    static void main() {
        int age = 20;
        if (age >= 18)
            //①如果if语句的语句块{}只有一条执行语句，可以省略语句块{}，但是不建议，因为会降低代码的可读性
            System.out.println("年龄大于或者等于18，可以参军入伍");

        age = 16;
        if (age >= 18)
            System.out.println("年龄大于或者等于18，可以参军入伍");
        //②这里的语句不属于if语句，因此会执行
        System.out.println("年龄大于或者等于18，可以开设银行账户");

        //③因此在日常开发中不要省略{}
        if (age >= 18) {
            System.out.println("年龄大于或者等于18，可以签订合同");
            System.out.println("年龄大于或者等于18，可以炒股");
        }
    }
}
