package com.boot.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangxiong
 * @date 2017/8/2.
 */
@RestController
@EnableAutoConfiguration
public class Index {

    @RequestMapping("/")
    String home() {
        return "Hello World ";
    }

}
