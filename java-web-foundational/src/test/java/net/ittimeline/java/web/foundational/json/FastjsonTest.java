package net.ittimeline.java.web.foundational.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fasterxml.jackson.core.JsonProcessingException;
import net.ittimeline.java.web.foundational.bean.entity.User;
import net.ittimeline.java.web.foundational.bean.response.ResponseBean;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Fastjson的使用
 *
 * @author tony 18601767221@163.com
 * @version 2021/8/7 11:31
 * @since JDK11
 */
public class FastjsonTest {

    /**
     * User对象转换为JSON字符串
     */
    @Test
    public void testUser2JSONString() {
        //创建对象并且给对象的属性赋值
        User user = new User();
        user.setId(1);
        user.setName("tony");
        user.setPassword("111111");
        user.setCreateDate(LocalDateTime.now());
        user.setUpdateDate(LocalDateTime.now());

        String userJSONString = JSON.toJSONString(user, SerializerFeature.WriteDateUseDateFormat);
        System.out.println("user对象转换为JSON字符串的结果是" + userJSONString);


    }

    /**
     * 将List集合转换为JSON字符串
     */
    @Test
    public void testUserList2JSONString() {
        User tony = new User();
        tony.setId(1);
        tony.setName("tony");
        tony.setPassword("111111");
        tony.setCreateDate(LocalDateTime.now());
        tony.setUpdateDate(LocalDateTime.now());

        User jack = new User();
        jack.setId(2);
        jack.setName("jack");
        jack.setPassword("666666");
        jack.setCreateDate(LocalDateTime.now());
        jack.setUpdateDate(LocalDateTime.now());

        List<User> userList = new ArrayList<>();
        userList.add(tony);
        userList.add(jack);
        String userListJSONString = JSON.toJSONString(userList, SerializerFeature.WriteDateUseDateFormat);

        System.out.println("list集合转换为JSON字符串的结果是" + userListJSONString);

    }


    /**
     * 将ResponseBean对象转换为JSON字符串
     */
    @Test
    public void testResponseBeanBooleanData2JSONString() {
        ResponseBean<Boolean> responseBean = new ResponseBean<>();
        responseBean.setFlag(true);
        responseBean.setData(Boolean.TRUE);

        String responseBeanJSONString = JSON.toJSONString(responseBean);
        System.out.println("responseBean对象转换为JSON字符串的结果是" + responseBeanJSONString);

    }

    /**
     * 将ResponseBean对象转换为JSON字符串
     */
    @Test
    public void testResponseBeanUserData2JSONString() {
        ResponseBean<User> responseBean = new ResponseBean<>(Boolean.TRUE);
        User tony = new User();
        tony.setId(1);
        tony.setName("tony");
        tony.setPassword("111111");
        tony.setCreateDate(LocalDateTime.now());
        tony.setUpdateDate(LocalDateTime.now());
        responseBean.setData(tony);
        String responseBeanJSONString = JSON.toJSONString(responseBean, SerializerFeature.WriteDateUseDateFormat);
        System.out.println("responseBean对象转换为JSON字符串的结果是" + responseBeanJSONString);

    }


    /**
     * 将ResponseBean对象转换为JSON字符串
     */
    @Test
    public void testResponseBeanUserListData2JSONString() {
        ResponseBean<List<User>> responseBean = new ResponseBean<>(Boolean.TRUE);
        User tony = new User();
        tony.setId(1);
        tony.setName("tony");
        tony.setPassword("111111");
        tony.setCreateDate(LocalDateTime.now());
        tony.setUpdateDate(LocalDateTime.now());

        User jack = new User();
        jack.setId(2);
        jack.setName("jack");
        jack.setPassword("666666");
        jack.setCreateDate(LocalDateTime.now());
        jack.setUpdateDate(LocalDateTime.now());

        List<User> userList = new ArrayList<>();
        userList.add(tony);
        userList.add(jack);
        responseBean.setData(userList);

        String responseBeanJSONString = JSON.toJSONString(responseBean, SerializerFeature.WriteDateUseDateFormat);
        System.out.println("responseBean对象转换为JSON字符串的结果是" + responseBeanJSONString);

    }


    /**
     * 将JSON字符串转换为User对象
     */
    @Test
    public void testJONString2User() {
        String jsonString = "{\"id\":1,\"name\":\"tony\",\"password\":\"111111\",\"createDate\":\"2021-08-07 10:02:30\",\"updateDate\":\"2021-08-07 10:02:30\"}";
        User user = JSON.parseObject(jsonString, User.class);
        System.out.println("JSON字符串转换为User对象的结果是" + user);


    }

    /**
     * 将JSON字符串转换为List集合
     */
    @Test
    public void testJSONString2List() {
        String jsonString = "[{\"id\":1,\"name\":\"tony\",\"password\":\"111111\",\"createDate\":\"2021-08-07 10:06:58\",\"updateDate\":\"2021-08-07 10:06:58\"},{\"id\":2,\"name\":\"jack\",\"password\":\"666666\",\"createDate\":\"2021-08-07 10:06:58\",\"updateDate\":\"2021-08-07 10:06:58\"}]";
        List<User> userList = JSON.parseArray(jsonString, User.class);
        System.out.println("将JSON字符串转换为List集合的结果是" + userList);

    }


    /**
     * 将JSON字符串转换为ResponseBean,data为List集合
     *
     * @throws JsonProcessingException
     */
    @Test
    public void testJSONString2ResponseBeanListData() {
        String jsonString = "{\"flag\":true,\"data\":[{\"id\":1,\"name\":\"tony\",\"password\":\"111111\",\"createDate\":\"2021-08-07 10:12:02\",\"updateDate\":\"2021-08-07 10:12:02\"},{\"id\":2,\"name\":\"jack\",\"password\":\"666666\",\"createDate\":\"2021-08-07 10:12:02\",\"updateDate\":\"2021-08-07 10:12:02\"}],\"errorMessage\":null}";
        // parseObject(String text, TypeReference<T> type)
        ResponseBean responseBean = JSON.parseObject(jsonString,new TypeReference<ResponseBean<List<User>>>(){} );
        System.out.println("将JSON字符串转换为responseBean的结果是" + responseBean);


    }

}
