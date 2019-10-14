package com.baizhi.controller;

import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;

public class AdminAction {
    //依赖service
    private AdminService service;
    //参数
    private Admin admin;
    private String name;
    private String password;

    //管理员登陆
    public String login() {
        Admin admin1 = service.loginAdmin(name, password);
        if (admin1 != null) {
            return "ok";
        } else {
            return "error";
        }
    }

    //管理员注册
    public String regist() {
        admin.setName(admin.getName());
        admin.setPassword(admin.getPassword());
        admin.setUsername(admin.getUsername());
        admin.setSex(admin.getSex());
        service.insertAdmin(admin);
        return "registOk";

    }


    public void setService(AdminService service) {
        this.service = service;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
