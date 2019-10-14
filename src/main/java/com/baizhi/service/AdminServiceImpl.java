package com.baizhi.service;

import com.baizhi.entity.Admin;
import com.baizhi.mapper.AdminMapper;

public class AdminServiceImpl implements AdminService {
    //依赖dao
    private AdminMapper adminMapper;

    public void setAdminMapper(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }

    @Override
    public Admin loginAdmin(String name, String password) {

        Admin admin = adminMapper.loginAdmin(name, password);
        return admin;
    }

    @Override
    public void insertAdmin(Admin admin) {
        adminMapper.insertAdmin(admin);
    }
}
