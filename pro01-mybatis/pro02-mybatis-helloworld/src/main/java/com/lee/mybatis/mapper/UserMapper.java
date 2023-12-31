package com.lee.mybatis.mapper;

import com.lee.mybatis.pojo.User;

import java.util.List;

/**
 * @author LiJing
 * @version 1.0
 */
public interface UserMapper {
    /**
     * 添加用户信息
     * @return
     */
    int insertUser();

    /**
     * 修改用户信息
     */
    void updateUser();

    /**
     * 删除用户信息
     */
    void deleteUser();

    /**
     * 根据id查询一个用户信息
     * @return
     */
    User getUserById();

    /**
     * 查询所有用户信息
     * @return
     */
    List<User> getAllUser();
}
