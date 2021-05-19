package net.ittimeline.java.api.util;

import net.ittimeline.java.foundational.oop.Cellphone;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections类常用方法的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/11 11:28
 * @since JDK11
 */
public class CollectionsTest {

    List<Integer> list;

    List<Cellphone> cellphoneList;


    @BeforeClass
    public void initList(){
        list =new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7);
        System.out.println("初始化之后当前list集合的元素内容是"+list);


        //往集合中添加三个匿名的Cellphone对象
        cellphoneList=new ArrayList<>();
        cellphoneList.add(new Cellphone("iphone12 pro max",13999,208));
        cellphoneList.add(new Cellphone("P50 pro plus",13999,199));
        cellphoneList.add(new Cellphone("S21 Ultra",10999,205));

        System.out.println("**********cellphoneList集合初始化之后集合元素的内容是**********");
        printCellphoneList(cellphoneList);
    }

    /**
     * 遍历集合的元素
     * @param cellphoneList
     */
    public void printCellphoneList(List<Cellphone> cellphoneList){
        for (Cellphone cellphone : cellphoneList) {
            System.out.println(cellphone);
        }
    }


    /**
     * 往指定的集合添加多个元素
     */
    @Test
    public void testCollectionsAddAll(){
        List<Integer> list =new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7);
        System.out.println("当前list集合的元素内容是"+list);

    }

    /**
     * 打乱集合元素的顺序
     */
    @Test
    public void testCollectionsShuffle(){
        Collections.shuffle(list);
        System.out.println("将list集合元素打乱顺序之后当前list集合的元素内容是"+list);
    }

    /**
     * 集合的元素排序 元素类型是整数
     */
    @Test
    public void testCollectionsSortInteger(){
        Collections.shuffle(list);
        System.out.println("将list集合元素打乱顺序之后当前list集合的元素内容是"+list);
        Collections.sort(list);
        //默认规则是升序排序
        System.out.println("按照默认规则升序排序之后当前list集合的元素内容是"+list);


        //按照自定义规则降序排序
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //降序  后面减去前面
                return o2-o1;
            }
        });

        System.out.println("按自定义规则降序排序之后当前list集合的元素内容是"+list);


    }


    /**
     * 集合的元素排序 元素类型是自定义的类Cellphone
     * 需求1:按照价格降序排序
     * 需求2:按照价格升序排序，如果价格相同，按照重量升序排序
     */
    @Test
    public void testCollectionsSortCellphone(){

        Collections.sort(cellphoneList);
        System.out.println("**********需求1:cellphoneList集合按照价格降序排序之后集合元素的内容是**********");
        printCellphoneList(cellphoneList);


        Collections.sort(cellphoneList, new Comparator<Cellphone>() {
            @Override
            public int compare(Cellphone cellphone1, Cellphone cellphone2) {
                //需求2: 按照价格升序排序，如果价格相同，按照重量升序排序
                if(cellphone1.getPrice().equals(cellphone2.getPrice())){
                    return cellphone1.getWeight()-cellphone2.getWeight();
                }
                //升序 前面减去后面
                return cellphone1.getPrice()-cellphone2.getPrice();
            }
        });
        System.out.println("**********需求2:cellphoneList集合按照价格升序排序，如果价格相同，按照重量升序排序之后集合元素的内容是**********");
        printCellphoneList(cellphoneList);


    }


    /**
     *   基于二分法在集合中查找指定的元素
      */
    @Test
    public void testCollectionsBinarySearch(){

        Collections.addAll(list,100,200,300,80,88,102,120,999,1008,20,30,109,200,800);
        System.out.println("当前集合的元素内容"+list);
        System.out.println("当前集合的元素个数"+list.size());

        Collections.sort(list);

        int targetElement=10008;
        int targetIndex = Collections.binarySearch(list, targetElement);

        if(targetIndex>=0){
            System.out.println("找到了"+targetElement+"它的索引是"+targetIndex);
        }else{
            System.out.println(targetElement+"没有找到");

        }


    }






}
