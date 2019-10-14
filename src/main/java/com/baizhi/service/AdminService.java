package com.baizhi.service;

import com.baizhi.entity.Admin;

public interface AdminService {
    //管理员登陆
    public Admin loginAdmin(String name, String password);

    //管理员注册
    public void insertAdmin(Admin admin);
}
