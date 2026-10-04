package net.ittimeline.java.core.foundational.syntax.data.type.primitive;

/**
 * 单精度浮点类型在内存中的存储
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/4 10:22
 * @since Java 25
 */
public class FloatTypeStorage {
    static void main() {
        showFloatBinary(3.625f);
        showFloatBinary(-3.625f);
        showFloatBinary(0.9f);

    }

    /**
     * 查看单精度浮点类型在内存中的存储
     *
     * @see Float#floatToIntBits(float) ：将 float的二进制位模式转换为 int形式（IEEE 754 标准）
     * @see Integer#toBinaryString(int)：将整数转换为二进制字符串（不带前导零）。
     * @see String#format(String, Object...) ：使用指定的格式字符串和参数返回一个格式化后的字符串
     */
    static void showFloatBinary(float value) {
        // 将float转换为int位表示
        int intBits = Float.floatToIntBits(value);

        // 转换为32位二进制字符串
        String binaryString = Integer.toBinaryString(intBits);

        // 补全到32位（如果前面有0被省略）
        binaryString = String.format("%32s", binaryString).replace(' ', '0');

        System.out.println("********************************浮点数: " + value + "********************************");
        System.out.println("IEEE 754二进制表示: " + binaryString);
        System.out.println("格式: 1位符号位 | 8位指数位 | 23位尾数位");

        // 分解各部分
        String signBit = binaryString.substring(0, 1);
        String exponentBits = binaryString.substring(1, 9);
        String mantissaBits = binaryString.substring(9, 32);

        System.out.println("符号位 (1位): " + signBit);
        System.out.println("指数位 (8位): " + exponentBits);
        System.out.println("尾数位 (23位): " + mantissaBits);
    }
}
