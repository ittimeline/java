package net.ittimeline.java.api.lang.reflect;

import net.ittimeline.java.foundational.oop.Cellphone;
import org.testng.annotations.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/6/11 17:29
 * @since JDK11
 */
public class ReflectTest {


    /**
     * Class对象获取的三种方式
     */
    @Test
    public void testGetClass(){

        Class<Cellphone> cellphoneClass1 = Cellphone.class;
        Cellphone cellphone=new Cellphone();
        Class<? extends Cellphone> cellphoneClass2 = cellphone.getClass();
        try {
            Class<?> cellphoneClass3 = Class.forName("net.ittimeline.java.foundational.oop.Cellphone");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    /**
     * Class的常用方法
     */
    @Test
    public void testClassNewInstance(){

        Class<Cellphone> cellphoneClass = Cellphone.class;

        String name = cellphoneClass.getName();
        System.out.println("Cellphone的全路径名"+name);

        System.out.println("Cellphone的类名是"+cellphoneClass.getSimpleName());

        Class<net.ittimeline.java.api.lang.reflect.Cellphone> cellphoneClassLang = net.ittimeline.java.api.lang.reflect.Cellphone.class;

        net.ittimeline.java.api.lang.reflect.Cellphone cellphoneObject = null;
        try {
            //使用反射的方式创建一个CellPhone
            cellphoneObject = cellphoneClassLang.newInstance();
            System.out.println(cellphoneObject);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }




    }


    /**
     * 使用反射操作构造方法-获取构造方法
     */
    @Test
    public void testReflectGetConstructor(){
        Class<Cellphone> cellphoneClass = Cellphone.class;
        try {
            Constructor<Cellphone> constructor = cellphoneClass.getDeclaredConstructor();
            System.out.println("获取Cellphone的无参构造方法的结果是"+constructor);


            Constructor<Cellphone>modelConstructor = cellphoneClass.getDeclaredConstructor(String.class);
            System.out.println("获取Cellphone的带型号参数构造方法的结果是"+modelConstructor);

            Constructor<Cellphone> modelPriceConstructor = cellphoneClass.getDeclaredConstructor(String.class, Integer.class);
            System.out.println("获取Cellphone的带型号和价格参数构造方法的结果是"+modelPriceConstructor);


            Class<net.ittimeline.java.api.lang.reflect.Cellphone> cellphoneClassLang = net.ittimeline.java.api.lang.reflect.Cellphone.class;
            Constructor<net.ittimeline.java.api.lang.reflect.Cellphone> privateConstructor = cellphoneClassLang.getDeclaredConstructor();
            System.out.println("获取Cellphone的私有构造方法的结果是"+privateConstructor);

            //获取所有Cellphone的构造方法，包括所有的访问权限的
            Constructor<?>[] allConstructor = cellphoneClassLang.getDeclaredConstructors();
            for (Constructor<?> currentConstructor : allConstructor) {
                System.out.println("获取Cellphone的所有的构造方法"+currentConstructor);
            }



        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


    }

    /**
     * 使用反射的方式创建对象
     */
    @Test
    public void testReflectConstructorNewInstance(){
        Class<net.ittimeline.java.api.lang.reflect.Cellphone> cellphoneClass = net.ittimeline.java.api.lang.reflect.Cellphone.class;
        try {
            Constructor<net.ittimeline.java.api.lang.reflect.Cellphone> privateConstructor = cellphoneClass.getDeclaredConstructor();
            //绕开权限检查
            privateConstructor.setAccessible(true);

            //使用反射创建Cellphone
            net.ittimeline.java.api.lang.reflect.Cellphone cellphone = privateConstructor.newInstance();
            System.out.println(cellphone);


            Constructor<net.ittimeline.java.api.lang.reflect.Cellphone> stringArgsConstructor = cellphoneClass.getDeclaredConstructor(String.class);
            //使用反射的方式创建Cellphone对象，调用带字符串参数的构造方法
            net.ittimeline.java.api.lang.reflect.Cellphone stringArgsCellphone = stringArgsConstructor.newInstance("iphone12");

            System.out.println("调用带字符串参数的构造方法之后 Cellphone对象的model属性值是"+stringArgsCellphone.getModel());



        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    /**
     * 使用反射获取类的方法
     */
    @Test
    public void testReflectMethodGetMethod(){

        Class<Cellphone> cellphoneClass = Cellphone.class;
        try {
            Method callMethod = cellphoneClass.getDeclaredMethod("call", long.class);

            System.out.println("Cellphone对象的call方法的信息是"+callMethod);


            Method[] allMethods = cellphoneClass.getDeclaredMethods();
            System.out.println("Cellphone的所有方法是");
            for (Method currentMethod : allMethods) {
                System.out.println(currentMethod);
            }



        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    /**
     * 反射调用方法
     */
    @Test
    public void testReflectMethodInvoke(){


        Class<Cellphone> cellphoneClass = Cellphone.class;

        try {
            //使用反射创建Cellphone对象
            Cellphone cellphone = cellphoneClass.newInstance();
            Method callMethod = cellphoneClass.getDeclaredMethod("call", long.class);
            callMethod.invoke(cellphone,18601767221L);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 反射获取类的成员变量
     */
    @Test
    public void testReflectFieldGet(){
        Class<Cellphone> cellphoneClass = Cellphone.class;
        try {
            Field modelField = cellphoneClass.getDeclaredField("model");
            System.out.println("modelField表示的成员变量是"+modelField.getName());

            Field weightField = cellphoneClass.getDeclaredField("weight");
            System.out.println("weightField表示的成员变量是"+weightField.getName());

            System.out.println("Cellphone的所有成员变量");
            Field[] allFields = cellphoneClass.getDeclaredFields();
            for (Field field : allFields) {
                System.out.println(field);
            }



        } catch (Exception  e) {
            e.printStackTrace();
        }


    }

    /**
     * 使用反射获取成员变量的值
     * 使用反射设置成员变量的值
     */
    @Test
    public void testReflectFiledGetSet(){

        Class<Cellphone> cellphoneClass = Cellphone.class;
        try {
            Cellphone cellphone = cellphoneClass.newInstance();
            Field modelField = cellphoneClass.getDeclaredField("model");
            //取消权限检查，暴力反射
            modelField.setAccessible(true);
            modelField.set(cellphone,"iphone12");
            System.out.println("使用反射获取cellphone的型号是"+modelField.get(cellphone));
            Field weightField = cellphoneClass.getDeclaredField("weight");
            weightField.setAccessible(true);
            weightField.set(cellphone,200);
            System.out.println("使用反射获取cellphone的重量是"+weightField.get(cellphone));

        } catch (Exception  e) {
            e.printStackTrace();
        }

    }


































}



