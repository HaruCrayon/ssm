package com.lee.mybatis.test;

import com.lee.mybatis.mapper.EmpMapper;
import com.lee.mybatis.pojo.Emp;
import com.lee.mybatis.pojo.EmpExample;
import com.lee.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author LiJing
 * @version 1.0
 */
public class MBGTest {
    @Test
    public void testMBG() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        //根据empId查询数据
//        Emp emp = mapper.selectByPrimaryKey(2);
//        System.out.println(emp);
        //查询所有数据
//        List<Emp> list = mapper.selectByExample(null);
//        list.forEach(System.out::println);
        //根据条件查询数据
//        EmpExample example = new EmpExample();
//        example.createCriteria().andEmpNameEqualTo("张三").andAgeGreaterThan(20);
//        example.or().andGenderEqualTo("女");
//        List<Emp> list = mapper.selectByExample(example);
//        list.forEach(System.out::println);
        //普通修改
        Emp emp = new Emp(3, "lina", null, "女");
//        mapper.updateByPrimaryKey(emp);
        //选择性修改
        mapper.updateByPrimaryKeySelective(emp);
    }
}
