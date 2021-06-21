package net.ittimeline.java.api.util.regex;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * 正则表达式的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/6/21 8:48
 * @since JDK11
 */

public class RegexTest {


    public static void main(String[] args) {


        System.out.println("---------------------不使用正则表达式验证QQ号---------------------");
        validationQQWithoutRegex(null);
        validationQQWithoutRegex("");
        validationQQWithoutRegex("1000x");
        validationQQWithoutRegex("01234");
        validationQQWithoutRegex("10000");
        System.out.println("---------------------使用正则表达式验证QQ号---------------------");
        System.out.println(validationQQWithRegex(null));
        System.out.println(validationQQWithRegex(""));
        System.out.println(validationQQWithRegex("1000x"));
        System.out.println(validationQQWithRegex("01234"));
        System.out.println(validationQQWithRegex("10000"));


    }


    /**
     * 不使用正则表达式验证QQ号
     * 1. QQ号不能为空
     * 2. QQ号长度是5-12位
     * 3. QQ号必须全是数字
     * 4. QQ号不能以0开头
     *
     * @param qq
     * @return true表示合法 false表示非法
     */
    public static boolean validationQQWithoutRegex(String qq) {
        if (null == qq) {
            System.out.println("QQ号校验不通过: QQ号不能为空");
            return false;
        }
        if (qq.length() < 5 || qq.length() > 12) {
            System.out.println("QQ号校验不通过: QQ号长度是5-12位");
            return false;
        }

        for (int i = 0; i < qq.length(); i++) {
            char ch = qq.charAt(i);
            if (!(ch >= 48 && ch <= 57)) {
                System.out.println("QQ号校验不通过: QQ号必须全是数字");
                return false;
            }
        }
        if (qq.charAt(0) != 48) {
            System.out.println("QQ号校验通过");
            return true;
        } else {
            System.out.println("QQ号校验不通过: QQ号不能以0开头");
            return false;
        }
    }


    /**
     * 使用正则表达式校验QQ号
     * 1. QQ号不能为空
     * 2. QQ号长度是5-12位
     * 3. QQ号必须全是数字
     * 4. QQ号不能以0开头
     * @param qq
     * @return true表示合法 false表示非法
     */
    public static boolean validationQQWithRegex(String qq){
        if (null==qq){
            System.out.println("QQ号不能为空");
            return false;
        }
        return qq.matches("[1-9]\\d{4,11}");
    }


    /**
     *  正则表达式的组成-字符类
     */
    @Test
    public void testRegexCharacterClasses(){

        // 匹配单个字符
        System.out.println("验证字符串ead是否以h开头,d结尾，中间是aeiou中的某个字符 ------------>"+"ead".matches("h[aeiou]d"));
        System.out.println("验证字符串had是否以h开头,d结尾，中间是aeiou中的某个字符 ------------>"+"had".matches("h[aeiou]d"));

        //取反
        System.out.println("验证字符串had是否以h开头，d结尾，中间不是aeiou中的某个字符------------>"+"had".matches("h[^aeiou]d"));

        //范围
        System.out.println("验证字符串ead是否以a-z的小写字母开头，后面跟着ad ------------>"+"ead".matches("[a-z]ad"));
        System.out.println("验证字符串Pad是否以a-z的小写字母开头，后面跟着ad ------------>"+"Pad".matches("[a-z]ad"));

        //多个区间范围
        System.out.println("验证字符串ead是否以a-d或者m-p的小写字母开头，后面跟着ad------------>"+"ead".matches("[a-dm-p]ad"));
        System.out.println("验证字符串pad是否以a-d或者m-p的小写字母开头，后面跟着ad------------>"+"pad".matches("[a-dm-p]ad"));



    }

    /**
     * 正则表达式的组成-逻辑运算符
     * 小写的辅音字母 就是除了aeiou以外的小写字母
     */
    @Test
    public void testRegexLogic(){

        //并且
        System.out.println("验证字符串had是否以小写的辅音字母开头，后面跟着ad------------>"+"had".matches("[a-z&&[^aeiou]]ad"));
        System.out.println("验证字符串ead是否以小写的辅音字母开头，后面跟着ad------------>"+"ead".matches("[a-z&&[^aeiou]]ad"));

        // 或者
        System.out.println("验证字符串oad首字母是否包含aeiou，后面跟着ad------------>"+"oad".matches("[a|e|i|o|u]ad"));

    }


