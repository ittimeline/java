package net.ittimeline.java.web.foundational.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * 自定义的ServletContextAttributeListener
 *
 * @author tony 18601767221@163.com
 * @version 2021/7/23 17:20
 * @since JDK11
 */
@WebListener
public class CustomServletContextAttributeListener implements ServletContextAttributeListener {

    /**
     * 监听ServletContext 添加属性
     * @param servletContextAttributeEvent
     */
    @Override
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("CustomServletContextAttributeListener监听到了ServletContext添加了属性," +
                "添加的属性是"+servletContextAttributeEvent.getName()+"添加的属性值"+servletContextAttributeEvent.getValue());

    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("CustomServletContextAttributeListener监听到了ServletContext 修改了属性," +
                "修改的属性是"+servletContextAttributeEvent.getName()+"修改之前的属性值"+servletContextAttributeEvent.getValue());

    }
}
