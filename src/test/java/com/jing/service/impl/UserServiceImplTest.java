package com.jing.service.impl;

import com.jing.pojo.User;
import com.jing.service.IUserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

import static org.junit.Assert.*;

public class UserServiceImplTest {

    //事务管理测试类
    @Test
    public void addUsers() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        IUserService userService = (IUserService) applicationContext.getBean("userService");

        User user1 = new User();
        user1.setName("用户5");
        user1.setPassword("123456");
        user1.setUserName("admin5");
        user1.setAge(18);
        user1.setSex(1);
        user1.setBirthday(new Date());
        User user2 = new User();
        user2.setName("用户6");
        user2.setPassword("123456");
        user2.setUserName("admin6");
        user2.setAge(18);
        user2.setSex(1);
        user2.setBirthday(new Date());
        userService.addUsers(user1, user2);

    }
}