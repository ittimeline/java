package net.ittimeline.java.foundational.oop.enums;

/**
 * 枚举季节
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/25 7:27
 * @since JDK11
 */
public enum Season {

    /**
     *  public static final Season SPRING=new Season("")
     */
    SPRING("春天"),SUMMER("夏天"),AUTUMN("秋天"),WINTER("冬天");



    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 根据描述获取枚举实例(枚举值)
     * @param description 描述
     * @return 枚举值
     */
    public static Season getSeasonByDescription(String description){

        for (Season value : Season.values()) {
            if(description.equals(value.getDescription())){
                return value;
            }
        }
        return null;
    }

    /***************************枚举的构造方法*******************************/

//    Season(){
//        System.out.println("枚举的实例被初始化了");
//    }

    Season(String description){
        this.description=description;
    }


    @Override
    public String toString() {
        return "季节{" +
                "季节描述 '" + description + '\'' +
                '}';
    }


}
