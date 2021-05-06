package net.ittimeline.java.api.lang;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * 字符串构造方法和常用方法的测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/28 10:55
 * @since JDK11
 */
public class StringTest {

    /**
     * String对象创建的几种方式
     */
    @Test
    public void testStringInstance(){
        // 方式1:直接使用字面值创建String对象
        String str1="abc";
        System.out.println("str1 = "+str1);

        //"" 表示空字符串
        //方式2 使用指定的字符串来创建String对象
        String str2=new String("");
        System.out.println("Hello"+str2+"World");

        // 方式3：使用字符数组创建String对象
        char[] chars={'a','b','c','d'};
        String str3=new String(chars);
        System.out.println("str3 = "+str3);

        // 方式4：使用字节数组创建String对象
        // 65表示 字符A
        byte[] bytes={65,66,67,68};
        String str4=new String(bytes);
        System.out.println("str4 = "+str4);

    }

    /**
     * 字符串想等性比较
     */
    @Test
    public  void testStringConstantsEquals(){
        //因为HelloWorld常量只会在常量池存储一份
        String str1="HelloWorld";
        String str2="HelloWorld";
        //因此 str1 == str2的结果是 true
        System.out.println("str1 == str2 = "+(str1 == str2));
        //true
        System.out.println("str1.equals(str2)= "+(str1.equals(str2)));


    }

    /**
     * 字符串变量相等性判断
     */
    @Test
    public void testStringVariableEquals(){
        String str1=new String("HelloWorld");
        String str2=new String("HelloWorld");

        //因为只要new就会开辟新的内存空间，因此地址值肯定不相等,因此输出结果是false
        System.out.println("str1 == str2 = "+(str1 == str2));
        System.out.println("str1对象的哈希值: "+(str1.hashCode()));
        System.out.println("str2对象的哈希值:"+(str2.hashCode()));
        //equals()比较的是内容，因此结果是true
        System.out.println("str1.equals(str2)= "+(str1.equals(str2)));
    }

    /**
     * 字符串相等性判断
     */
    @Test
    public void testStringConstantVariableEquals(){
        // 常量区
        String str1="HelloWorld";
        //堆区
        String str2=new String("HelloWorld");

        //false
        System.out.println("str1 == str2 = "+(str1 == str2));
        //true
        System.out.println("str1.equals(str2)= "+(str1.equals(str2)));

    }


    @Test
    public void testStringLength(){
        String str="跟光磊学Java";
        System.out.println(str+"的字符串长度是"+str.length());
    }

    /**
     * 字符串拼接的使用
     */
    @Test
    public void testStringConcat(){
        String str="跟光磊学";
        String desc = str.concat("Java");
        System.out.println(str+"拼接Java之后的结果是"+desc);

        //concat()方法等价于字符串拼接的+
        String str2="跟光磊学";
        str2+="Java";
        System.out.println("str2 ="+str2);

    }

    /**
     * 获取字符串中指定索引的字符
     */
    @Test
    public void testStringCharAt(){
        String str="跟光磊学Java";
        System.out.println(str+"第一个字符是"+str.charAt(0));
        System.out.println(str+"最后一个字符是"+str.charAt(str.length()-1));

    }


    /**
     * 字符串反转
     */
    @Test
    public void testStringInversion(){
        String str="abc";
        System.out.println("反转之前 字符串的内容是"+str);
        String inversionResult = inversion(str);
        System.out.println("反转之后 字符串的内容是"+inversionResult);

    }


    /**
     * 反转字符串
     * @param str
     * @return
     */
    public String inversion(String str){
        String newStr="";
        for (int i = str.length()-1; i>=0; i--) {
            char ch = str.charAt(i);
            newStr+=ch;
        }
        return newStr;
    }


    /**
     * 数组转换成字符串测试
     */
    @Test
    public void testArrayToString(){
        int[] array={1,2,3};
        System.out.println(arrayToString(array));

    }


    /**
     * 将数组转换为字符串
     * @see java.util.Arrays#toString(int[])  [1,2,3]
     * @param array
     * @return
     */
    public String  arrayToString(int[]array){
        String str ="[";
        if(array.length==0){
            return "[]";
        }
        for (int i = 0; i < array.length; i++) {
            if(i<array.length-1){
                //不是最后的数字就拼接数字和逗号
                str+=array[i]+",";
            }else if(i<array.length){
                //如果是最后一个数字拼接数字和]
                str+=array[i]+"]";

            }
        }


        return str;
    }


    /**
     *  查指定子字符串在父字符串中第一次出现的索引
     *  查指定子字符串在父字符串中最后一次出现的索引
     */
    @Test
    public void testStringIndexOfLastIndexOf(){

        String findStr="java";
        String str="跟光磊学Java";
        int index = str.indexOf("Java");
        System.out.println(findStr+"在"+str+"第一次出现的索引是"+index);

        findStr="a";
        int firstIndex=str.indexOf("a");
        System.out.println(findStr+"在"+str+"第一次出现的索引是"+firstIndex);


        int secondIndex=str.indexOf(findStr,firstIndex+1);
        System.out.println(findStr+"在"+str+"第二次出现的索引是"+secondIndex);


        int lastIndex = str.lastIndexOf("a");
        System.out.println(findStr+"在"+str+"最后一次出现的索引是"+lastIndex);


    }

