package net.ittimeline.java.foundational.oop;

/**
 * static关键字使用的测试用例
 * @author tony 18601767221@163.com
 * @version 2021/4/19 20:33
 * @since JDK11
 */
public class StaticTest {

    static{
        System.out.println("我是StaticTest类中的静态代码块");
    }

    public static void main(String[] args) {

        RegisterInfo android =new RegisterInfo();
        android.setUserName("tony");
        android.setSource("app");

        System.out.println(android);


        RegisterInfo ios =new RegisterInfo();
        ios.setUserName("jack");
       // ios.setSource("app");

        System.out.println(ios);
    }

}

/**
 * 注册信息
 */
class RegisterInfo{

   static  {

       System.out.println("我是一个静态代码块");
    }

    /**
     * 用户名
     */
    private String userName;

    /**
     * 默认的注册来源
     */
    private  static String source;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }


    @Override
    public String toString() {
        return "注册信息{" +
                "用户名 :'" + userName + '\'' +
                ", 默认的注册来源 :'" + source + '\'' +
                '}';
    }
}