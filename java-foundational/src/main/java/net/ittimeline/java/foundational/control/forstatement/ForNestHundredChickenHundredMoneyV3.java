package net.ittimeline.java.foundational.control.forstatement;

/**
 * 百鸡百钱的第三个版本
 * 公鸡五文钱1只  最多20只
 *
 * 母鸡三文钱1只  最多33只
 *
 * 小鸡一文钱3只  最多100只
 *
 *
 * 小鸡的数量必须是3的倍数
 * 公鸡的数量+母鸡的数量+小鸡的数量=100只鸡
 * 公鸡的数量 *5 + 母鸡的数量 *3 + 小鸡的数量/3=100文钱
 *
 * @author tony 18601767221@163.com
 * @version 2021/3/18 19:04
 * @since JDK11
 */
public class ForNestHundredChickenHundredMoneyV3 {
    public static void main(String[] args) {

        // 打印输出满足百鸡百钱的标题描述
        System.out.println("公鸡的数量\t公鸡的单价\t母鸡的数量\t母鸡的单价\t小鸡的数量\t小鸡的单价");


        int count =0;

        //遍历公鸡
        for (int rooster = 0; rooster <=20 ; rooster++) {

            //遍历母鸡
            for (int hen = 0; hen <=33 ; hen++) {


                int chick=100-rooster-hen;

                count++;

                //百鸡百钱
                if(chick%3==0 && rooster+hen+chick==100 && rooster * 5 + hen * 3 + chick /3 ==100 ){
                    System.out.printf("%8d %10d %10d %10d %10d %10.1f\n",rooster,5,hen,3,chick,0.3);
                }

            }
        }

        System.out.println("一共执行了"+count+"次");


    }
}