    /**
     * 字符串截取
     */
    @Test
    public void testStringSubString(){
        String str="跟光磊学Java";
        String subResult = str.substring(4);
        System.out.println(str+"从4号索引开始截取的结果是"+subResult);

        // 不包含结束结束索引的元素，但是包含开始索引的元素
        subResult=str.substring(0,4);
        System.out.println(str+"从0号索引开始截取,截取到4号索引的结果是"+subResult);


    }


    /**
     * equalsIgnoreCase()方法比较字符串时忽略大小写
     */
    @Test
    public void testStringEqualsIgnoreCase(){
        String str1="跟光磊学Java";
        String str2="跟光磊学java";
        //false
        System.out.println("str1.equals(str2) = "+str1.equals(str2));
        //true
        System.out.println("str1.equalsIgnoreCase(str2) = "+str1.equalsIgnoreCase(str2));


    }

    /**
     * 字符串的非空判断
     * 字符串的空格判断
     */
    @Test
    public void testStringIsEmptyIsBlank(){
        //空字符串
        String str1="";
        //null 可以赋值所有的引用数据类型，null表示空，但是具体的含义是对象没有在堆内存分配内存空间，也没有存储对象的数据。
        String str2=null;

        //true
        System.out.println("str1.isEmpty() = "+str1.isEmpty());
        //NullPointerException
        //System.out.println("str2.isEmpty() = "+str2.isEmpty());

        // str3存储的是空格
        String str3=" ";
        //false 空格不是空
        System.out.println("str3.isEmpty() = "+str3.isEmpty());
        //true
        System.out.println("str3.isBlank() = "+str3.isBlank());

    }


    /**
     *  contains()方法用于判断str1是否包含str2
     */
    @Test
    public void testStringContains(){
        //父串
        String str1="跟光磊学Java";
        //子串
        String str2="Java";
        //形参多态
        System.out.println("str1.contains(str2) = "+str1.contains(str2));
    }


    /**
     * contains()方法和replace()方法的结合使用
     */
    @Test
    public void testStringContainsReplace(){
        String message="我的密码是:666666";
        System.out.println("替换之前消息的内容是"+message);

        if (message.contains("密码")){
            //脱敏
            String replaceResult = message.replace("6", "*");
            System.out.println("替换之后消息的内容是"+replaceResult);
        }

    }

    /**
     * endsWith()方法判断字符串是否以指定的后缀结尾
     *
     * startWith()方法判断字符串是否以指定的前缀开头
     */
    @Test
    public  void testStringStartWithEndsWith(){
        String fileName="StringTest.java";
        String prefix="String";
        boolean startsWith = fileName.startsWith(prefix);
        System.out.println(fileName+"是否以"+prefix+"开头"+startsWith);

        String suffix=".java";
        System.out.println(fileName+"是否以"+suffix+"结尾"+ fileName.endsWith(suffix));
        suffix=".txt";
        System.out.println(fileName+"是否以"+suffix+"结尾"+ fileName.endsWith(suffix));


    }


    /**
     * 字母的大小写转换
     */
    @Test
    public  void testStringToUpperCaseToLowerCase(){
        String str="Java,Python,Go";
        System.out.println(str+"转换大写之后的结果是"+str.toUpperCase());
        System.out.println(str+"转换小写之后的结果是"+str.toLowerCase());
    }


    /**
     * 字符串转字符数组
     * 字符串转字节数组
     */
    @Test
    public void testStringToCharArrayGetBytes(){

        String str ="Hello World";

        //将字符串转换为字符数组
        char[] chars = str.toCharArray();

        // 普通for循环
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }

        System.out.println();

        //增强for循环 JDK1.5+
        for (char ch : chars) {
            System.out.print(ch);

        }

        System.out.println();

        //将字符串转成对应存储的编码值
        byte[] bytes = str.getBytes();

        System.out.println("HelloWorld转换成字节数组的结果是");
        for (byte b : bytes) {
            System.out.print(b+" ");

        }



    }


    /**
     * trim()方法 去除空格
     */
    @Test
    public void testStringTrim(){
        String str=" Hello World ";
        System.out.println("去除空格前字符串的内容是"+str);
        String trimResult = str.trim();
        System.out.println("去除空格后字符串的内容是"+trimResult);

    }


    /**
     * split() 按照指定的规则切割字符串，返回字符串数组
     */
    @Test
    public void testStringSplit(){
        String str="Java,Go,Python";
        System.out.println("切割之前字符串的内容"+str);

        String[] splitResult = str.split(",");

        System.out.print("切割之后的字符串数组");

        for (String language : splitResult) {
            System.out.print(language+" ");

        }
        str="Java.Go.Python";
        splitResult = str.split("\\.");
        System.out.print("切割之后的字符串数组");

        for (String language : splitResult) {
            System.out.print(language+" ");

        }

    }














}
