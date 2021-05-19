package net.ittimeline.java.api.util;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * ListIterator常用方法的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/7 10:02
 * @since JDK11
 */
public class ListIteratorTest {


    ListIterator<Integer> listIterator;


    @BeforeClass
    public void initList(){
        List<Integer> list =new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("1.初始化list集合后集合的元素"+list);
        listIterator = list.listIterator();
    }


    @BeforeMethod
    public void iterator(){

        System.out.println("2.正向遍历List集合");
        while (listIterator.hasNext()) {
            Integer value =  listIterator.next();
            int nextIndex = listIterator.nextIndex();
            System.out.println("当前元素的值"+value+"下一个元素的索引"+nextIndex);
        }
    }


    /**
     * 使用ListIterator正向遍历List集合
     */
    @Test
    public void testIterator(){
        List<Integer> list =new ArrayList<>();
        //元素的值和元素的索引刚好是一致的
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //获取ListIterator对象
        ListIterator<Integer> listIterator = list.listIterator();
        System.out.println("*******************使用ListIterator正向遍历List集合*******************");
        //快捷键 itit
        while (listIterator.hasNext()) {
            Integer value =  listIterator.next();
            if(value==4){
                listIterator.remove();
            }else{
                System.out.println(value);
            }
        }
        System.out.println("当前list集合的元素内容是"+list);
    }

    /**
     * 使用ListIterator反向遍历List集合
     */
    @Test
    public void testListIteratorHasPreviousPrevious(){

        //在方向遍历之前必须先正向遍历
        System.out.println("*******************使用ListIterator正向遍历List集合*******************");
        while (listIterator.hasNext()) {
            Integer value =  listIterator.next();
            System.out.println(value);

        }

        System.out.println("*******************使用ListIterator反向遍历List集合*******************");

        //使用ListIterator反向遍历List集合
        while (listIterator.hasPrevious()){
            Integer previousValue = listIterator.previous();
            System.out.println(previousValue);
        }
    }


    /**
     * 使用ListIterator获取下一个元素的索引
     */
    @Test
    public void testListIteratorNextIndex(){
        while (listIterator.hasNext()) {
            Integer value =  listIterator.next();
            int nextIndex = listIterator.nextIndex();
            System.out.println("当前元素的值"+value+"下一个元素的索引"+nextIndex);
        }
    }


    /**
     * 使用ListIterator获取上一个元素的索引
     */
    @Test
    public void testListIteratorPreviousIndex(){
        System.out.println("*******************使用ListIterator反向遍历List集合*******************");
        while (listIterator.hasPrevious()){
           Integer previousValue = listIterator.previous();
           int previousIndex = listIterator.previousIndex();
           System.out.println("上一个元素的值"+previousValue+"上一个元素的索引"+previousIndex);
       }
    }

    /**
     * 使用ListIterator添加以及修改元素
     */
    @Test
    public void testListIteratorAddSet(){
        System.out.println("*******************使用ListIterator正向遍历list集合并且添加以及修改元素*******************");
        List<Integer> list =new ArrayList<>();
        //元素的值和元素的索引刚好是一致的
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //获取ListIterator对象
        ListIterator<Integer> listIterator = list.listIterator();
        //快捷键 itit
        while (listIterator.hasNext()) {
            Integer value =  listIterator.next();
            // 将集合中值为4的元素改成88
            if(value==4){
                //修改集合的元素的值
                listIterator.set(88);
            }
            //此处的打印输出打印的是迭代器遍历得到的值
            System.out.println(value);
        }

        //往list集合中添加元素，元素的值为5 关注添加的索引
        listIterator.add(5);
        System.out.println("list集合的元素内容是"+list);

    }



}
