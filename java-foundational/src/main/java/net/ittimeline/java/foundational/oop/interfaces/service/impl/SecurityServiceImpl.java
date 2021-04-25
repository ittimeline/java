package net.ittimeline.java.foundational.oop.interfaces.service.impl;

import net.ittimeline.java.foundational.oop.interfaces.service.SecurityService;

/**
 * 安全服务实现
 *
 * @author tony 18601767221@163.com
 * @version 2021/4/21 8:33
 * @since JDK11
 */
public class SecurityServiceImpl implements SecurityService {
    @Override
    public void securityCheck() {
        System.out.println("网络安全检查通过...");
    }
}
