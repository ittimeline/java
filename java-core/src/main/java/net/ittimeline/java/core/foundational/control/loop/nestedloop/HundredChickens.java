package net.ittimeline.java.core.foundational.control.loop.nestedloop;

/**
 * 嵌套循环案例7-百鸡百钱
 * 需求：百鸡百钱：花光100文钱买100只鸡
 * ● 公鸡 5文钱一只 最少0只，最多20只
 * ● 母鸡 3文钱一只 最少0只，最多33只
 * ● 小鸡 1文钱三只，最多100只
 * 分析
 * 百鸡：公鸡的数量+母鸡的数量+小鸡的数量=100只
 * 百钱：公鸡的数量*5+母鸡的数量*3+小鸡的数量/3=100文钱
 * 注意事项：
 * ● 不能有浮点数参与运算，因为花光100文钱
 * ● 小鸡的数量必须是3的倍数，例如小鸡的数量是75，75只小鸡花的钱是75/3=25文钱
 * ● 小鸡花的钱=小鸡的数量/3
 *
 * @author tony 18601767221@163.com
 * @version 2026/10/7 14:46
 * @since Java 25
 */
public class HundredChickens {
    static void main() {
        //穷举所有可能的公鸡和母鸡数量组合，再通过总数量推算出小鸡数量，然后验证是否满足总钱数为100文
        //公鸡 5文钱一只 最少0只，最多20只
        for (int roosterCount = 0; roosterCount <= 20; roosterCount++) {
            //母鸡 3文钱一只 最少0只，最多33只
            for (int henCount = 0; henCount <= 33; henCount++) {
                //小鸡 1文钱三只
                //小鸡的数量
                int chickCount = 100 - roosterCount - henCount;
                //小鸡的钱
                int chickCoins = chickCount / 3;
                //百鸡：公鸡的数量+母鸡的数量+小鸡的数量=100只
                boolean isHundredChicken = roosterCount + henCount + chickCount == 100 && chickCount % 3 == 0;
                //百钱：公鸡的数量*5+母鸡的数量*3+小鸡的数量/3=100文钱
                boolean isHundredCoins = roosterCount * 5 + henCount * 3 + chickCount / 3 == 100;
                //百鸡百钱
                if (isHundredChicken && isHundredCoins) {
                    System.out.printf("公鸡的数量是%d 母鸡的数量是%d 小鸡的数量是%d\n", roosterCount, henCount, chickCount);
                }
            }
        }
    }
}
