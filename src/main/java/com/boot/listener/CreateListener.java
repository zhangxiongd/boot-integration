package com.boot.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author zhangxiong
 * @date 2017/8/3.
 */
public class CreateListener implements ApplicationListener {
    private Logger logger = LoggerFactory.getLogger(CreateListener.class);

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        logger.info("CreateListener onApplicationEvent trigger");
    }
}
