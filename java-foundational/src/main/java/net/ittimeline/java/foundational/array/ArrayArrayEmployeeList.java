package net.ittimeline.java.foundational.array;

/**
 * 二维数组的应用
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/25 7:25
 * @since JDK11
 */
public class ArrayArrayEmployeeList {

    public static void main(String[] args) {
        System.out.printf("%10s%10s%10s%10s%10s\n","员工编号","员工姓名","员工年龄","员工性别","员工薪水");

        String[][]employeeList=new String[][]{{"00001","tony","30","男","100000"},{"00002","jack","27","男","80000"},{"00003","tiffany","24","女","30000"}};

        for (int i = 0; i < employeeList.length ; i++) {
            for (int j = 0; j <employeeList[i].length ; j++) {
                System.out.printf("%12s",employeeList[i][j]);
            }
            System.out.println();
        }
    }
}
