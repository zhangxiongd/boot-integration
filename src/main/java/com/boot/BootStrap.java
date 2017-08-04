package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.util.StringUtils;

import com.boot.config.RedisConfig;

/**
 * @author zhangxiong
 * @date 2017/8/2.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
@ImportResource("spring/spring-content.xml")
@EnableConfigurationProperties(RedisConfig.class)
public class BootStrap {
    public static void main(String[] args) {
        Long id = 5075008l;
        System.out.println(StringUtils.pathEquals(String.valueOf(id), "5075008"));
        SpringApplication app = new SpringApplication(BootStrap.class);
        app.run(args);
    }
}
