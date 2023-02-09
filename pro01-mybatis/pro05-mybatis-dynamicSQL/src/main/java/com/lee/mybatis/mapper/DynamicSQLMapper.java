package com.lee.mybatis.mapper;

import com.lee.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author LiJing
 * @version 1.0
 */
public interface DynamicSQLMapper {

    /**
     * 使用if查询员工信息
     *
     * @param emp
     * @return
     */
    List<Emp> getEmpByCondition(Emp emp);

    /**
     * 使用choose查询员工信息
     *
     * @param emp
     * @return
     */
    List<Emp> getEmpByChoose(Emp emp);

    /**
     * 批量添加员工信息
     *
     * @param emps
     */
    void insertMoreEmp(@Param("emps") List<Emp> emps);

    /**
     * 批量删除员工信息
     *
     * @param empIds
     */
    void deleteMoreEmp(@Param("empIds") Integer[] empIds);
}
