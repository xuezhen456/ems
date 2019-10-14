package com.baizhi.mapper;

import com.baizhi.entity.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper {
    //管理员登陆
    public Admin loginAdmin(@Param("name") String name, @Param("password") String password);

    //管理员注册
    public void insertAdmin(Admin admin);
}
