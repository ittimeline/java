package net.ittimeline.java.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * dom4j解析user.xml
 *
 * @author tony 18601767221@163.com
 * @version 2021/6/20 14:22
 * @since JDK11
 */

public class Dom4jParseUserXmlTest {

    public static void main(String[] args) {
        //创建解析器对象
        SAXReader saxReader=new SAXReader();

        try {
            Document document = saxReader.read(Dom4jParseUserXmlTest.class.getClassLoader().getResource("user.xml"));
            Element rootElement = document.getRootElement();
            System.out.println("1.------->user.xml文件的根节点的名字是"+rootElement.getName());

            System.out.println("2.-------->获取根标签users的子标签列表");
            List<Element> usersSubElementList = rootElement.elements();
            for (Element userElement : usersSubElementList) {
                System.out.println("users标签的子标签的名字是"+userElement.getName());
                System.out.println("users标签的子标签的id属性值是"+userElement.attributeValue("id"));
                System.out.println("users标签的子标签的country属性值是"+userElement.attributeValue("country"));

                System.out.println("3-------->获取user的子标签列表");
                List<Element> userSubElementList = userElement.elements();
                for (Element userSubElement : userSubElementList) {
                    System.out.println("user标签下的子标签名字是"+userSubElement.getName());
                    System.out.println("user标签下的子标签的文本是"+userSubElement.getText());

                }

            }


            //获取users标签的第一个user标签
            Element firstUserElement = rootElement.element("user");
            //第一个user标签的子标签password的文本
            String password = firstUserElement.elementText("password");
            System.out.println("第一个user标签的子标签password的文本"+password);


        } catch (DocumentException e) {
            e.printStackTrace();
        }


    }
}
