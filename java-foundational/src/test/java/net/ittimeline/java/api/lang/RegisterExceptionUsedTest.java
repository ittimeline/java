package net.ittimeline.java.api.lang;

import net.ittimeline.java.api.lang.exception.RegisterException;

import java.util.Scanner;

/**
 * 注册异常的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/14 17:29
 * @since JDK11
 */
public class RegisterExceptionUsedTest {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("请输入你的用户名");
        String userName=input.nextLine();

        if(userName.equals("tony")){
            try {
                throw new RegisterException("用户名已经存在");
            } catch (RegisterException e) {
                System.out.println("请更换用户名后再试");
            } finally {
                input.close();
            }
        }else{
            System.out.println("用户注册成功");
        }

    }
}
