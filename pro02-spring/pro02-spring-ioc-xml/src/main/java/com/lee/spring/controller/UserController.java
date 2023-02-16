package com.lee.spring.controller;

import com.lee.spring.service.UserService;

/**
 * @author LiJing
 * @version 1.0
 */
public class UserController {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser(){
        userService.saveUser();
    }
}
