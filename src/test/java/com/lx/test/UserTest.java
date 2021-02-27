package com.lx.test;

import com.lx.domain.User;
import com.lx.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/*
* 用户的业务层测试
* */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserTest {
    @Autowired
    private IUserService iUserService;

    @Test
    public void testFindAll(){
        List<User> users=iUserService.findAll();
        System.out.println(users);

    }
    @Test
    public void testFindOne(){
        User user=iUserService.findById(1);
        System.out.println(user);
    }
    @Test
    public void testUpdate(){
        User user=iUserService.findById(1);
        System.out.println(user);
        user.setAge(user.getAge()+1);
        iUserService.updateUser(user);
        System.out.println("年龄+1  修改后的用户");
        user=iUserService.findById(1);
        System.out.println(user);

    }
}
