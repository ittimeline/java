package net.ittimeline.java.foundational.oop;

/**
 * final关键字的使用测试用例
 * @author tony 18601767221@163.com
 * @version 2021/4/19 18:19
 * @since JDK11
 */
public class FinalTest {

    public static void main(String[] args) {

        final int DEFAULT_VALUE=10;
        Address address=new Address();
        address.setName("上海市宝山区");

        //目前的Order是一个不可变类
        final Order order=new Order("tb001",address);
        System.out.println("订单号:"+order.getOrderId());
        //order.setOrderId("tb002");
        System.out.println("订单号:"+order.getOrderId());

        //order.setAddress(address);

        System.out.println("当前地址:"+order.getAddress().getName());

        Address shenzhen=new Address();
        shenzhen.setName("深圳市宝安区");

      //  order.setAddress(shenzhen);
        System.out.println("当前地址:"+order.getAddress().getName());



    }
}


class Order{

    private final String  orderId;

    private final Address address;

    public Address getAddress() {
        return address;
    }

    public String getOrderId() {
        return orderId;
    }

    public Order(String orderId,Address address) {
        this.orderId = orderId;
        this.address=address;
    }
}


class Address{

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}