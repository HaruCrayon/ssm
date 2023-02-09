package com.lee.mybatis.mapper;

import com.lee.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author LiJing
 * @version 1.0
 */
public interface EmpMapper {

    /**
     * 根据empId查询员工信息
     *
     * @param empId
     * @return
     */
    Emp getEmpByEmpId(@Param("empId") Integer empId);

    /**
     * 根据empId查询员工及对应的部门信息
     *
     * @param empId
     * @return
     */
    Emp getEmpAndDeptByEmpId(@Param("empId") Integer empId);

    /**
     * 通过分步查询，查询员工及对应的部门信息，第一步
     *
     * @param empId
     * @return
     */
    Emp getEmpAndDeptByStepOne(@Param("empId") Integer empId);

    /**
     * 通过分步查询，查询部门以及部门中的员工信息，第二步
     *
     * @param deptId
     * @return
     */
    List<Emp> getDeptAndEmpByStepTwo(@Param("deptId") Integer deptId);
}
