package com.lee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LiJing
 * @version 1.0
 */
@Controller
public class TestController {

    @RequestMapping("/test/hello")
    public String testHello() {
        System.out.println(1 / 0);
        return "success";
    }
}
