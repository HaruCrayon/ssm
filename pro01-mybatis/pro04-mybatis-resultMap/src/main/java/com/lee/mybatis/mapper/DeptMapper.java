package com.lee.mybatis.mapper;

import com.lee.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * @author LiJing
 * @version 1.0
 */
public interface DeptMapper {

    /**
     * 通过分步查询，查询员工及对应的部门信息，第二步
     *
     * @param deptId
     * @return
     */
    Dept getEmpAndDeptByStepTwo(@Param("deptId") Integer deptId);

    /**
     * 根据deptId查询部门以及部门中的员工信息
     *
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByDeptId(@Param("deptId") Integer deptId);

    /**
     * 通过分步查询，查询部门以及部门中的员工信息，第一步
     *
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByStepOne(@Param("deptId") Integer deptId);
}
