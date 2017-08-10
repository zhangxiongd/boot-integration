package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

import com.boot.config.RedisConfig;

/**
 * @author zhangxiong
 * @date 2017/8/2.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
@ImportResource("spring/spring-content.xml")
@PropertySource("config/context.properties")
@EnableConfigurationProperties(RedisConfig.class)
@ServletComponentScan
public class BootStrap {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(BootStrap.class);
        app.run(args);
    }
}
