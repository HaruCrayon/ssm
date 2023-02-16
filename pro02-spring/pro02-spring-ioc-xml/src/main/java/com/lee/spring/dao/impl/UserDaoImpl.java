package com.lee.spring.dao.impl;

import com.lee.spring.dao.UserDao;

/**
 * @author LiJing
 * @version 1.0
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
