package com.baizhi.mapper;

import com.baizhi.entity.Department;

import java.util.List;

public interface DepartmentMapper {
    //查询所有部门
    public List<Department> queryAllDepartment();

    //注册部门
    public void insertDepartment(Department department);

    //修改部门
    public void updateDepartment(Department department);
}
