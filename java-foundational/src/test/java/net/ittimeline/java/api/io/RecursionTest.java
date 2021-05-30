package net.ittimeline.java.api.io;

import org.testng.annotations.Test;

import java.io.File;

/**
 * 递归的应用
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/27 18:56
 * @since JDK11
 */
public class RecursionTest {


    /**
     * 不合理的递归会导致栈内存溢出
     * 该递归调用没有出口
     */
    public void recursionCallV1(){
        recursionCallV1();
    }

    static int count =0;

    /**
     * 避免栈内存溢出
     */
    public void recursionCallV2(){
        System.out.println("count = "+count);
        count++;
        //当count大于等于3500以后，结束递归
        //因此递归一定要有结束条件
        if(count<3500){
            recursionCallV2();
        }
    }

    /**
     * 递归调用
     */
    @Test
    public void testRecursionCall(){
        //recursionCallV1();
        recursionCallV2();
    }


    /**
     * 计算n的累加和
     * @param n
     * @return
     */
    public long sum(int n){
        //递归的结束条件
        if(n==1){
            return 1;
        }
        //n+n-1的累加和
        return n+sum(n-1);
    }


    @Test
    public void testSum(){
        System.out.println("5的累加和计算的结果是"+sum(5));
    }


    /**
     * n的阶乘
     * @param n
     * @return
     */
    public long factorial(int n){
        //1的阶乘就是1
        //递归的出口，即递归的结束条件
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    /**
     * 5的阶乘 120
     * 5*4*3*2*1=120
     *
     */
    @Test
    public void testFactorial(){
        System.out.println("5的阶乘的计算结果"+factorial(5));
    }

    long totalFileSize=0;

    /**
     * 统计指定目录(目录是多级别)的文件大小
     * @param path
     * @return
     */
    public long statisticsFileSize(String path){
        File currentDirectory=new File(path);
        //获取指定目录的一级子目录
        File[] files = currentDirectory.listFiles();
        for (File file : files) {
            //如果file是文件
            if(file.isFile()){
                //累加文件的大小作为最终的统计结果
                System.out.println(file.getName()+"文件大小是"+file.length()+"字节");
                totalFileSize+=file.length();
                //如果file是目录
            }else if (file.isDirectory()){
                //递归调用统计文件的大小
                statisticsFileSize(file.getAbsolutePath());
            }
        }
        return totalFileSize;
    }

    @Test
    public void testStatisticsFileSize(){

        String path="D:\\io";
        long fileSize = statisticsFileSize(path);
        System.out.println(path+"目录下的文件大小是"+fileSize);
    }


    /**
     * 删除指定路径的非空文件夹
     * @param path
     */
    public void deleteFolder(String path){
        File file=new File(path);
        //如果file对象关联的路径是文件
        if(file.isFile()){
            //直接删除就完事了
            file.delete();
            System.out.println(file.getName()+"已经被删除");
            return;
        }
        /****************删除多级子目录的文件和文件夹开始*********************/
        //获取file的一级子目录
        File[] files = file.listFiles();
        if(null!=files){
            for (File currentFile : files) {
                //如果一级子目录的currentFile是文件
                if(currentFile.isFile()){
                    //删除对应的文件
                    currentFile.delete();
                    System.out.println(currentFile.getName()+"已经被删除");
                    //如果一级子目录的currentFile是目录
                }else if(currentFile.isDirectory()){
                    //递归调用删除文件
                    deleteFolder(currentFile.getAbsolutePath());
                    // 删除文件夹
                    currentFile.delete();
                    System.out.println(currentFile.getName()+"已经被删除");

                }
            }
        }

        /****************删除多级子目录的文件和文件夹结束*********************/

        if(file.isDirectory()){
            file.delete();
            System.out.println(file.getName()+"已经被删除");

        }

    }


    @Test
    public void testDeleteFolder(){
        //删除D盘下的io文件夹，包含子文件夹和文件
        deleteFolder("D:\\io");

    }





}
