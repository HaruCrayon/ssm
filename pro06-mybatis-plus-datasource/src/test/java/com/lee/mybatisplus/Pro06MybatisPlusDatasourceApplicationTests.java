package com.lee.mybatisplus;

import com.lee.mybatisplus.service.ProductService;
import com.lee.mybatisplus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Pro06MybatisPlusDatasourceApplicationTests {
    @Autowired
    private UserService userService;
    @Autowired
    private ProductService productService;

    @Test
    void contextLoads() {
    }

    @Test
    void test() {
        System.out.println(userService.getById(2));
        System.out.println(productService.getById(1));
    }

}
