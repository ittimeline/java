package net.ittimeline.java.foundational.oop.interfaces.service.impl;

import net.ittimeline.java.foundational.oop.interfaces.service.ValidationService;

/**
 * 校验服务实现
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/21 8:40
 * @since JDK11
 */
public class ValidationServiceImpl implements ValidationService {


    @Override
    public boolean validation(String userName) {
        if("tony".equals(userName)){
            return false;
        }
        return true;
    }
}
