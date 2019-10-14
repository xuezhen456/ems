package com.baizhi.controller;

import com.baizhi.entity.Department;
import com.baizhi.entity.Employee;
import com.baizhi.service.DepartmentService;
import com.baizhi.service.EmployeeService;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class EmployeeAction {
    private EmployeeService employeeService;
    private List<Employee> employees;
    private Employee employee;
    //文件
    private File upload;
    //文件名字
    private String uploadFileName;
    private Integer id;
    private Department department;

    private List<Department> departments;
    private DepartmentService departmentService;


    //删除员工
    public String delete() {
        department.setId(department.getId());
        employeeService.deleteEmployee(id);
        return "delete";
    }


    //查询员工
    public String queryAll() {
        employees = employeeService.queryAllEmployee(id);
        return "queryAll";
    }

    //注册员工
    public String insert() throws IOException {
        departments = departmentService.queryAllDepartment();
        //上传头像
        //获取到绝对路径
        String realPath = ServletActionContext.getServletContext().getRealPath("/img");
        File file1 = new File(realPath);
        if (file1.exists()) {
            file1.mkdirs();
        }
        String newname = new Date().getTime() + "_" + uploadFileName;
        employee.setSrc(newname);
        FileUtils.copyFile(upload, new File(realPath, newname));
        employee.setName(employee.getName());
        employee.setSalary(employee.getSalary());
        employee.setAge(employee.getAge());

        employee.setDepartment_name(department.getName());

        employeeService.insertEmployee(employee);
        return "insertok";
    }

    //修改员工
    public String updateEmployee() throws IOException {
        String realPath = ServletActionContext.getServletContext().getRealPath("/img");
        File file1 = new File(realPath);
        if (file1.exists()) {
            file1.mkdirs();
        }
        String newname = new Date().getTime() + "_" + uploadFileName;
        employee.setSrc(newname);
        employee.setId(id);
        department.setId(department.getId());
        FileUtils.copyFile(upload, new File(realPath, newname));
        employee.setName(employee.getName());
        employee.setSalary(employee.getSalary());
        employee.setAge(employee.getAge());

        employee.setDepartment_name(department.getName());


        employeeService.updateEmployee(employee);
        return "updateok";
    }


    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void setEmployeeService(EmployeeService employeeService) {

        this.employeeService = employeeService;
    }

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public void setDepartmentService(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }
}
