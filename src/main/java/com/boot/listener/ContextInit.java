package com.boot.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.stereotype.Component;

/**
 * @author zhangxiong
 * @date 2017/8/8.
 */
@Component
public class ContextInit implements ServletContextInitializer {

    private Logger logger = LoggerFactory.getLogger(ContextInit.class);

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        logger.info("================== ContextInit onStartup =================");
    }
}
