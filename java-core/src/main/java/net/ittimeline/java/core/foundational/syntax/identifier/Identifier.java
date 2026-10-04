package net.ittimeline.java.core.foundational.syntax.identifier;

/**
 * 标识符使用
 * 1. 什么是标识符
 *    凡是程序员在源文件中可以自己命名的单词都是标识符
 * 2. 标识符可以标识什么？
 *    类名、方法名、变量名、接口名、包名、枚举名、注解名
 * 3. 标识符的命名规则（必须遵守，否则编译器会报错）
 *    3.1 标识符只能由数字、字母（中、日、韩、英）、_下划线、$美元符号 组成，不能含有其他字符
 *    3.2 标识符不能以数字开头
 *    3.3 关键字不能作为标识符，例如public class等等，关键字具有特殊含义
 *    3.4 严格区分大小写
 * 4. 标识符的命名规范（最好这样做） 国内的开发遵循阿里巴巴开发规范
 *      4.1 见名知意思
 *      4.2 遵循驼峰命名方式（立即就能看出来这个标识符有几个单词组成）
 *      4.3 类名、接口名命名规范：首字母大写，后面每个单词的首字母大写，例如UserInfo,UserService
 *      4.4 变量名、方法名命名规范：首字母小写，后面每个单词首字母大写，例如name，age,getMax
 *      4.5 常量名命名规范：全部大写，单词间用下划线分隔，例如MAX_AGE,DEFAULT_PASSWORD
 *      4.6 包名单词全部小写，多级包之间使用.隔开
 * @author tony 18601767221@163.com
 * @version 2026/10/3 13:32
 * @since Java 25
 */
public class Identifier {
    /**
     * main方法也是一个方法名，入口方法，JVM规定好的，是标识符，但是不能随便写
     * args 是main方法的形参名，可以随便写
     */
    static void main(String[]args) {

    }
}
/********************************类的命名规则和命名规范********************************/
class UserInfo {
    /********************************常量的命名规则和命名规范********************************/
    public static final String DEFAULT_PASSWORD = "111111";

    /********************************属性(实例变量)的命名规则和命名规范********************************/
    private String userName;
    private String password;

    /********************************方法的命名规则和命名规范********************************/

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}