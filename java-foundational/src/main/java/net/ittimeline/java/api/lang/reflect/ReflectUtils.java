package net.ittimeline.java.api.lang.reflect;

import net.ittimeline.java.jdk.feature.java5.annotation.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射工具类
 * @author tony 18601767221@163.com
 * @version 2021/6/12 20:32:18
 * @description
 * @since JDK11
 */

public final class ReflectUtils {

    /**
     * 模拟TestNG的Test注解
     * 1. 方法的访问权限修饰符必须是public
     * 2. 方法没有返回值
     * 3. 方法没有参数
     * @param clazz
     * @param <T>
     */
    public static <T> void mockTest(Class<T> clazz){
        try {
            T type = clazz.newInstance();
            //获取类的所有的公共的
            Method[] methods = clazz.getMethods();
            if (null!=methods&&methods.length>0){
                for (Method method : methods) {
                    Class<?> returnType = method.getReturnType();
                    //方法没有返回值并且没有参数
                    if(returnType.getName().equals("void")&&method.getParameterCount()==0){
                        Test testAnnotation = method.getAnnotation(Test.class);
                        if (null!=testAnnotation){
                            method.invoke(type);
                        }
                    }

                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
