package com.lx.dao;

import com.lx.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDao {
    /*
    * 查询用户列表
    * */
    @Select("select * from user")
    List<User> findAll();
    /*
    * 根据id查询
    * */
    @Select("select * from user where id = #{userid}")
    User findById(Integer userId);
    /*
    * 根据id查询修改
    * */
    @Select("update user set username=#{username},password=#{password},age=#{age},sex=#{sex},email=#{email} where id=#{id}")
    void updateUser(User user);
}
