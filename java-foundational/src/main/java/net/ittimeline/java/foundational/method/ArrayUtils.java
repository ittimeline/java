package net.ittimeline.java.foundational.method;

import java.util.Arrays;

/**
 * 数组工具类
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/11 16:35
 * @since JDK11
 */
public class ArrayUtils {

    /**
     * 整数数组的冒泡排序
     * @param numbers
     */
    public static void bubbleSort(int[] numbers){
        System.out.println("冒泡排序之前的结果是" + Arrays.toString(numbers));

        int count = 0;

        //外层循环控制比较的轮数
        for (int i = 0; i < numbers.length - 1; i++) {

            //内层循环控制每轮比较的次数,次数是递减的
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                //内层循环的循环体  比较相邻的两个数据,把比较之后较大的数据放在后面,这个就是需要交换变量
                if (numbers[j] > numbers[j + 1]) {
                    numbers[j] = numbers[j] ^ numbers[j + 1];
                    numbers[j + 1] = numbers[j] ^ numbers[j + 1];
                    numbers[j] = numbers[j] ^ numbers[j + 1];

                }


            }

            count++;
            System.out.println("第" + count + "轮排序的结果" + Arrays.toString(numbers));
        }
        System.out.println("冒泡排序之后的结果是" + Arrays.toString(numbers));
    }


    /**
     * 整数数组的选择排序
     * @param numbers
     */
    public static  void selectSort(int[]numbers){
        System.out.println("选择排序之前的数组:"+ Arrays.toString(numbers));

        int count =0;


        //外层循环控制轮数
        for (int i = 0; i < numbers.length-1 ; i++) {
            count++;
            //内层循环控制每轮的排序的次数
            for (int j = i+1; j <numbers.length ; j++) {

                if(numbers[i]>numbers[j]){
                    numbers[i]=numbers[i]^numbers[j];
                    numbers[j]=numbers[i]^numbers[j];
                    numbers[i]=numbers[i]^numbers[j];
                }
            }
            System.out.println("第"+count+"轮选择排序的结果:"+Arrays.toString(numbers));


        }

        System.out.println("选择排序之后的数组"+Arrays.toString(numbers));

    }

    /**
     * 整数数组的二分法查找
     * @param numbers 整数数组
     * @param target 查找的元素
     * @return 返回目标元素的索引
     */
    public static int binarySearch(int[]numbers,int target){
        int targetIndex=-1;
        //开始索引
        int start=0;
        //结束索引
        int end=numbers.length-1;
        //不明确循环次数,所以都使用while循环,循环条件就是start<=end
        while (start<=end){
            //在循环中计算中间元素的索引
            int mid = (start+end)/2;

            if(numbers[mid]==target){
                targetIndex=mid;
                break;
                // 如果中间元素大于目标值(查找的元素)
            }else  if(numbers[mid]>target){
                end=mid-1;
            }else  if(numbers[mid]<target){
                start=mid+1;
            }

        }

        return  targetIndex;
    }


    /**
     * 往数组中添加指定的元素
     * @param array
     * @param element
     * @return
     */
    public static int[]  add(int[]array,int element){
        //非空校验
        if(array==null){
            return  null;
        }
        //创建一个新数组存储原数组的内容以及新增的元素
        int[] newArray=new int[array.length+1];

        //将原数组的元素复制到新数组中
        for (int i = 0; i < array.length; i++) {
            newArray[i]=array[i];
        }

        //将需要添加的元素添加到新数组的尾部
        newArray[newArray.length-1]=element;

        return newArray;


    }

    /**
     * 根据索引删除数组中指定的元素
     * @param array
     * @param removeIndex
     * @return
     */
    public static int[] remove(int[]array,int removeIndex){
        //非空校验
        if(array==null){
            return  null;
        }
        //索引的合法性校验
        if(removeIndex<0||removeIndex>array.length-1){
            return  null;
        }

        int[]newArray=new int[array.length-1];
        int newArrayIndex=0;

        // 将原数组中和删除元素不相等的元素放到新数组中
        for (int i = 0; i <array.length ; i++) {
            if(array[i]!=array[removeIndex]){
                newArray[newArrayIndex]=array[i];
                newArrayIndex++;
            }
        }
        return  newArray;


    }

    /**
     * 删除数组中指定的元素
     * @param array
     * @param element
     * @return
     */
    public static int[] removeElement(int[]array,int element){
        //非空校验
        if(array==null){
            return  null;
        }

        int removeElementIndex=-1;

        for (int i = 0; i <array.length ; i++) {
            if (array[i]==element){
                removeElementIndex=i;
            }
        }

        //删除的元素不存在
        if(removeElementIndex==-1){
            return  null;
        }

        int[] newArray=new int[array.length-1];

        int newArrayIndex=0;

        for (int i = 0; i < array.length ; i++) {
            if(i!=removeElementIndex){
                newArray[newArrayIndex]=array[i];
                newArrayIndex++;
            }
        }
        return  newArray;


    }

    /**
     * 往数组中指定的索引添加指定的元素
     * @param array
     * @param addIndex
     * @param addElement
     * @return
     */
    public static int[] add(int[]array,int addIndex,int addElement){

        //非空校验
        if(array==null){
            return  null;
        }
        //索引的合法性校验
        if(addIndex<0||addIndex>array.length-1){
            return  null;
        }
        int[]newArray=new int[array.length+1];

        //怎么存放原数组的元素到新数组中
        for (int i = 0; i < array.length; i++) {

            if(i<addIndex){
                newArray[i]=array[i];
            }else{
                newArray[i+1]=array[i];
            }
        }
        newArray[addIndex]=addElement;
        return  newArray;
    }






}
