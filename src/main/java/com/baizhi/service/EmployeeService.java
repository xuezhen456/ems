package com.baizhi.service;

import com.baizhi.entity.Employee;

import java.util.List;

public interface EmployeeService {

    //根据部门名称查询员工
    public List<Employee> queryAllEmployee(Integer id);

    //注册员工
    public void insertEmployee(Employee employee);

    //删除员工
    public void deleteEmployee(Integer id);

    //修改员工
    public void updateEmployee(Employee employee);
}
