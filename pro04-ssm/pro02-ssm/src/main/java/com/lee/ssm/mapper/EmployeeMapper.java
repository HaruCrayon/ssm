package com.lee.ssm.mapper;

import com.lee.ssm.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author LiJing
 * @version 1.0
 */
public interface EmployeeMapper {
    /**
     * 查询所有员工信息
     * @return
     */
    List<Employee> getAllEmployee();

    /**
     * 添加员工信息
     * @param employee
     */
    void addEmployee(Employee employee);

    /**
     * 根据empId查询员工信息
     * @param empId
     * @return
     */
    Employee getEmployee(@Param("empId") Integer empId);

    /**
     * 修改员工信息
     * @param employee
     */
    void updateEmployee(Employee employee);

    /**
     * 根据empId删除员工信息
     * @param empId
     */
    void deleteEmployee(@Param("empId") Integer empId);
}
