package net.ittimeline.java.foundational.oop.abstracts.template.shopping;

import net.ittimeline.java.foundational.oop.abstracts.template.JDShopping;
import net.ittimeline.java.foundational.oop.abstracts.template.TaobaoShopping;

/**
 * 模板方法模式测试用例
 * @author tony 18601767221@163.com
 * @version 2021/4/19 15:37
 * @since JDK11
 */
public class TemplateMethodPatternTest {

    public static void main(String[] args) {
        TaobaoShopping taobaoShopping=new TaobaoShopping();
        taobaoShopping.shopping();


        JDShopping jdShopping=new JDShopping();
        jdShopping.shopping();
    }
}
