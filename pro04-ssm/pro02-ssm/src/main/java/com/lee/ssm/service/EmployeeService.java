package com.lee.ssm.service;

import com.github.pagehelper.PageInfo;
import com.lee.ssm.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author LiJing
 * @version 1.0
 */
public interface EmployeeService {

    List<Employee> getAllEmployee();

    PageInfo<Employee> getEmployeePage(Integer pageNum);

    void addEmployee(Employee employee);

    Employee getEmployee(Integer empId);

    void updateEmployee(Employee employee);

    void deleteEmployee(Integer empId);

}
