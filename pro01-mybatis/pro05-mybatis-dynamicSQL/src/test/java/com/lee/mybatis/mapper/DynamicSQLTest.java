package com.lee.mybatis.mapper;

import com.lee.mybatis.pojo.Emp;
import com.lee.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author LiJing
 * @version 1.0
 */
public class DynamicSQLTest {

    @Test
    public void testGetEmpByCondition() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, "tom", null, "男");
        List<Emp> empList = mapper.getEmpByCondition(emp);
        empList.forEach(System.out::println);
    }

    @Test
    public void testGetEmpByChoose() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, "tom", 20, "男");
        List<Emp> empList = mapper.getEmpByChoose(emp);
        empList.forEach(System.out::println);
    }

    @Test
    public void testInsertMoreEmp() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp1 = new Emp(null, "smith", 21, "男");
        Emp emp2 = new Emp(null, "marry", 24, "女");
        Emp emp3 = new Emp(null, "jack", 25, "男");
        List<Emp> list = Arrays.asList(emp1, emp2, emp3);
        mapper.insertMoreEmp(list);
    }

    @Test
    public void testDeleteMoreEmp() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Integer[] empIds = {5, 6};
        mapper.deleteMoreEmp(empIds);
    }
}
