package com.baizhi.entity;

public class Employee {
    private Integer id;
    private String src;
    private String name;
    private Double salary;
    private Integer age;
    private String department_name;


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", src='" + src + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", department_name='" + department_name + '\'' +

                '}';
    }

    public Employee() {
    }

    public Employee(Integer id, String src, String name, Double salary, Integer age, String department_name) {
        this.id = id;
        this.src = src;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.department_name = department_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

}

