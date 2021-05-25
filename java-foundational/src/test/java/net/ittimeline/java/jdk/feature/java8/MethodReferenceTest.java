package net.ittimeline.java.jdk.feature.java8;

import net.ittimeline.java.api.util.DateTimeUtils;
import net.ittimeline.java.foundational.oop.Cellphone;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 方法引用的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/25 8:06
 * @since JDK11
 */
public class MethodReferenceTest {
    /**
     * 打印当前时间
     */
    static void printCurrentTime() {
        System.out.println(DateTimeUtils.getCurrentTime());
    }

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println(DateTimeUtils.getCurrentTime());
        }).start();

        new Thread(() -> {
            printCurrentTime();
        }).start();

        //以上两种情况
        //使用类成员方法替换lambda表达式
        new Thread(MethodReferenceTest::printCurrentTime).start();
    }


    /**
     * 构造方法引用的使用
     */
    @Test
    public void testConstructorMethodReference(){
        List<String> modelNameList=new ArrayList<>();

        modelNameList.add("小米11");
        modelNameList.add("iphone12");
        modelNameList.add("华为p50");

        //将List集合元素的内容转换为Cellphone对象
        System.out.println("使用Stream API结合lambda表达式实现");
        List<Cellphone> collectCellphoneList = modelNameList.stream().map((modelName) -> {
            return new Cellphone(modelName);
        }).collect(Collectors.toList());

        for (Cellphone cellphone : collectCellphoneList) {
            System.out.println(cellphone);
        }

        //使用Stream API结合构造方法引用实现
        System.out.println("使用Stream API结合构造方法引用实现");
        List<Cellphone> constructorMethodCellphoneList = modelNameList.stream().map(Cellphone::new).collect(Collectors.toList());

        for (Cellphone cellphone : constructorMethodCellphoneList) {
            System.out.println(cellphone);
        }
    }


    /**
     * 静态方法引用的使用
     */
    @Test
    public void testStaticMethodReference(){
        List<String> orderStrIdList =new ArrayList<>();

        orderStrIdList.add("1000");
        orderStrIdList.add("1001");
        orderStrIdList.add("1002");

        //将订单号转换为整数的
        List<Integer> orderIdList=new ArrayList<>();
        orderStrIdList.stream().map((orderStrId)->{
            return Integer.parseInt(orderStrId);
        }).forEach((orderId)->{
            orderIdList.add(orderId);
        });
        System.out.println("使用Stream API结合Lambda表达式实现");

        for (Integer orderId : orderIdList) {
            System.out.println(orderId);
        }

        List<Integer> staticMethodReferenceOrderIdList=new ArrayList<>();
        orderStrIdList.stream().map(Integer::parseInt).forEach((orderId)->{
            staticMethodReferenceOrderIdList.add(orderId);
        });

        System.out.println("使用Stream API结合静态方法引用实现");
        for (Integer orderId : staticMethodReferenceOrderIdList) {
            System.out.println(orderId);
        }


    }

    /**
     * 对象成员方法引用的使用
     */
    @Test
    public void testObjectMemberMethodReference(){
        List<String> modelNameList=new ArrayList<>();

        modelNameList.add("小米11");
        modelNameList.add("iphone12");
        modelNameList.add("华为p50");

        //使用Stream API结合Lambda表达式将集合的元素遍历输出
        System.out.println("使用Stream API结合Lambda表达式实现");
        modelNameList.stream().forEach((modelName)->{
            System.out.println(modelName);
        });

        System.out.println("使用Stream API结合对象成员方法引用实现");
        //对象成员方法引用的方法有参数
        modelNameList.stream().forEach(System.out::println);
    }


    /**
     * 类成员方法引用的使用
     */
    @Test
    public void testClassMemberMethodReference(){

        List<String> modelNameList=new ArrayList<>();

        modelNameList.add("小米11");
        modelNameList.add("iphone12");
        modelNameList.add("华为p50");

        //使用Stream API结合lambda表达式将集合中的字符串转换为对应的长度之后遍历输出
        System.out.println("使用Stream API结合lambda表达式实现");
        modelNameList.stream().map((modelName)->{
            return modelName.length();
        }).forEach(System.out::println);
        System.out.println("使用Stream API结合类成员方法引用实现");
        modelNameList.stream().map(String::length).forEach(System.out::println);

    }

}
