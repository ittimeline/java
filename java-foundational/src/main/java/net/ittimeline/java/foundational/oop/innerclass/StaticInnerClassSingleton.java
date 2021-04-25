package net.ittimeline.java.foundational.oop.innerclass;

/**
 * 静态内部类的单例模式
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/23 16:55
 * @since JDK11
 */
public class StaticInnerClassSingleton {

    /**
     * 私有化构造器
     */
    private StaticInnerClassSingleton(){}


    public static StaticInnerClassSingleton getInstance(){
        return StaticInnerClassSingletonHolder.INSTANCE;
    }

    private static class StaticInnerClassSingletonHolder{
        private static final StaticInnerClassSingleton INSTANCE=new StaticInnerClassSingleton();
    }


}
