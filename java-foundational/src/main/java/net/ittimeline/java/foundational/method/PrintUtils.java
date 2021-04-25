package net.ittimeline.java.foundational.method;

/**
 * 打印工具类
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/11 16:31
 * @since JDK11
 */
public class PrintUtils {


    /**
     * 打印指定次数的内容
     * @param count
     * @param content
     */
    public static void printContent(int count,String content){

        if(count>0){
            for (int i = 0; i <count ; i++) {
                System.out.println(content);
            }
        }else{
            System.out.println("count必须大于0");
        }
    }


    /**
     * 打印指定的内容
     * @param contents
     */
    public  static void printContent(String... contents){
        for (int i = 0; i < contents.length; i++) {
            System.out.println(contents[i]);
        }
    }






}
