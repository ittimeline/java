package net.ittimeline.java.foundational.oop.inheritance;




/**
 * 智能机类(子类)
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/17 16:39
 * @since JDK11
 */
public class SmartPhone extends  Cellphone{

    /**
     * 是否支持无线充电
     */
    private boolean wirelessCharging;

    public boolean isWirelessCharging() {
        return wirelessCharging;
    }

    public void setWirelessCharging(boolean wirelessCharging) {
        this.wirelessCharging = wirelessCharging;
    }

    public SmartPhone(){

        super();
    }

   public  SmartPhone(String model){
        //调用父类带一个参数的构造方法
        super(model);

    }


    @Override
    public String toString() {
        return "SmartPhone{" +
                "手机型号:"+super.getModel()+
                "是否支持无线充电:" + wirelessCharging +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        // 判断两个对象的地址是否相等
        if (this == o) {
            return true;
        }
        //非空判断以及判断两个对象的类型是否一致
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        //向下转型
        SmartPhone that = (SmartPhone) o;
        //判断Smartphone对象的充电属性和型号属性是否相等
        return wirelessCharging == that.wirelessCharging && this.getModel().equals(that.getModel());
    }



    /**
     * 播放视频
     * @param model
     */
    public void playVideo(String model){
        System.out.println(model+"正在刷抖音...");
    }


    /**
     * 发短信&&发微信
     * @param number
     * @param message
     */
    @Override
    public  void sendMessage(long number, String message) {
        //调用父类的成员方法
        super.sendMessage(number,message);
        System.out.println("正在给"+number+"发送微信，微信内容是"+message);
    }




}
