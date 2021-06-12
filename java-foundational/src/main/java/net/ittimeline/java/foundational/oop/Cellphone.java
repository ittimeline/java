package net.ittimeline.java.foundational.oop;

import java.io.Serializable;
import java.util.Objects;

/**
 * 手机类
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/15 9:19
 * @since JDK11
 */
public class Cellphone implements Comparable<Cellphone>, Serializable {

    static final long serialVersionUID = 88888888L;

    /**********************成员变量**********************/

    /**
     * 手机型号
     */
    String model;


    /**
     * 手机品牌
     */
    String brand;


    /**
     * 价格
     */
    transient  Integer price;


    /**
     * 颜色
     */

    String color;


    /**
     * 手机重量
     */
    private Integer weight;


    private Integer pixel;


    public Integer getWeight() {
        return weight;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        if(price<0||price>100_0000){
            throw new RuntimeException("价格异常");
        }
        System.out.println("价格设置成功");
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void showCellphoneInfo() {
        System.out.println("手机的重量是" + weight);
    }


    /**********************构造器**********************/


    /**
     * 无参数构造器
     */
    public Cellphone() {


    }

    /**
     * 有一个参数的构造器
     *
     * @param model
     */
    public Cellphone(String model) {
        //通过有参构造器传递参数，给对象的成员变量赋值
        this.model = model;
    }

    /**
     * 有两个参数的构造器
     *
     * @param model
     */
    public Cellphone(String model, Integer price) {
        this(model);
        this.price = price;

    }


    /**
     * 有三个参数的构造器
     *
     * @param model
     */
    public Cellphone(String model, Integer price, Integer weight) {
        this(model);
        this.price = price;
        this.weight = weight;

    }


    /**
     * 全参构造器
     *
     * @param model
     * @param brand
     * @param price
     * @param colorArgs
     */
    public Cellphone(String model, String brand, Integer price, String colorArgs) {
        this.model = model;
        this.brand = brand;
        this.price = price;
        color = colorArgs;
    }


    /**
     * 全参构造器
     *
     * @param model
     * @param brand
     * @param price
     * @param color
     */
    public Cellphone(String model, String brand, Integer price, String color, Integer weight) {
        this(model, brand, price, color);
        this.weight = weight;
    }


    /**********************成员方法**********************/

    /**
     * 给指定的手机号打电话
     *
     * @param number
     */
    public void call(long number) {
        System.out.println("正在给" + number + "打电话");
    }

    /**
     * 给指定的手机发短信
     *
     * @param number
     * @param message
     */
    public void sendMessage(long number, String message) {
        System.out.println("正在给" + number + "发送短信，短信内容是" + message);
    }


    public static void getSerialVersionUID(){
        System.out.println(serialVersionUID);
    }


    @Override
    public String toString() {
        return "手机信息{" +
                "型号:'" + model + '\'' +
                ", 价格:" + price +
                ", 重量:" + weight +
                ", 品牌:" + brand +
                ", 颜色:" + color +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cellphone cellphone = (Cellphone) o;
        return model.equals(cellphone.model) && price.equals(cellphone.price) && weight.equals(cellphone.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price, weight);
    }

    @Override
    public int compareTo(Cellphone cellphone) {
        //需求 按照价格降序排序
        //降序  后面减去前面
        return cellphone.getPrice() - this.getPrice();
    }
}
