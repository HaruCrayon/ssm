package com.lee.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lee.mybatisplus.mapper")
@SpringBootApplication
public class Pro06MybatisPlusDatasourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Pro06MybatisPlusDatasourceApplication.class, args);
    }

}
