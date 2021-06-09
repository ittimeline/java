package net.ittimeline.java.api.nio;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * ByteBuffer的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/6/7 10:09
 * @since JDK11
 */
public class ByteBufferTest {

    ByteBuffer byteBuffer=null;

    @BeforeClass
    public void initByteBuffer(){
        byteBuffer = ByteBuffer.allocate(10);
        System.out.println("初始化之后当前ByteBuffer缓冲区的内容"+Arrays.toString(byteBuffer.array()));

    }

    /**
     * ByteBuffer的创建
     */
    @Test
    public void testByteBufferCreate(){
        final ByteBuffer byteBufferHeap = ByteBuffer.allocate(10);
        System.out.println("当前ByteBuffer缓冲区的内容"+Arrays.toString(byteBufferHeap.array()));
        final ByteBuffer byteBufferLocalMemory = ByteBuffer.allocateDirect(10);
        final ByteBuffer byteBufferHeap2 = ByteBuffer.wrap(new byte[]{98,99,100});
    }


    /**
     * ByteBuffer的添加元素
     */
    @Test
    public void testByteBufferPut(){
        byteBuffer.put((byte)10);
        byteBuffer.put((byte)20);
        byteBuffer.put((byte)30);
        byteBuffer.put((byte)40);
        System.out.println("添加四个之后当前ByteBuffer缓冲区的内容"+Arrays.toString(byteBuffer.array()));

        byte[]bytes={65,66,67,68};
        byteBuffer.put(bytes);
        System.out.println("添加一个字节数组之后当前ByteBuffer缓冲区的内容"+Arrays.toString(byteBuffer.array()));

        byte[] src={97,98,99,100,101};
        byteBuffer.put(src,0,2);
        System.out.println("添加一个指定范围的字节数组之后当前ByteBuffer缓冲区的内容"+Arrays.toString(byteBuffer.array()));


    }

    /**
     * 获取ByteBuffer的容量
     */
    @Test
    public void testByteBufferCapacity(){
        System.out.println("初始化之后当前ByteBuffer缓冲区的容量"+byteBuffer.capacity());
        byteBuffer.put((byte)10);
        byteBuffer.put((byte)20);
        byteBuffer.put((byte)30);
        byteBuffer.put((byte)40);
        System.out.println("添加四个之后当前ByteBuffer缓冲区的内容"+Arrays.toString(byteBuffer.array()));

        System.out.println("加四个之后当前ByteBuffer缓冲区的容量"+byteBuffer.capacity());
    }


    /**
     * 获取和设置ByteBuffer的limit
     */
    @Test
    public void testByteBufferLimit(){

        //ByteBuffer初始化之后limit=capacity
        System.out.println("ByteBuffer初始化之后的capacity是"+byteBuffer.capacity());
        System.out.println("ByteBuffer初始化之后的limit是"+byteBuffer.limit());


        byteBuffer.put((byte)10);
        byteBuffer.put((byte)20);
        byteBuffer.put((byte)30);
        byteBuffer.put((byte)40);
        System.out.println("添加四个之后当前ByteBuffer缓冲区的内容"+Arrays.toString(byteBuffer.array()));

        byteBuffer.limit(6);

        byteBuffer.put((byte)50);
        byteBuffer.put((byte)60);
        System.out.println("添加2个之后当前ByteBuffer缓冲区的内容"+Arrays.toString(byteBuffer.array()));
        System.out.println("添加2个元素之后ByteBuffer的limit是"+byteBuffer.limit());
        //此处会发生java.nio.BufferOverflowException异常，ByteBuffer操作的位置只能在limit之前
        //这里就是ByteBuffer操作的位置只能小于6
        byteBuffer.put((byte)70);
        System.out.println("添加1个之后当前ByteBuffer缓冲区的内容"+Arrays.toString(byteBuffer.array()));

    }


    /**
     * 获取和设置ByteBuffer的position
     *
     * ByteBuffer操作的数据都是在position到limit之前的
     * position等于limit以后，不能写数据
     */
    @Test
    public void testByteBufferPosition(){
        //position是0 limit=capacity=10
        System.out.println("ByteBuffer初始化之后的capacity是"+byteBuffer.capacity());
        System.out.println("ByteBuffer初始化之后的limit是"+byteBuffer.limit());
        System.out.println("ByteBuffer初始化之后的position是"+byteBuffer.position());

        byte[] bytes={65,66,67};
        byteBuffer.put(bytes);
        System.out.println("添加3个之后当前ByteBuffer缓冲区的内容"+Arrays.toString(byteBuffer.array()));

        System.out.println("ByteBuffer添加3个元素之后的capacity是"+byteBuffer.capacity());
        System.out.println("ByteBuffer添加3个元素之后的limit是"+byteBuffer.limit());
        System.out.println("ByteBuffer添加3个元素之后的position是"+byteBuffer.position());


        byteBuffer.limit(6);
        byteBuffer.put((byte)97);
        byteBuffer.put((byte)98);
        byteBuffer.put((byte)99);
        System.out.println("添加3个之后当前ByteBuffer缓冲区的内容"+Arrays.toString(byteBuffer.array()));
        System.out.println("ByteBuffer添加3个元素之后的capacity是"+byteBuffer.capacity());
        System.out.println("ByteBuffer添加3个元素之后的limit是"+byteBuffer.limit());
        System.out.println("ByteBuffer添加3个元素之后的position是"+byteBuffer.position());
        //此处会引发java.nio.BufferOverflowException
        byteBuffer.put((byte)100);
    }


