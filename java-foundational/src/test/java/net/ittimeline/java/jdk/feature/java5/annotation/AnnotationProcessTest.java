package net.ittimeline.java.jdk.feature.java5.annotation;

import org.testng.annotations.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 解析注解
 * @author tony 18601767221@163.com
 * @version 2021/6/12 20:32:18
 * @description
 * @since JDK11
 */

public class AnnotationProcessTest {


    /**
     * 获取类上的注解以及注解的属性信息
     */
    @Test
    public void processTableAnnotation(){
        Class<Employee> employeeClass = Employee.class;
        //获取Employee的注解
        Table tableAnnotation = employeeClass.getAnnotation(Table.class);
        System.out.println("注解的类型信息"+tableAnnotation);
        //获取注解的属性值
        System.out.println(tableAnnotation.id());
        System.out.println(tableAnnotation.name());
        System.out.println(tableAnnotation.prefix());
        System.out.println(Arrays.toString(tableAnnotation.databases()));


    }


    /**
     * 获取类中成员变量的注解信息
     */
    @Test
    public void processColumnAnnotation(){

        Class<Employee> employeeClass = Employee.class;
        try {
            Field nameField = employeeClass.getDeclaredField("name");
            Column columnAnnotation = nameField.getAnnotation(Column.class);
            System.out.println("注解的类型信息"+columnAnnotation);
            //获取注解的属性值
            System.out.println(columnAnnotation.name());

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }


    /**
     * 注解的解析
     *  获取方法上的注解并且执行方法
     */
    @Test
    public void processTestAnnotation(){
        Class<OrderHandler> orderHandlerClass = OrderHandler.class;

        try {
            OrderHandler orderHandler = orderHandlerClass.newInstance();

            Method commitOrderMethod = orderHandlerClass.getDeclaredMethod("commitOrder");
            commitOrderMethod.setAccessible(true);
            //如果commitOrderMethod方法包含自定义的Test注册
            if (commitOrderMethod.isAnnotationPresent(net.ittimeline.java.jdk.feature.java5.annotation.Test.class)){
                //执行commitOrder方法
                commitOrderMethod.invoke(orderHandler);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

















}
