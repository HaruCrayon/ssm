package com.lee.mybatis.mapper;

import com.lee.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author LiJing
 * @version 1.0
 */
public interface SelectMapper {
    /**
     * 若sql语句查询的结果为多条时，一定不能以实体类类型作为方法的返回值
     * 否则会抛出异常TooManyResultsException
     * 若sql语句查询的结果为1条时，此时可以使用实体类类型或list集合类型作为方法的返回值
     */

    /**
     * 根据id查询用户信息
     *
     * @param id
     * @return
     */
    User getUserById(@Param("id") Integer id);

    /**
     * 查询所有的用户信息
     *
     * @return
     */
    List<User> getAllUser();

    /**
     * 查询用户的总数量
     *
     * @return
     */
    Integer getCount();

    /**
     * 根据id查询用户信息为map集合
     *
     * @param id
     * @return
     */
    Map<String, Object> getUserByIdToMap(@Param("id") Integer id);

    /**
     * 查询所有的用户信息为map集合
     * 若查询的数据有多条时，并且要将每条数据转换为map集合
     * 此时有两种解决方案：
     * 1、将mapper接口方法的返回值设置为泛型是map的list集合
     * List<Map<String, Object>> getAllUserToMap();
     * 结果：
     * [
     *  {password=123, gender=男, id=5, age=23, email=tre2_ytf@qq.com, username=root},
     *  {password=90700, gender=女, id=6, age=20, email=yyanpoww@sina.com, username=tom},
     *  {password=32409, gender=男, id=8, username=zhangsan},
     *  {password=7542, gender=女, id=9, age=18, email=haha@163.com, username=harry}
     * ]
     *
     * 2、可以将每条数据转换的map集合放在一个大的map中，但是必须要通过@MapKey注解
     * 将查询的某个字段的值作为大的map的键
     * @MapKey("id") Map<String, Object> getAllUserToMap();
     * 结果：
     * {
     *  5={password=123, gender=男, id=5, age=23, email=tre2_ytf@qq.com, username=root},
     *  6={password=90700, gender=女, id=6, age=20, email=yyanpoww@sina.com, username=tom},
     *  8={password=32409, gender=男, id=8, username=zhangsan},
     *  9={password=7542, gender=女, id=9, age=18, email=haha@163.com, username=harry}
     * }
     */
//    List<Map<String, Object>> getAllUserToMap();
    @MapKey("id")
    Map<String, Object> getAllUserToMap();
}
