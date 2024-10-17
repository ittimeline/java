package net.ittimeline.java.core.foundational.control.loop.nestedloop;

/**
 * 百鸡百钱
 * 需求：百鸡百钱：花光100文钱买100只鸡
 * ● 公鸡 5文钱一只 最少0只，最多20只
 * ● 母鸡 3文钱一只 最少0只，最多33只
 * ● 小鸡 1文钱三只 最多100只
 * 分析
 * 百鸡：公鸡的数量+母鸡的数量+小鸡的数量=100只
 * 百钱注意事项：
 * ● 不能有浮点数参与运算，因为花光100文钱
 * ● 小鸡的数量必须是3的倍数，例如小鸡的数量是75，75只小鸡花的钱是75/3=25文钱
 * ● 小鸡花的钱=小鸡的数量/3
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/17 22:00
 * @since Java21
 */
public class HundredChickensHundredDollars {
    public static void main(String[] args) {
        //公鸡 5文钱一只 最少0只，最多20只
        for (int roosterCount = 0; roosterCount <= 20; roosterCount++) {
            // 母鸡 3文钱一只 最少0只，最多33只
            for (int henCount = 0; henCount <= 33; henCount++) {
                //小鸡 1文钱三只
                //小鸡的数量
                int chick = 100 - roosterCount - henCount;
                //小鸡的钱
                int chickDollars = chick / 3;
                //百鸡： 公鸡的数量+母鸡的数量+小鸡的数量=100只 并且小鸡的数量必须是3的倍数
                boolean isHundredChicken = roosterCount + henCount + chick == 100 && chick % 3 == 0;
                //百钱：公鸡的数量*5+母鸡的数量*3+小鸡的数量/3=100文钱
                boolean isHundredDollars = roosterCount * 5 + henCount * 3 + chickDollars == 100;
                if (isHundredChicken && isHundredDollars) {
                    System.out.printf("公鸡的数量是%d 母鸡的数量是%d 小鸡的数量是%d\n", roosterCount, henCount, chick);
                }
            }
        }
    }
}
