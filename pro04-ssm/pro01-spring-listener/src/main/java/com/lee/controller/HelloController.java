package com.lee.controller;

import com.lee.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author LiJing
 * @version 1.0
 */
@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;
}
