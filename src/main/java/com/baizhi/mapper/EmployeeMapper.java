package com.baizhi.mapper;

import com.baizhi.entity.Employee;

import java.util.List;

public interface EmployeeMapper {
    //查询所有员工
    public List<Employee> queryAllEmployee(Integer id);

    //注册员工
    public void insertEmployee(Employee employee);

    //删除员工
    public void deleteEmployee(Integer id);

    //修改员工
    public void updateEmployee(Employee employee);
}
