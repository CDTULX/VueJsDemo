package com.lx.service;

import com.lx.domain.User;

import java.util.List;


public interface IUserService {
    /*
     * 查询用户列表
     * */
    List<User> findAll();

    User findById(Integer userId);
    /*
     * 根据id查询修改
     * */
    void updateUser(User user);
}
