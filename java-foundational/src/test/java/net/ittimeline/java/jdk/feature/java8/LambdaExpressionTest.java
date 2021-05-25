package net.ittimeline.java.jdk.feature.java8;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * lambda表达式的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/23 10:27
 * @since JDK11
 */
public class LambdaExpressionTest {

    /**
     * 面向对象编程和函数式编程两种编程风格的对比
     */
    @Test
    public void testLambdaExpression(){
        //面向对象的方式创建和启动线程
        new Thread(new CustomRunnable()).start();

        //函数式编程的方式来创建和启动线程
        new Thread(()->{
            System.out.println("2.函数式编程的方式来创建和启动线程");
        }).start();

    }


    /**
     * lambda表达式的完整格式的使用
     */
    @Test
    public void testCollectionsSort(){

        List<Integer> list =new ArrayList<>();
        list.add(100);
        list.add(1949);
        list.add(2021);
        list.add(56);
        list.add(31);
        list.add(1921);
        //使用匿名内部类降序排序
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer value1, Integer value2) {
                return value2-value1;
            }
        });
        System.out.println("使用匿名内部类降序排序list集合的结果是"+list);

        //使用lambda表达式降序排序
        Collections.sort(list,( value1, value2)-> value2-value1);
        System.out.println("使用lambda表达式降序排序list集合的结果是"+list);
    }


    /**
     * lambda表达式的应用场景
     */
    @Test
    public void testLambdaExpressionUsage(){

        // 变量
        //将lambda表达式赋值给一个变量
        CustomFunctionalInterface customFunctionalInterface=(int left,int right)->{return left+right;};
        int result = customFunctionalInterface.add(100, 200);
        System.out.println("result = "+result);


        //lambda表达式可以作为方法的返回值的使用
        CustomFunctionalInterface invokeResult = getCustomFunctionalInterface();
        result =invokeResult.add(1000,2000);
        System.out.println("result = "+result);



    }

    /**
     * lambda表达式可以作为方法的返回值
     * @return
     */
    public CustomFunctionalInterface getCustomFunctionalInterface(){
       return  (int left,int right)->{return left+right;};
    }
}



class CustomRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("1.面向对象的方式创建和启动线程");
    }
}


