package net.ittimeline.java.web.foundational;

/**
 * @author tony 18601767221@163.com
 * @version 2021/7/6 12:01
 * @since JDK11
 */

public class StringTest {

    public static void main(String[] args) {
        //列名和属性名是一致的
        String originColumnName = "id";
        String filedName = "id";
        System.out.println(compareColumnNameFiledName(originColumnName, filedName));

        //列名和属性不一致
        originColumnName = "update_date";
        filedName = "updateDate";
        System.out.println(compareColumnNameFiledName(originColumnName, filedName));


    }



    /**
     * 比较列名和属性名是否相等
     * @param originColumnName 数据库的原列名
     * @param filedName 属性名
     * @return
     */
    private static boolean compareColumnNameFiledName(String originColumnName,String filedName){
        //列名不包含下划线并且列名和属性名一致
        if (!originColumnName.contains("_")&&originColumnName.equals(filedName)){
            return true;
        }else if (originColumnName.contains("_")){
            //由update_date_time转成updateDateTime
            String[] splitColumnWordNames = originColumnName.split("_");
            StringBuffer columnNameAppender=new StringBuffer(splitColumnWordNames[0]);
            for (int i = 1; i < splitColumnWordNames.length; i++) {
                String splitColumnWordName = splitColumnWordNames[i];
                char firstCharLower = splitColumnWordName.charAt(0);
                char firstCharUpper = Character.toUpperCase(firstCharLower);
                String splitColumnWordNameFirstLetterUpper = splitColumnWordName.replace(firstCharLower, firstCharUpper);
                columnNameAppender.append(splitColumnWordNameFirstLetterUpper);
            }
            //由于StringBuffer没有重写toString()方法，因此需要转成String之后再做判断
            String columnName = columnNameAppender.toString();
            return columnName.equals(filedName);
        }
        return false;

    }
}
