package net.ittimeline.java.core.foundational.control.branch.switchstatement;

/**
 * 分支结构switch语句使用注意事项3
 * switch case 语句使用表达式和case语句后面的字面量值做相等性判断，不能进行范围的判断，
 * 开发项目时使用switch case语句时，通常case匹配的情况有限。
 * 例如判断一个数值是正数还是负数时使用switch case语句就不太合适
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 11:42
 * @since Java21
 */
public class SwitchStatementWarning3 {
    public static void main(String[] args) {
        int number = 10;
        //case后面只能是常量值，使用表达式和这些常量做相等性判断，不能进行范围的判断
        switch (number) {
            //不兼容的类型: boolean无法转换为int
            /*
            case number > 0:
                System.out.println("正数");
                break;
            //不兼容的类型: boolean无法转换为int
            case number < 0:
                System.out.println("负数");
                break;
             */
            default:
                System.out.println("0");
                break;
        }
    }
}
