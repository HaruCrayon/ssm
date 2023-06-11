package com.lee.mybatisplus;

import com.lee.mybatisplus.bean.User;
import com.lee.mybatisplus.enums.SexEnum;
import com.lee.mybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author LiJing
 * @version 1.0
 */
@SpringBootTest
public class MyBatisPlusEnumTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
        User user = new User();
        user.setName("root");
        user.setAge(33);
        user.setSex(SexEnum.FEMALE);
        int result = userMapper.insert(user);
        System.out.println("result:" + result);
    }
}
