package net.ittimeline.java.jdk.feature.java5.annotation;

import net.ittimeline.java.api.util.DateTimeUtils;

/**
 * 自定义注解-不带属性  的使用
 * @author tony 18601767221@163.com
 * @version 2021/6/12 20:32:18
 * @description
 * @since JDK11
 */
//在类上使用
@MyTest("在类上使用")
public class MyTestAnnotationUsageTest{

    //在构造方法上使用
    @MyTest(value = "在构造方法上使用")
    MyTestAnnotationUsageTest(){}

    //在方法上使用
    @MyTest(value = "在方法上使用")
    public void showTime(@MyTest(value = "在方法的形参使用") String str){

        //在局部变量上使用
        @MyTest(value = "在局部变量上使用")
        String currentTime=DateTimeUtils.getCurrentTime();

        System.out.println(currentTime);
    }
}
