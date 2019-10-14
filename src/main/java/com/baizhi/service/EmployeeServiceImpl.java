package com.baizhi.service;

import com.baizhi.entity.Employee;
import com.baizhi.mapper.EmployeeMapper;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeMapper employeeMapper;

    public void setEmployeeMapper(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    @Override
    public List<Employee> queryAllEmployee(Integer id) {
        List<Employee> employees = employeeMapper.queryAllEmployee(id);
        return employees;
    }

    @Override
    public void insertEmployee(Employee employee) {

        employeeMapper.insertEmployee(employee);
    }

    //删除
    @Override
    public void deleteEmployee(Integer id) {
        employeeMapper.deleteEmployee(id);
    }

    //修改员工
    @Override
    public void updateEmployee(Employee employee) {
        employeeMapper.updateEmployee(employee);
    }

}
