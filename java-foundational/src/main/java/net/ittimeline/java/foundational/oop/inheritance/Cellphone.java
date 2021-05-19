package net.ittimeline.java.foundational.oop.inheritance;

/**
 * 功能机类(父类)
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/15 9:19
 * @since JDK11
 */
public   class Cellphone {

    /**********************成员变量**********************/



    /**
     * 手机型号
     */
   private String model;

    /**********************成员变量-公共的get/set方法*******************/

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model=model;
    }



    /**
     * 手机品牌
     */
    private String brand;

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }



    /**
     * 价格
     */
    private Integer price;

    public Integer getPrice(){
        return price;
    }

    public void setPrice(Integer price){
        if(price<0){
            this.price=-1;
            return;
        }
        this.price=price;
    }


    /**
     * 颜色
     */

    private String color;


    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }


    /**
     * 手机重量
     */
    private  Integer weight;

    public Integer getWeight(){
        return weight;
    }

    public void setWeight(Integer weight){
       this.weight=weight;
    }




    /**********************构造器**********************/


    /**
     * 无参数构造器
     */
    public Cellphone(){

        System.out.println("Cellphone()无参构造器"+this);
    }

    /**
     * 有一个参数的构造器
     * @param model
     */
    public Cellphone(String model){
        //通过有参构造器传递参数，给对象的成员变量赋值
        this.model=model;
    }


    public Cellphone(String model, Integer price){
        this(model);
        this.price=price;

    }




    /**
     * 全参构造器
     * @param model
     * @param brand
     * @param price
     * @param colorArgs
     */
    public Cellphone(String model, String brand, Integer price, String colorArgs){
        this.model=model;
        this.brand=brand;
        this.price=price;
        color=colorArgs;
    }

    @Override
    public String toString() {
        return "Cellphone{" +
                "model='" + model + '\'' +
                '}';
    }


/**********************成员方法**********************/

    /**
     * 给指定的手机号打电话
     * @param number
     */
    public void call(long number){
        System.out.println("正在给"+number+"打电话");
    }

    /**
     * 给指定的手机发短信
     * @param number
     * @param message
     */
    public   void sendMessage(long number,String message){
        System.out.println("正在给"+number+"发送短信，短信内容是"+message);
    }

}
