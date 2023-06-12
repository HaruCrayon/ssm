package com.lee.mybatisplus.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lee.mybatisplus.bean.User;
import com.lee.mybatisplus.mapper.UserMapper;
import com.lee.mybatisplus.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author LiJing
 * @version 1.0
 */
@DS("master")
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
