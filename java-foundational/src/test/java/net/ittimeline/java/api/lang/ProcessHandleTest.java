package net.ittimeline.java.api.lang;

import org.testng.annotations.Test;

import java.io.IOException;

/**
 * 获取进程相关信息测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/27 10:38
 * @since JDK11
 */
public class ProcessHandleTest {


    @Test
    public void testGetProcessInfo(){
        Runtime runtime=Runtime.getRuntime();
        String command="mspaint.exe";
        try {
            Process process=runtime.exec(command);
            ProcessHandle processHandle = process.toHandle();
            //如果你要kill某个进程，根据pid去kill
            System.out.println(command+"的进程PID是"+processHandle.pid());
            System.out.println(command+"的进程状态是"+processHandle.isAlive());

            ProcessHandle.Info info =processHandle.info();

            // C:\Windows\System32\mspaint.exe
            System.out.println(command+"的进程的命令是"+info.command().get());
            //开始时间比北京时间晚8个小时
            System.out.println(command+"的进程的开始时间是"+info.startInstant().get());
            System.out.println(command+"的进程的总运行时间是"+info.totalCpuDuration().get());




        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
