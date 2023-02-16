package com.lee.spring.service.impl;

import com.lee.spring.dao.UserDao;
import com.lee.spring.service.UserService;

/**
 * @author LiJing
 * @version 1.0
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
