package net.ittimeline.java.api.util;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.LinkedList;

/**
 * LinkedList集合常用方法的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/11 8:47
 * @since JDK11
 */
public class LinkedListTest {

    LinkedList<String> linkedList;


    @BeforeClass
    public void initLinkedList(){
        linkedList=new LinkedList<>();
        linkedList.add("北京");
        linkedList.add("上海");
        linkedList.add("广州");
        linkedList.add("深圳");
        System.out.println("初始化之后当前linkedList集合的 元素内容是"+linkedList);
    }



    @Test
    public void testLinkedListAdd(){
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("北京");
        linkedList.add("上海");
        linkedList.add("广州");
        linkedList.add("深圳");
        System.out.println("当前linkedList集合的 元素内容是"+linkedList);

    }

    /**
     *  在LinkedList集合的首部和尾部添加元素
     */
    @Test
    public void testLinkedListAddFirstAddLast(){

        linkedList.addFirst("香港");
        System.out.println("将香港添加到linkedList集合的首部当前linkedList集合的 元素内容是"+linkedList);
        linkedList.addLast("成都");
        System.out.println("将成都添加到linkedList集合的尾部部当前linkedList集合的 元素内容是"+linkedList);


    }


    /**
     * 获取LinkedList集合的首部元素和尾部元素
     */
    @Test
    public void testLinkedListGetFirstGetLast(){
        String first = linkedList.getFirst();
        System.out.println("当前linkedList集合的第一个元素内容是"+first);
        String last = linkedList.getLast();
        System.out.println("当前linkedList集合的最后一个元素内容是"+last);
    }


    /**
     * 删除LinkedList集合的首部元素和尾部元素
     */
    @Test
    public void testLinkedListRemoveFirstRemoveLast(){
        linkedList.addFirst("香港");
        linkedList.addLast("成都");
        System.out.println("删除之前当前linkedList集合的 元素内容是"+linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
    }


    /**
     * 添加和删除首部元素
     */
    @Test
    public void testLinkedListPushPop(){

        linkedList.push("香港");
        System.out.println("将香港添加到linkedList集合的首部当前linkedList集合的 元素内容是"+linkedList);
        linkedList.pop();
        System.out.println("删除linkedList集合的首部元素当前linkedList集合的 元素内容是"+linkedList);

    }




    @AfterClass
    public void destroy(){
        System.out.println("销毁之前当前linkedList集合的 元素内容是"+linkedList);
        linkedList=null;
    }


}
