package net.ittimeline.java.foundational.oop.interfaces.service;

import net.ittimeline.java.foundational.oop.interfaces.service.impl.SecurityServiceImpl;
import net.ittimeline.java.foundational.oop.interfaces.service.impl.ValidationServiceImpl;

/**
 * 通用的用户服务
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/21 8:26
 * @since JDK11
 */
public abstract class CommonUserService {

    /**
     * 组合网络安全服务
     */
    protected final SecurityService securityService=new SecurityServiceImpl();
    /**
     * 组合校验服务
     */
    protected final ValidationService validationService=new ValidationServiceImpl();

    public SecurityService getSecurityService() {
        return securityService;
    }

    public ValidationService getValidationService() {
        return validationService;
    }
}
