package net.ittimeline.java.foundational.array;

/**
 * 数组的二分法查找
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/24 13:35
 * @since JDK11
 */
public class ArrayBinarySearch {

    public static void main(String[] args) {
        //初始化一个有序的整数数组
        int[]numbers={10,20,30,40,50,60,70,80,90,100};

        int target =88;

        int targetIndex=-1;

        //开始索引
        int start=0;

        //结束索引
        int end=numbers.length-1;

        int count =0;

        //不明确循环次数,所以都使用while循环,循环条件就是start<=end
        while (start<=end){
            count++;
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

        if(targetIndex!=-1){
            System.out.println("二分法查找的目标元素"+target+"所在的索引是"+targetIndex+"查找的次数:"+count);
        }else {
            System.out.println("二分法查找的目标元素"+target+"没找到"+"查找的次数:"+count);
        }



    }
}
