package com.lee.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.lee.ssm.pojo.Employee;
import com.lee.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author LiJing
 * @version 1.0
 * Description:
 * 查询所有的员工信息-->/employee-->get
 * 查询员工的分页信息-->/employee/page/1-->get
 * 根据id查询员工信息-->/employee/1-->get
 * 跳转到添加页面-->/to/add-->get
 * 添加员工信息-->/employee-->post
 * 跳转到修改页面-->/employee/1-->get
 * 修改员工信息-->/employee-->put
 * 删除员工信息-->/employee/1-->delete
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employee/page/{pageNum}", method = RequestMethod.GET)
    public String getEmployeePage(@PathVariable Integer pageNum, Model model) {
        //获取员工的分页信息
        PageInfo<Employee> pageInfo = employeeService.getEmployeePage(pageNum);
        //将分页数据共享到请求域中
        model.addAttribute("pageInfo", pageInfo);
        //跳转到employee_list.html
        return "employee_list";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String getAllEmployee(Model model) {
        //查询所有的员工信息
        List<Employee> employeeList = employeeService.getAllEmployee();
        //将员工信息在请求域中共享
        model.addAttribute("employeeList", employeeList);
        //跳转到employee_list.html
        return "employee_list";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public String addEmployee(Employee employee) {
        //添加员工信息
        employeeService.addEmployee(employee);
        //重定向到列表功能：/employee/page/1
        return "redirect:/employee/page/1";
    }

    @RequestMapping(value = "/employee/{empId}", method = RequestMethod.GET)
    public String toUpdate(@PathVariable("empId") Integer empId, Model model) {
        //根据empId查询员工信息
        Employee employee = employeeService.getEmployee(empId);
        //将员工信息共享到请求域中
        model.addAttribute("employee", employee);
        //跳转到employee_update.html
        return "employee_update";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.PUT)
    public String updateEmployee(Employee employee) {
        //修改员工信息
        employeeService.updateEmployee(employee);
        //重定向到列表功能：/employee/page/1
        return "redirect:/employee/page/1";
    }

    @RequestMapping(value = "/employee/{empId}", method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable("empId") Integer empId) {
        //根据empId删除员工信息
        employeeService.deleteEmployee(empId);
        //重定向到列表功能：/employee/page/1
        return "redirect:/employee/page/1";
    }
}
