package net.ittimeline.java.core.foundational.syntax.comments;//包定义语句
//类上【文档注释】的使用

/**
 * Java三种注释的使用
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/3 13:21
 * @since Java 25
 */
public class Comments {
    //方法上【文档注释】的使用
    /**
     * main方法是Java程序的入口
     * Java程序是从main方法第一行非注释的代码开始执行
     */
    void main(){
        // 方法中【单行注释】的使用
        // 往终端(控制台)输出Java三种注释的使用并换行
        System.out.println("Java三种注释的使用");

        // 方法中【多行注释】的使用
        /*
            Java程序的开发步骤
            1. 新建项目(Project)
            2. 新建模块(Module)
            3. 新建包(Package)
            4. 新建类(Class)
            5. 运行/调试Java程序
         */
    }
}
