package net.ittimeline.java.foundational.oop.encapsulation;

/**
 * this关键字的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/16 17:10
 * @since JDK11
 */
public class ThisTest {

    public static void main(String[] args) {

        Cellphone cellphone=new Cellphone();
        System.out.println("Cellphone对象的地址"+cellphone);

        Cellphone xiaomi=new Cellphone();
        System.out.println("xiaomi对象的地址"+xiaomi);

        xiaomi.setWeight(188);

        System.out.println("手机的体重"+xiaomi.getWeight());

        Cellphone huawei=new Cellphone("华为p50",7999);

        System.out.println("huawei  手机型号:"+huawei.getModel()+"手机价格:"+huawei.getPrice());



    }
}
