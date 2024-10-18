package net.ittimeline.java.core.foundational.array.onedimensional;

/**
 * 破解房东电话
 * 需求：爱博家园单间短期出租 6 个月， 3550 元/月（水电煤公摊，网费 100 元/月），空调、卫生间、厨房齐全。
 * 屋内均是 IT 行业人士，喜欢安静。所以要求来租者最好是同行或者刚毕业的年轻人，爱干净、安静。
 * 根据以下程序破解房东电话号码
 *
 * @author tony 18601767221@163.com
 * @version 2024/10/18 9:11
 * @since Java21
 */
public class CrackLandlordTelephone {
    public static void main(String[] args) {
        //手机号的数字索引列表
        int[] numberIndexList = new int[]{8, 6, 1, 7, 2, 0};
        //手机号所有数字的索引列表
        int[] telPhoneNumberIndexList = {2, 0, 1, 5, 2, 3, 1, 3, 4, 4, 2};
        System.out.print("房东的电话号码是");
        //手机号码一共11个数字
        for (int i = 0; i < telPhoneNumberIndexList.length; i++) {
            //telPhoneNumberIndexList[i] 表示手机号每个数字的索引
            //numberIndexList[telPhoneNumberIndexList[i]] 表示手机号每个数字
            System.out.print(numberIndexList[telPhoneNumberIndexList[i]]);
        }
    }
}
