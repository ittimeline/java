package net.ittimeline.java.foundational.oop.interfaces.service;

/**
 * @author tony 18601767221@163.com
 * @version 2021/4/23 8:16
 * @since JDK11
 */
public class Cellphone {

    /**
     * 手机型号
     */
    private String model;


    /**
     * 手机品牌
     */
    private String brand;

    /**
     * 价格
     */
    private Integer price;



    /**
     * 颜色
     */

    private String color;

    /**
     * 手机重量
     */
    private  Integer weight;

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
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }


    /**********************构造器**********************/


    /**
     * 无参数构造器
     */
    public Cellphone(){

    }

    public Cellphone(String model, String brand, Integer price, String color, Integer weight) {
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cellphone{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
