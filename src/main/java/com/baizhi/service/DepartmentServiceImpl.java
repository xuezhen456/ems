package com.baizhi.service;

import com.baizhi.entity.Department;
import com.baizhi.mapper.DepartmentMapper;

import java.util.List;

public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentMapper departmentMapper;

    public void setDepartmentMapper(DepartmentMapper departmentMapper) {
        this.departmentMapper = departmentMapper;
    }

    @Override
    public List<Department> queryAllDepartment() {
        List<Department> departments = departmentMapper.queryAllDepartment();
        return departments;
    }

    @Override
    public void insertDepartment(Department department) {
        departmentMapper.insertDepartment(department);
    }

    //部门修改
    @Override
    public void updateDepartment(Department department) {
        departmentMapper.updateDepartment(department);
    }
}
