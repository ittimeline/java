package net.ittimeline.java.foundational.oop.interfaces.service;

/**
 *
 * 用户服务接口
 * 接口多继承
 * @author tony 18601767221@163.com
 * @version 2021/4/20 16:54
 * @since JDK11
 */
public interface UserService extends LoginService,RegisterService  {

    /**
     * 网站名称
     * 常量
     */
      String WEB_SITE_NAME="淘宝网";

    /**
     * 登录
     * 抽象方法
     */
    @Override
    void login();



    /**
     * 重置密码
     * 默认方法的定义
     */
      default  void resetPassword(){
        System.out.println("请输入手机号并点击发送验证码");
        sendCode();
        System.out.println("请输入收到的手机验证码");
        System.out.println("请输入你的新密码");
        System.out.println("请确认你的新密码");
        System.out.println("你的密码重置成功");

     }




    /**
     * 发送验证码
     * 私有成员方法
     */
    private void sendCode(){
        System.out.println("您好，验证码是xxxxxx,请不要告诉别人");
     }


    /**
     * 统计网站注册的用户信息(人数)
     * 静态方法
     */
    static void statistics(){

      long count=  getAllUserInfo();
        System.out.println("当前网站的注册人数是"+count);

     }

    /**
     * 从数据库查询所有的用户信息
     * 私有静态方法
     * @return
     */
   private  static long getAllUserInfo(){
         System.out.println("从数据库查询所有的用户信息");
         int count=1_000_000_000;
         return count;
     }



}
