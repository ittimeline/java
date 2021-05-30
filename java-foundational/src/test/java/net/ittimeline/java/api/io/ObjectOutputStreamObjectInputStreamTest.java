package net.ittimeline.java.api.io;

import net.ittimeline.java.foundational.oop.Cellphone;
import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Java语言的序列化和反序列化机制的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/5/30 10:34
 * @since JDK11
 */
public class ObjectOutputStreamObjectInputStreamTest {

    static final String path = "D:\\io\\cellphone.txt";


    /**
     * 通过ObjectOutputStream的writeObject()方法实现对象的序列化机制
     * 实现Cellphone对象的序列化，将Cellphone对象以字节的形式写到cellphone.txt文件中
     * Cellphone对象的数据都会以字节的方式存储到cellphone.txt文件中
     */
    @Test
    public void testObjectOutputStreamWriteObject() {
        Cellphone cellphone = new Cellphone();
        cellphone.setPrice(8888);
        cellphone.setColor("黑色");
        cellphone.setWeight(228);
        cellphone.setModel("华为P50 pro plus");
        cellphone.setBrand("华为");

        try (
                OutputStream outputStream = new FileOutputStream(path);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        ) {
            objectOutputStream.writeObject(cellphone);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    /**
     * ObjectInputStream实现反序列化
     * 通过ObjectInputStream读取cellphone.txt文件中存储的字节信息转换为Cellphone对象
     */
    @Test
    public void testObjectInputStreamReadObject() {

        try (
                InputStream inputStream = new FileInputStream(path);
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        ) {
            Object object = objectInputStream.readObject();
            if (object instanceof Cellphone) {
                Cellphone cellphone = (Cellphone) object;
                System.out.println(cellphone);
            }


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    /**
     * 集合的序列化和反序列化
     */
    @Test
    public void testCollectionSerializationDeserialization(){

        List<Cellphone> cellphoneList=new ArrayList<>();
        Cellphone huawei = new Cellphone();
        huawei.setPrice(8888);
        huawei.setColor("黑色");
        huawei.setWeight(228);
        huawei.setModel("华为P50 pro plus");
        huawei.setBrand("华为");

        Cellphone apple = new Cellphone();
        apple.setPrice(12999);
        apple.setColor("黑色");
        apple.setWeight(228);
        apple.setModel("iphone13 pro max");
        apple.setBrand("苹果");

        Cellphone samsung = new Cellphone();
        samsung.setPrice(11999);
        samsung.setColor("黑色");
        samsung.setWeight(228);
        samsung.setModel("三星S22 ultra");
        samsung.setBrand("三星");

        cellphoneList.add(huawei);
        cellphoneList.add(apple);
        cellphoneList.add(samsung);


        try(
                OutputStream outputStream=new FileOutputStream("D:\\io\\collection.txt");
                ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);

                InputStream inputStream=new FileInputStream("D:\\io\\collection.txt");
                ObjectInputStream objectInputStream=new ObjectInputStream(inputStream);
        ){

            //序列化集合
            objectOutputStream.writeObject(cellphoneList);

            Object object = objectInputStream.readObject();
            if (object instanceof List){
                List<Cellphone> deserializationCellphoneList= (List<Cellphone>)object;
                System.out.println("反序列化集合之后的结果:");
                for (Cellphone cellphone : deserializationCellphoneList) {
                    System.out.println(cellphone);
                }
            }

        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }












}
