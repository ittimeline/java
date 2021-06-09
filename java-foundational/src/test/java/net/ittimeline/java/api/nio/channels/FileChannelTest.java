package net.ittimeline.java.api.nio.channels;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * FileChannel的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/6/7 14:07
 * @since JDK11
 */
public class FileChannelTest {


    /**
     * FileChannel的获取
     */
    @Test
    public void testGeFileChannel(){
        try(
                FileInputStream fileInputStream=new FileInputStream("D:\\nio\\data.txt");
                FileOutputStream fileOutputStream=new FileOutputStream("D:\\nio\\data_copy.txt");

                final FileChannel readChannel = fileInputStream.getChannel();
                final FileChannel writeChannel = fileOutputStream.getChannel();
        ){

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    /**
     * 使用FileChannel和ByteBuffer实现拷贝文件
     */
    @Test
    public void testFileChannelWithByteBufferFileCopy(){

        try(
                FileInputStream fileInputStream=new FileInputStream("D:\\nio\\data.txt");
                FileOutputStream fileOutputStream=new FileOutputStream("D:\\nio\\data_copy.txt");

                final FileChannel readChannel = fileInputStream.getChannel();
                final FileChannel writeChannel = fileOutputStream.getChannel();
        ){

            ByteBuffer byteBuffer=ByteBuffer.allocate(8192);
            System.out.println("读取文件之前ByteBuffer的 position是"+byteBuffer.position()+"limit是"+byteBuffer.limit());

            while(readChannel.read(byteBuffer)!=-1){
                System.out.println("flip之前 ByteBuffer的 position是"+byteBuffer.position()+"limit是"+byteBuffer.limit());
                //flip就是将position改为0，将limit改成flip之前position的值
                byteBuffer.flip();
                System.out.println("flip之后/write之前 ByteBuffer的 position是"+byteBuffer.position()+"limit是"+byteBuffer.limit());
                writeChannel.write(byteBuffer);
                System.out.println("clear之前/write之后 ByteBuffer的 position是"+byteBuffer.position()+"limit是"+byteBuffer.limit());
                //clear就是将position改为0，将limit改成capacity的值
                byteBuffer.clear();
                System.out.println("clear之后 ByteBuffer的 position是"+byteBuffer.position()+"limit是"+byteBuffer.limit());
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }


    /**
     * 使用FileChannel和MappedByteBuffer实现拷贝文件
     * 拷贝的文件必须小于2GB
     */
    @Test
    public void testFileChannelMappedByteBufferFileCopyLessThan2GB(){
        try(
                RandomAccessFile readRandomAccessFile =new RandomAccessFile("D:\\nio\\java.pdf","r");
                RandomAccessFile writeRandomAccessFile=new RandomAccessFile("D:\\nio\\java_copy.pdf","rw");
                final FileChannel readFileChannel = readRandomAccessFile.getChannel();
                final FileChannel writeFileChannel = writeRandomAccessFile.getChannel()
        ){

            //java.pdf文件的大小
            long fileSize=readFileChannel.size();
            System.out.println("java.pdf文件的大小是"+fileSize/1024/1024+"MB");

            MappedByteBuffer readMappedByteBuffer= readFileChannel.map(FileChannel.MapMode.READ_ONLY,0,fileSize);

            MappedByteBuffer writeMappedByteBuffer= writeFileChannel.map(FileChannel.MapMode.READ_WRITE,0,fileSize);

            for (long i = 0; i < fileSize; i++) {
                final byte data = readMappedByteBuffer.get();
                writeMappedByteBuffer.put(data);
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }


    /**
     * FileChannel和MappedByteBuffer实现2GB以上的文件拷贝
     */
    @Test
    public void testFileChannelMappedByteBufferFileCopyMoreThan2GB(){


        try(
                RandomAccessFile readRandomAccessFile =new RandomAccessFile("D:\\nio\\office.iso","r");
                RandomAccessFile writeRandomAccessFile=new RandomAccessFile("D:\\nio\\office_copy.iso","rw");
                final FileChannel readFileChannel = readRandomAccessFile.getChannel();
                final FileChannel writeFileChannel = writeRandomAccessFile.getChannel()
        ){

            //文件的总大小
            final long fileSize = readFileChannel.size();

            //每次拷贝1GB
            long everySize=1L*1024*1024*1024;

            long maxSize=2L*1024*1024*1024;

            long copyCount=1;

            //文件超过2GB
            if(fileSize>=maxSize){
                copyCount=fileSize%everySize==0?fileSize/everySize:fileSize/everySize+1;
            }
            System.out.println("文件拷贝的次数是"+copyCount);

            //循环拷贝
            for (long i = 0; i < copyCount; i++) {
                //从哪里开始拷贝
                long currentStartCopyPosition=i*everySize;
                System.out.println("当前循环文件拷贝的位置是"+currentStartCopyPosition);
                
                //实际拷贝的大小
                long actualCopySize=fileSize-currentStartCopyPosition>=everySize?everySize:fileSize-currentStartCopyPosition;
                System.out.println("当前循环实际拷贝的大小是"+actualCopySize+"字节");



                MappedByteBuffer readMappedByteBuffer= readFileChannel.map(FileChannel.MapMode.READ_ONLY,currentStartCopyPosition,actualCopySize);

                MappedByteBuffer writeMappedByteBuffer= writeFileChannel.map(FileChannel.MapMode.READ_WRITE,currentStartCopyPosition,actualCopySize);

                for (long j = 0; j < actualCopySize; j++) {
                    final byte data = readMappedByteBuffer.get();
                    writeMappedByteBuffer.put(data);
                }

                
            }



        }catch(IOException e){
            e.printStackTrace();
        }
    }












}
