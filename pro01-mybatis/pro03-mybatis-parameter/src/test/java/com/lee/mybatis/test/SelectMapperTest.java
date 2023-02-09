package com.lee.mybatis.test;

import com.lee.mybatis.mapper.SelectMapper;
import com.lee.mybatis.pojo.User;
import com.lee.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @author LiJing
 * @version 1.0
 */
public class SelectMapperTest {

    @Test
    public void testGetUserById() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User user = mapper.getUserById(6);
        System.out.println(user);
    }

    @Test
    public void testGetAllUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> list = mapper.getAllUser();
        list.forEach(System.out::println);
    }

    @Test
    public void testGetCount() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Integer count = mapper.getCount();
        System.out.println(count);
    }

    @Test
    public void testGetUserByIdToMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> map = mapper.getUserByIdToMap(4);
        System.out.println(map);
        //{password=hua45, gender=女, id=4, age=17, email=aahoo@126.com, username=smith}
    }

    @Test
    public void testGetAllUserToMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
//        List<Map<String, Object>> list = mapper.getAllUserToMap();
//        System.out.println(list);
        /*
            [
             {password=123, gender=男, id=5, age=23, email=tre2_ytf@qq.com, username=root},
             {password=90700, gender=女, id=6, age=20, email=yyanpoww@sina.com, username=tom},
             {password=32409, gender=男, id=8, username=zhangsan},
             {password=7542, gender=女, id=9, age=18, email=haha@163.com, username=harry}
             ]
         */

        Map<String, Object> map = mapper.getAllUserToMap();
        System.out.println(map);
        /*
            {
             5={password=123, gender=男, id=5, age=23, email=tre2_ytf@qq.com, username=root},
             6={password=90700, gender=女, id=6, age=20, email=yyanpoww@sina.com, username=tom},
             8={password=32409, gender=男, id=8, username=zhangsan},
             9={password=7542, gender=女, id=9, age=18, email=haha@163.com, username=harry}
             }
         */
    }
}
