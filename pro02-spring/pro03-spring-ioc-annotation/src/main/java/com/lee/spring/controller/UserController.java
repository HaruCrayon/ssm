package com.lee.spring.controller;

import com.lee.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author LiJing
 * @version 1.0
 */
//@Controller("controller")
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public void saveUser() {
        userService.saveUser();
    }
}
