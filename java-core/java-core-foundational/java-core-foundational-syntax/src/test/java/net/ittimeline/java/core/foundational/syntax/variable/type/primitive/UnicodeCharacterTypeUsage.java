package net.ittimeline.java.core.foundational.syntax.variable.type.primitive;

/**
 * Unicode字符集字符的使用
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/15 8:56
 * @since Java21
 */
public class UnicodeCharacterTypeUsage {
    public static void main(String[] args) {
        //Unicode字符集字符类型字面量的三种表现方式
        // 测试数据：中文字符'刘'
        //方式1.使用一对单引号('')包含的单个字符
        char familyNameWay1 = '刘';
        System.out.println("familyNameWay1 = " + familyNameWay1);
        //方式2.直接使用十进制Unicode字符集编号
        // (int) '刘' 表示将字符强制转换为int类型，以此获取字符对应的Unicode字符集的编码值
        System.out.println("字符刘的Unicode字符集编号是" + (int) '刘');
        char familyNameWay2 = 21016;
        System.out.println("familyNameWay2 = " + familyNameWay2);

        //方式3.直接使用十六进制Unicode字符集编号
        //字符刘的十六进制Unicode字符集编号是'\u5218'
        char familyNameWay3 = '\u5218';
        System.out.println("familyNameWay3 = " + familyNameWay3);

        //Unicode支持全世界所有国家的字符，例如俄文，韩文等等
        //俄文的你好是Привет
        char helloRussianFirstLetter = 'П';
        char helloRussianSecondLetter = 'р';
        char helloRussianThirdLetter = 'и';
        char helloRussianFourthLetter = 'в';
        char helloRussianFifthLetter = 'е';
        char helloRussianSixthLetter = 'т';
        System.out.println("俄文的你好是" +
                helloRussianFirstLetter + helloRussianSecondLetter + helloRussianThirdLetter + helloRussianFourthLetter
                + helloRussianFifthLetter + helloRussianSixthLetter);

        //韩文的你好是안녕하세
        char helloKoreanFirstLetter = '안';
        char helloKoreanSecondLetter = '녕';
        char helloKoreanThirdLetter = '하';
        char helloKoreanFourthLetter = '세';
        System.out.println("韩语的你好是" +
                helloKoreanFirstLetter + helloKoreanSecondLetter + helloKoreanThirdLetter + helloKoreanFourthLetter);
    }
}