    /**
     * position的标记和重置
     */
    @Test
    public void testByteBufferMarkReset(){

        byteBuffer.put((byte) 10);
        //此时标记position为1
        byteBuffer.mark();

        System.out.println("添加一个元素之后当前ByteBuffer的positions是"+byteBuffer.position());

        byteBuffer.put((byte) 20);
        byteBuffer.put((byte) 30);
        byteBuffer.put((byte) 40);
        System.out.println("添加3个元素之后当前ByteBuffer的positions是"+byteBuffer.position());

        byteBuffer.reset();
        System.out.println("重置之后当前ByteBuffer的positions是"+byteBuffer.position());
    }


    /**
     * 还原ByteBuffer
     */
    @Test
    public void testByteBufferClear(){
        System.out.println("初始化ByteBuffer之后");
        System.out.println("ByteBuffer的capacity是"+byteBuffer.capacity());
        System.out.println("ByteBuffer的position是"+byteBuffer.position());
        System.out.println("ByteBuffer的limit是"+byteBuffer.limit());


        byteBuffer.put((byte) 20);
        byteBuffer.put((byte) 30);
        byteBuffer.put((byte) 40);
        System.out.println("添加3个元素之后");
        System.out.println("ByteBuffer的capacity是"+byteBuffer.capacity());
        //添加元素之后position是3
        System.out.println("ByteBuffer的position是"+byteBuffer.position());
        System.out.println("ByteBuffer的limit是"+byteBuffer.limit());

        byteBuffer.limit(8);
        System.out.println("limit设置成8之后");
        System.out.println("ByteBuffer的capacity是"+byteBuffer.capacity());
        //添加元素之后position是3
        System.out.println("ByteBuffer的position是"+byteBuffer.position());
        //修改limit之后limit是8
        System.out.println("ByteBuffer的limit是"+byteBuffer.limit());


        byteBuffer.clear();
        System.out.println("还原ByteBuffer之后");
        //capacity,position和limit的结果和初始化的时候是一样的
        //position是0，limit=capacity=10
        System.out.println("ByteBuffer的capacity是"+byteBuffer.capacity());
        System.out.println("ByteBuffer的position是"+byteBuffer.position());
        System.out.println("ByteBuffer的limit是"+byteBuffer.limit());


    }


    /**
     * ByteBuffer的翻转
     */
    @Test
    public void testByteBufferFlip(){
        System.out.println("初始化ByteBuffer之后");
        System.out.println("ByteBuffer的capacity是"+byteBuffer.capacity());
        System.out.println("ByteBuffer的position是"+byteBuffer.position());
        System.out.println("ByteBuffer的limit是"+byteBuffer.limit());


        byteBuffer.put((byte) 20);
        byteBuffer.put((byte) 30);
        byteBuffer.put((byte) 40);
        System.out.println("添加3个元素之后");
        System.out.println("ByteBuffer的capacity是"+byteBuffer.capacity());
        //添加元素之后position是3
        System.out.println("ByteBuffer的position是"+byteBuffer.position());
        System.out.println("ByteBuffer的limit是"+byteBuffer.limit());


        byteBuffer.limit(8);
        System.out.println("limit设置成8之后");
        System.out.println("ByteBuffer的capacity是"+byteBuffer.capacity());
        //添加元素之后position是3
        System.out.println("ByteBuffer的position是"+byteBuffer.position());
        //修改limit之后limit是8
        System.out.println("ByteBuffer的limit是"+byteBuffer.limit());


        byteBuffer.flip();
        System.out.println("ByteBuffer翻转之后");
        //position是0，limit等于position，也就是limit=3,capacity=10
        System.out.println("ByteBuffer的capacity是"+byteBuffer.capacity());
        System.out.println("ByteBuffer的position是"+byteBuffer.position());
        System.out.println("ByteBuffer的limit是"+byteBuffer.limit());

    }





























}
