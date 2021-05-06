package net.ittimeline.java.api.lang;

import org.testng.annotations.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Properties;


/**
 * System类常用方法的测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/26 15:38
 * @since JDK11
 */
public class SystemTest {


    @Test
    public void testCurrentTimeMillis(){
        long startTime =System.currentTimeMillis();
        //程序睡2秒钟
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime=System.currentTimeMillis();

        System.out.println("开始时间:"+startTime);
        System.out.println("结束时间:"+endTime);
        long time=endTime-startTime;
        System.out.println("耗时:"+time+"毫秒");

    }


    /**
     * 获取系统所有的环境变量信息
     * @see System#getenv()
     */
    @Test
    public void testSystemGetEnv(){
        Map<String, String> env = System.getenv();
        //增强for循环遍历map
        for(String name:env.keySet()){
            //name 表示变量名
            // env.get(name) 根据变量名获取变量的值
            System.out.println(name+"---->"+env.get(name));

        }
    }


    /**
     * 获取系统指定得环境变量信息
     */
    @Test
    public void testSystemGetEnvByName(){
        System.out.println(System.getenv("JAVA_HOME"));
        System.out.println(System.getenv("MAVEN_HOME"));
    }


    /**
     * 获取系统属性
     */
    @Test
    public void testSystemProperties(){

        Properties properties = System.getProperties();
        try {
            // 获取系统所有属性并存储到system_properties.txt文件中，文件的注释是Windows System Properties
            properties.store(new FileOutputStream("system_properties.txt"),"Windows System Properties");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 获取指定的系统属性
     */
    @Test
    public void testSystemGetProperty(){

        //获取当前操作系统名称
        System.out.println(System.getProperty("os.name"));
        //获取当前操作系统换行分隔符
        System.out.println(System.getProperty("line.separator"));
        //获取当前操作系统的文件编码
        System.out.println(System.getProperty("file.encoding"));
        //获取当前java的版本
        System.out.println(System.getProperty("java.version"));
        //获取当前java的字节码版本
        System.out.println(System.getProperty("java.class.version"));
        //获取当前虚拟机的名称
        System.out.println(System.getProperty("java.vm.name"));
    }


    /**
     * 退出JVM
     */
    @Test
    public void testSystemExit(){
        //0 正常退出 JVM
        // 非0 异常退出 JVM
        System.exit(0);
        System.out.println("ha ha");
    }

    /**
     * 数组复制
     */
    @Test
    public void testSystemArrayCopy(){
        int[] src={1,2,3,4,5,6,7,8,9};
        int[] dest={100,200,300,400,500,600,700,800,900};
        //从src原数组的第二个索引开始复制，复制到dest新数组的第二个索引，总共复制3个元素
        System.arraycopy(src,2,dest,2,3);
        System.out.println("原数组的内容:"+ Arrays.toString(src));
        System.out.println("新数组的内容:"+ Arrays.toString(dest));
    }




















}
