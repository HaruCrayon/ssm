package com.lee.mybatisx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lee.mybatisx.pojo.User;
import com.lee.mybatisx.service.UserService;
import com.lee.mybatisx.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author leeji
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-06-12 07:53:37
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




