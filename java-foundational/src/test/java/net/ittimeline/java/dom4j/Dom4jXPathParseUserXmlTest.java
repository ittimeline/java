package net.ittimeline.java.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * dom4j结合XPath解析user.xml
 *
 * @author tony 18601767221@163.com
 * @version 2021/6/20 14:54
 * @since JDK11
 */

public class Dom4jXPathParseUserXmlTest {

    public static void main(String[] args) {

        SAXReader saxReader=new SAXReader();

        try {
            Document document = saxReader.read(Dom4jXPathParseUserXmlTest.class.getClassLoader().getResource("user.xml"));
            //第一个用户的密码
            System.out.println("1.------>使用绝对路径方式查找元素");
            Element element = (Element)document.selectSingleNode("/users/user/password");
            String password = element.getText();
            System.out.println("第一个用户的密码是"+password);

            System.out.println("2.------>使用相对路径的方式查找元素");
            Element userElement = (Element) element.selectSingleNode("../salary");
            System.out.println("第一个用户的薪水区间是"+userElement.getText());

            System.out.println("3.------>使用全文搜索的方式");
            System.out.println("获取所有ID元素的文本");
            List<Node> idNodeList = document.selectNodes("//id");
            for (Node node : idNodeList) {
                Element idElement=(Element) node;
                System.out.println(idElement.getText());
            }

            System.out.println("4.------->谓语(条件筛选)方式");
            System.out.println("获取user id属性为TB10002的用户信息");
            Element TB10002IDElement=(Element)document.selectSingleNode("//user[@id='TB10002']");
            List<Element> elementList = TB10002IDElement.elements();
            for (Element userSubElement : elementList) {
                System.out.println("user子标签的名称"+userSubElement.getName());
                System.out.println("user子标签的文本"+userSubElement.getTextTrim());
            }


        } catch (DocumentException e) {
            e.printStackTrace();
        }

    }
}
