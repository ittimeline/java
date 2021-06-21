package net.ittimeline.java.api.lang.reflect.proxy;

import net.ittimeline.java.api.lang.reflect.proxy.Buyer;
import net.ittimeline.java.api.lang.reflect.proxy.Shopping;
import net.ittimeline.java.api.lang.reflect.proxy.User;
import org.testng.annotations.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 代理模式的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/6/13 7:33
 * @since JDK11
 */

public class ProxyTest {

    /**
     * 静态代理模式的使用
     */
    @Test
    public void staticProxy() {

        //被代理对象
        User user = new User();

        //代理对象
        Buyer buyer = new Buyer(user);

        //调用代理对象的方法
        buyer.buyCellphone();
    }


    /**
     * 动态代理代理无参数无返回值的方法
     */
    @Test
    public void dynamicProxyWithoutArgsWithoutReturnValue() {
        //被代理对象
        User user = new User();
        //动态创建代理对象
        Shopping shopping = (Shopping) Proxy.newProxyInstance(User.class.getClassLoader(), User.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                if (method.getName().equals("buyCellphone")) {
                    user.sendVerificationCode();
                    System.out.println("买手:买手登录商城成功");
                    System.out.println("买手:买手抢到了手机");
                    //通过反射的方式代用被代理对象的方法
                    method.invoke(user);
                }
                return null;
            }
        });
        //调用代理对象的方法
        shopping.buyCellphone();


    }


    /**
     * List集合的remove方法只会删除一个元素
     */
    @Test
    public void ListRemove() {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(100, 100, 200, 300));
        arrayList.remove(Integer.valueOf(100));
        System.out.println("删除元素的值为100之后arrayList集合的元素内容是" + arrayList);

    }

    /**
     * 动态代理代理有参数有返回值的方法
     */
    @Test
    public void dynamicProxyWithArgsWithReturnValue() {

        //被代理对象
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(100, 100, 200, 300));

        //代理对象

        //被代理类和代理类不能是同一个类型。例如不能都是 ArrayList<Integer>，否则会发生类型转换异常
        List<Integer> proxyList = (List<Integer>) Proxy.newProxyInstance(ArrayList.class.getClassLoader(), ArrayList.class.getInterfaces(),
                (Object proxy, Method method, Object[] args) -> {
            // 1.如果代理对象的方法有返回值，那么就应该先执行代理对象的方法，然后将返回值返回
                    Object returnValue = method.invoke(arrayList, args);

                    //通过动态代理增强remove方法，在删除的时候删除所有匹配的元素
                    if (method.getName().equals("remove")) {
                        Iterator<Integer> iterator = arrayList.iterator();
                        while (iterator.hasNext()){
                            Integer value = iterator.next();
                            if (value.equals(args[0])){
                                iterator.remove();
                            }
                        }
                    }
                    if (method.getName().equals("set")){
                        System.out.println("给集合的元素赋值");
                    }
                    return returnValue;
                });

        //
        //调用代理对象的方法
        proxyList.remove(Integer.valueOf(100));
        System.out.println("删除元素的值为100之后arrayList集合的元素内容是" + arrayList);

        proxyList.set(0,20000);
        System.out.println("将0号索引的元素赋值为20000以后arrayList集合的元素内容是" + arrayList);


    }


}
