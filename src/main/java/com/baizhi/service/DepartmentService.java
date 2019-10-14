package com.baizhi.service;

import com.baizhi.entity.Department;

import java.util.List;

public interface DepartmentService {
    public List<Department> queryAllDepartment();

    //注册部门
    public void insertDepartment(Department department);

    //修改部门
    public void updateDepartment(Department department);
}
