package net.ittimeline.java.api.lang;

import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Runtime常用方法的测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/27 10:24
 * @since JDK11
 */
public class RuntimeTest {

    Runtime runtime=Runtime.getRuntime();

    /**
     * 通过Runtime获取Java程序运行时的硬件信息
     */
    @Test
    public void testRuntimeHardwareInfo(){

        //对应Windows任务管理器CPU的逻辑处理器的数量
        System.out.println("Java运行时环境  可用于Java虚拟机的处理器数量:"+runtime.availableProcessors());
        System.out.println("Java运行时环境 Java虚拟机中的可用内存量  :"+runtime.freeMemory()+"字节");
        System.out.println("Java运行时环境 Java虚拟机将尝试使用的最大内存量 :"+runtime.maxMemory()+"字节");
        System.out.println("Java运行时环境 Java虚拟机中的内存总量 :"+runtime.totalMemory()+"字节");
    }



    @Test
    public  void testRuntimeExec(){
        try {
            //如果把程序拿到其他操作系统上跑是不行的。因为notepad.exe是Windows专有的
            runtime.exec("mspaint.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
