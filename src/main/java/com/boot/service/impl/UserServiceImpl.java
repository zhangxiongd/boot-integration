package com.boot.service.impl;

import com.boot.config.MasterConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.boot.service.UserService;

import javax.annotation.Resource;

/**
 * @author zhangxiong
 * @date 2017/8/3.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    private MasterConfig masterConfig;

    @Override
    public String getUserName() {
        String name = " 张全蛋";
        logger.info("getUserName name = {} host = {}", name, masterConfig.getHost());
        return name;
    }
}
