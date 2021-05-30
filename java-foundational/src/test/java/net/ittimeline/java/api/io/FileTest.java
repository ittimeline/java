package net.ittimeline.java.api.io;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

/**
 * File类的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/27 7:44
 * @since JDK11
 */
public class FileTest {


    /**
     * File对象创建的三种方式
     */
    @Test
    public void testFileConstructor(){
        //以D:\io 路径创建File对象
        //io文件夹不存在，也能创建File对象
        File directory=new File("D:\\io");
        System.out.println("directory = "+directory);

        File parentFile=new File("D:\\");
        String child="io";
        File ioDirectory=new File(parentFile,child);
        System.out.println("ioDirectory = "+ioDirectory);

        String parent="D:\\";
        File ioPath=new File(parent,child);
        System.out.println("ioPath = "+ioPath);

        //以test.txt文件的路径D:\io\test.txt创建File对象
        File file =new File("D:\\io\\test.txt");
        System.out.println("file = "+file);

        String parentPath="D:\\io";
        String childFileName="test.txt";
        File testTxt=new File(parentPath,childFileName);
        System.out.println("testTxt = "+testTxt);




    }


    /**
     * 文件夹的创建和删除
     */
    @Test
    public void testDirectoryCreateDelete(){

        File directory=new File("D:\\io");
        directory.mkdir();
        directory.delete();

        File multiLevelDirectory=new File("D:\\nio\\buffer");
        multiLevelDirectory.mkdirs();
        //只能删除一级子目录,如果要删除多级目录，需要递归删除
        multiLevelDirectory.delete();

    }

    /**
     * 文件的创建和删除
     * @throws IOException
     */
    @Test
    public void testFileCreateDelete() throws IOException {

        File io =new File("D:\\io");
        io.mkdir();

        //创建文件，但是指定的目录(D:\io)必须存在
        File file =new File("D:\\io\\test.txt");
        file.createNewFile();

        file.delete();


    }

    /**
     * 获取文件夹和文件的信息
     */
    @Test
    public void testGetDirectoryAndFilePath() throws IOException{

        File io =new File("D:\\io");
        System.out.println("当前File对象表示的绝对路径"+io.getAbsolutePath());
        System.out.println("当前File对象表示的绝对路径"+io.getAbsoluteFile());
        System.out.println("当前File对象表示文件夹名称"+io.getName());

        File file =new File("D:\\io\\test.txt");
        file.createNewFile();

        System.out.println("当前File对象表示的绝对路径"+file.getAbsolutePath());
        System.out.println("当前File对象表示的绝对路径"+file.getAbsoluteFile());
        System.out.println("当前File对象表示文件名称"+file.getName());
        //只能获取文件的大小，不能获取文件夹的大小
        System.out.println("当前File对象表示文件的文件大小"+file.length());

    }

    /**
     * 文件和文件夹判断的相关方法
     */
    @Test
    public void testFileJudge(){
        File file =new File("D:\\io\\test.txt");
        boolean exists = file.exists();
        System.out.println("D盘io目录下的test.txt文件是否存在"+exists);
        boolean isFile = file.isFile();
        System.out.println("当前file是否是文件"+isFile);

        boolean isDirectory = file.isDirectory();
        System.out.println("当前file是否是目录"+isDirectory);

    }


    /**
     * File#listFiles获取指定目录的子目录
     */
    @Test
    public void testFileList(){
        File inputStream=new File("D:\\io\\inputstream");
        File outputStream=new File("D:\\io\\outputstream");
        File reader=new File("D:\\io\\reader");
        File writer=new File("D:\\io\\writer");

        inputStream.mkdirs();
        outputStream.mkdirs();
        reader.mkdirs();
        writer.mkdirs();

        File io=new File("D:/io");
        //获取io目录下的一级子目录
        File[] files = io.listFiles();
        System.out.println("获取io目录下的一级子目录");
        for (File file : files) {
            System.out.println(file);
        }



        File java=new File("D:\\workspace\\java\\ittimelinedotnet\\java\\java-foundational\\src\\test\\java\\net\\ittimeline\\java\\api\\lang");
        String[] javaFileList = java.list((file, name) -> name.endsWith(".java"));
        if(null!=javaFileList){
            System.out.println("获取api\\lang下面的.java结尾的文件");
            for (String javaFile : javaFileList) {
                System.out.println(javaFile);
            }
        }


    }


    /**
     * File#listFiles的使用注意事项
     * 1. File关联的目录不存在，遍历子目录会引发空指针异常
     * 2. File关联的目录没有权限访问,遍历子目录会引发空指针异常
     */
    @Test
    public void testFileListFilesWarning(){

        File ioDirectory=new File("D:\\io");
        //获取D:\io下的子目录
        File[] files = ioDirectory.listFiles();
        //因为D:\io目录不存在，因为File的listFiles()方法返回空，返回空如果不进行非空判断就遍历，那就引发了NullPointerException异常
        //因此防止空指针异常，遍历子目录之前需要进行非空判断
        if(null!=files){
            for (File file : files) {
                System.out.println(file);
            }
        }

    }


}
