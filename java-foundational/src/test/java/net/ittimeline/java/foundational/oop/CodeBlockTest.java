package net.ittimeline.java.foundational.oop;

/**
 * 代码块测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/20 7:58
 * @since JDK11
 */
public class CodeBlockTest {


    /**
     * 演示局部代码块
     */
    static void localCodeBlock(){
        int number =10;
        {
            int value =20;
            System.out.println("value = "+value);
        }
        System.out.println("number ="+number);
    }



    public static void main(String[] args) {
        Window window3=new Window("window3");
        House house=new House(window3);
        System.out.println("当前房屋的窗户数量是"+Window.getWindowCount());

        localCodeBlock();

    }
}

class House{
    static Window window1;

    Window window2;

    final Window window3;



    //静态代码块
    static{
        System.out.println("1.在静态代码块中初始化第一块窗户");
        window1=new Window("window1");
        System.out.println(window1);
    }

    //构造代码块
    {
        System.out.println("2.在构造代码块中初始化第一块窗户");
        window2=new Window("window2");
        System.out.println(window2);

    }



    public House(Window window3){
        System.out.println("3.在构造方法中初始化第三块窗户");
        this.window3=window3;
        System.out.println(window3);
    }



}

class Window{

    /**
     * 统计窗户的数量
     */
    private static int windowCount;


    /**
     * 窗户名称
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //构造代码块
     {
          windowCount++;
    }


    /**
     * 获取当前房屋的窗户数量
     * @return
     */
    public static int getWindowCount(){
        return windowCount;
    }


    public Window() {

    }


    public Window(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "房屋的窗户信息{" +
                "窗户名称:'" + name + '\'' +
                '}';
    }




}