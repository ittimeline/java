package net.ittimeline.java.foundational.control.forstatement;

/**
 * for循环结合break实现模拟20岁到65岁(不包括65岁)工作
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/17 20:54
 * @since JDK11
 */
public class ForBreakDoWork {


    public static void main(String[] args) {

        int count =0;

        for (int age = 0; age <=100; age++) {

            if(age==65){
                System.out.println("我退休了");
                break;
            }

            if(age>=20){
                System.out.println(age+"岁正在工作");
                count++;
            }

        }

        System.out.println("循环一共执行了"+count+"次");
    }
}
