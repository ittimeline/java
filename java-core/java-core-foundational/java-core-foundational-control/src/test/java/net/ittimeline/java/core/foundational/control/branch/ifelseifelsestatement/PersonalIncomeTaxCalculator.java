package net.ittimeline.java.core.foundational.control.branch.ifelseifelsestatement;

import java.util.Scanner;

/**
 * 个税计算器
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 10:36
 * @since Java21
 */
public class PersonalIncomeTaxCalculator {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in表示标准输入,也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入你期望的税前月薪");
        int salary = scanner.nextInt();
        //根据期望的税前工资所在的区间对应税率计算个人所得税
        //计算公式：全月应纳税所得额 * 税率 - 速算扣税数
        double taxAmount = 0.0;

        //期望的税前工资不超过5000不需要纳税
        if (salary <= 5000) {
            taxAmount = 0.0;
        }
        //期望的税前工资超过5000但是不超过8000,全月应纳税额所得额不超过3000元 税率3% 速算扣税数0元
        else if (salary <= 8000) {
            taxAmount = (salary - 5000) * 0.03 - 0;
        }
        //期望的税前工资超过8000但是不超过17000,全月应纳税额所得额超过3000元至12000元 税率10% 速算扣税数210元
        else if (salary <= 17000) {
            taxAmount = (salary - 8000) * 0.1 - 210;
        }
        //期望的税前工资超过17000但是不超过30000,全月应纳税额所得额超过12000元至25000元 税率20% 速算扣税数1410元
        else if (salary <= 30000) {
            taxAmount = (salary - 5000) * 0.2 - 1410;
        }
        //期望的税前工资超过30000但是不超过40000,全月应纳税额所得额超过25000元至35000元(40000元) 税率25%  速算扣税数2660元
        else if (salary <= 40000) {
            taxAmount = (salary - 5000) * 0.25 - 2660;
        }
        //期望的税前工资超过40000但是不超过60000,全月应纳税额所得额超过35000元至55000元(60000元) 税率30%  速算扣税数4410元
        else if (salary <= 60000) {
            taxAmount = (salary - 5000) * 0.3 - 4410;
        }
        //期望的税前工资超过60000但是不超过85000,全月应纳税额所得额超过55000元至80000元(85000元) 税率35% 速算扣税数7160元
        else if (salary <= 85000) {
            taxAmount = (salary - 5000) * 0.35 - 7160;
        }
        //期望的税前工资超过85000,全月应纳税额所得额超过80000元(85000元) 税率45% 速算扣税数15160元
        else if (salary > 85000) {
            taxAmount = (salary - 5000) * 0.45 - 15160;
        }
        System.out.printf("期望的税前薪水是%d对应的个人所得税是%.2f\n", salary, taxAmount);

        //关闭扫描器
        scanner.close();
    }
}
