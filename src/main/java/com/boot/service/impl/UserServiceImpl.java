package com.boot.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.boot.service.UserService;

/**
 * @author zhangxiong
 * @date 2017/8/3.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public String getUserName() {
        String name = " 张全蛋";
        logger.info("getUserName name = {}", name);
        return name;
    }
}
