package com.boot.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.boot.config.RedisConfig;
import com.boot.service.AccountService;

/**
 * @author zhangxiong
 * @date 2017/8/3.
 */
@Service("accountService") public class AccountServiceImpl implements AccountService {
    private Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Resource private RedisConfig redisConfig;

    @Override public String getAccountName() {
        logger.info("redisConfig host = {}, port = {}", redisConfig.getHost(), redisConfig.getPort());

        return "accountName = zx";
    }
}
