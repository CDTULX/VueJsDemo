package com.lx.web.controller;

import com.lx.domain.User;
import com.lx.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {
    @Autowired
    private IUserService iUserService;

    @RequestMapping("/findAll")
    public  List<User> findAll(){
        System.out.println("findAll");
        return iUserService.findAll();
    }
    @RequestMapping("/findById")
    public  User findById( Integer userId){
        System.out.println("findById   the userId  =  "+userId);
        System.out.println("完成查询findById"+iUserService.findById(userId));
        return iUserService.findById(userId);
    }
    /*
    * 更新
    * */
    @RequestMapping("/updateUser")
    public void updateUser(@RequestBody User user){
        System.out.println("updateUser");

        iUserService.updateUser(user);
        System.out.println(user);
    }
}