    /**
     *  正则表达式的组成-预定义字符
     */
    @Test
    public void testRegexPredefinedCharacterClasses(){

        System.out.println("验证字符串888是否是3个数字-------------->"+"888".matches("\\d\\d\\d"));
        System.out.println("验证字符串88是否是3个数字-------------->"+"88".matches("\\d\\d\\d"));

        System.out.println("验证手机号 18601767221 是否是1开头，第二位是3,5,7,8,9中的一个，" +
                "剩下9位全部是数字----------->"+"18601767221".matches("1[35789]\\d\\d\\d\\d\\d\\d\\d\\d\\d"));
        System.out.println("验证手机号 28601767221 是否是1开头，第二位是3,5,7,8,9中的一个，" +
                "剩下9位全部是数字----------->"+"28601767221".matches("1[35789]\\d\\d\\d\\d\\d\\d\\d\\d\\d"));
        System.out.println("验证手机号 16601767221 是否是1开头，第二位是3,5,7,8,9中的一个，" +
                "剩下9位全部是数字----------->"+"16601767221".matches("1[35789]\\d\\d\\d\\d\\d\\d\\d\\d\\d"));


        System.out.println("验证字符串hud是否是h开头,d结尾，中间是任意字符----------->"+"hud".matches("h.d"));
        System.out.println("验证字符串h*d是否是h开头,d结尾，中间是任意字符----------->"+"h*d".matches("h.d"));
        System.out.println("验证字符串h.d是不是h.d------------->"+"h.d".matches("h\\.d"));




    }

    /**
     * 正则表达式的组成-数量词
     */
    @Test
    public void testRegexQuantifier(){
        System.out.println("验证字符串888是否是3个数字-------------->"+"888".matches("\\d{3}"));
        System.out.println("验证手机号 18601767221 是否是1开头，第二位是3,5,7,8,9中的一个，" +
                "剩下9位全部是数字----------->"+"18601767221".matches("1[35789]\\d{9}"));

        System.out.println("验证QQ号 1079351401是否合法------------->"+"1079351401".matches("[1-9]\\d{4,11}"));


    }


    /**
     * 正则表达式的组成-分组括号
     */
    @Test
    public void testRegexGroupBracket(){
        String str ="1DFXD-VDFS9-F23DF-VESDR-XVD24";
        System.out.println("字符串"+str+"是否满足分组括号的匹配规则------------->"+str.matches("([A-Z0-9]{5}-){4}[A-Z0-9]{5}"));


        //正则表达式(分组括号)匹配叠词

        // 哈哈 嘿嘿 嘻嘻
        //. 表示匹配任意字符
        //(.)表示第一组
        // \\1 表示第一组再出现一次
        System.out.println("叠词哈哈的匹配结果是--------------->"+"哈哈".matches("(.)\\1"));
        System.out.println("叠词嘿嘿的匹配结果是--------------->"+"嘿嘿".matches("(.)\\1"));
        System.out.println("叠词嘻嘻的匹配结果是--------------->"+"嘻嘻".matches("(.)\\1"));

        // 哈哈哈 嘿嘿嘿 嘻嘻嘻
        //\\1{2} 表示\\1出现2次
        System.out.println("叠词哈哈哈的匹配结果是--------------->"+"哈哈哈".matches("(.)\\1{2}"));
        System.out.println("叠词嘿嘿嘿的匹配结果是--------------->"+"嘿嘿嘿".matches("(.)\\1{2}"));
        System.out.println("叠词嘻嘻嘻的匹配结果是--------------->"+"嘻嘻嘻".matches("(.)\\1{2}"));

        // 高高兴兴 红红火火
        // \\1 表示第一组再出现一次
        // \\2 表示第二组再出现一次
        System.out.println("叠词高高兴兴的匹配结果是--------------->"+"高高兴兴".matches("(.)\\1(.)\\2"));
        System.out.println("叠词红红火火的匹配结果是--------------->"+"红红火火".matches("(.)\\1(.)\\2"));
    }


    /**
     * String中正则表达式的使用
     */
    @Test
    public void testRegexStringSplitReplaceAll(){

        String str ="1     2 3 45 6   78 9";
        //将字符串按照1个或者多个空格拆分
        String[] splitResult = str.split(" +");
        System.out.println("将字符串按照1个或者多个空格拆分的结果"+Arrays.toString(splitResult));


        String password="666666";
        //将密码中的内容替换成*
        String replaceAllPassword = password.replaceAll("\\w", "*");
        System.out.println("原密码"+password+"替换之后的结果是"+replaceAllPassword);

        password="123qwe";
        replaceAllPassword = password.replaceAll("\\w", "*");
        System.out.println("原密码"+password+"替换之后的结果是"+replaceAllPassword);


    }







}
