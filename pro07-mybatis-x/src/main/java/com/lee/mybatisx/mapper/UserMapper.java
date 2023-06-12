package com.lee.mybatisx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lee.mybatisx.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @author leeji
 * @description 针对表【user】的数据库操作Mapper
 * @createDate 2023-06-12 07:53:37
 * @Entity com.lee.mybatisx.pojo.User
 */
public interface UserMapper extends BaseMapper<User> {
    int insertSelective(User user);

    int deleteByIdAndName(@Param("id") Long id, @Param("name") String name);

    int updateAgeAndSexById(@Param("age") Integer age, @Param("sex") Integer sex, @Param("id") Long id);

    List<User> selectNameAndSexByAgeBetween(@Param("beginAge") Integer beginAge, @Param("endAge") Integer endAge);

    List<User> selectAllOrderByAgeDesc();
}




