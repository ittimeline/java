package net.ittimeline.java.api.io;

import org.testng.annotations.Test;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * Properties的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/29 10:57
 * @since JDK11
 */
public class PropertiesTest {

    /**
     *  Properties读取文件
     */
    @Test
    public void testPropertiesReadFile(){
        try(
                //try-with-resources自动关闭资源
                //从类路径加载application.properties
                // 本项目的类路径是 D:\workspace\java\ittimelinedotnet\java\java-foundational\target\classes
                //InputStream inputStream=PropertiesTest.class.getClassLoader().getResourceAsStream("application.properties")
                InputStream inputStream=new FileInputStream("D:\\workspace\\java\\ittimelinedotnet\\java\\java-foundational\\target\\classes\\application.properties");
        ){
            Properties properties=new Properties();
            properties.load(inputStream);

            Set<String> propertyNames = properties.stringPropertyNames();
            for (String propertyName : propertyNames) {
                Object propertyValue = properties.get(propertyName);
                System.out.println("属性名:"+propertyName+"属性值:"+propertyValue);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }


    /**
     * 使用Properties写文件
     */
    @Test
    public void testPropertiesWriteData(){
        String path="D:\\workspace\\java\\ittimelinedotnet\\java\\java-foundational\\src\\main\\resources\\user.properties";
        try(
                OutputStream outputStream=new FileOutputStream(path);
        ){
            Properties properties=new Properties();

            properties.setProperty("username","admin");
            properties.setProperty("password","111111");

            properties.store(outputStream,"后台管理系统默认的用户名,密码");
        }catch(IOException e){
            e.printStackTrace();
        }
    }







}
