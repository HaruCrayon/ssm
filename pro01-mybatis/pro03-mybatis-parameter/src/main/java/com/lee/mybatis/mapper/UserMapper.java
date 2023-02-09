package com.lee.mybatis.mapper;

import com.lee.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @author LiJing
 * @version 1.0
 *
 * 1、若mapper接口方法的参数为实体类类型的参数
 *   只需要通过#{}和${}访问实体类的属性名，就可以获取相对应的属性值，一定要注意${}的单引号问题
 * 2、可以在mapper接口方法的参数上设置@Param注解
 *   此时MyBatis会将这些参数放在map中，以两种方式进行存储
 *   a>以@Param注解的value属性值为键，以参数为值
 *   b>以param1,param2...为键，以参数为值
 *  只需要通过#{}和${}访问map集合的键，就可以获取相对应的值,一定要注意${}的单引号问题
 */
public interface UserMapper {
    /**
     * 根据用户名查询用户信息
     *
     * @param username
     * @return
     */
    User getUserByUsername(String username);

    /**
     * 验证登录
     *
     * @param username
     * @param password
     * @return
     */
    User checkLogin(String username, String password);

    /**
     * 验证登录（以map集合作为参数）
     *
     * @param map
     * @return
     */
    User checkLoginByMap(Map<String, Object> map);

    /**
     * 添加用户信息
     *
     * @param user
     */
    void insertUser(User user);

    /**
     * 验证登录（使用@Param）
     *
     * @param username
     * @param password
     * @return
     */
    User checkLoginByParam(@Param("username") String username, @Param("password") String password);
}
