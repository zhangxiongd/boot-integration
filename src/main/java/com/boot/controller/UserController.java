package com.boot.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.service.AccountService;
import com.boot.service.UserService;

/**
 * @author zhangxiong
 * @date 2017/8/2.
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService    userService;
    @Resource
    private AccountService accountService;

    @RequestMapping("/query")
    String getName() {
        return userService.getUserName()+ "  " + accountService.getAccountName();
    }

}
