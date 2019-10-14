package com.baizhi.controller;

import com.baizhi.entity.Department;
import com.baizhi.service.DepartmentService;
import org.apache.struts2.ServletActionContext;

import java.util.List;

public class DepartmentAction {
    private DepartmentService departmentService;
    private List<Department> departments;
    private Department department;
    private Integer id;

    public String queryAllDepartment() {
        departments = departmentService.queryAllDepartment();
        ServletActionContext.getRequest().getSession().setAttribute("departments", departments);
        return "queryAllDepartment";
    }

    public String insertDepartment() {
        department.setCode(department.getCode());
        department.setName(department.getName());
        departmentService.insertDepartment(department);
        return "insertOK";
    }

    //部门修改
    public String update() {
        department.setId(id);
        department.setCode(department.getCode());
        department.setName(department.getName());
        departmentService.updateDepartment(department);
        return "updateOK";
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDepartmentService(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }


    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {

        this.departments = departments;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
