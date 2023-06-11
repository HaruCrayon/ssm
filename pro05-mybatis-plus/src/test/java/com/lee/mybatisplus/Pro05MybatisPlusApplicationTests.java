package com.lee.mybatisplus;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@Slf4j
@SpringBootTest
class Pro05MybatisPlusApplicationTests {
    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() {
        log.info("数据源：{}", dataSource.getClass());
    }

}
