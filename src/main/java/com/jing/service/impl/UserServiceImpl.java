package com.jing.service.impl;

import com.jing.mapper.UserMapper;
import com.jing.pojo.User;
import com.jing.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName:UserServiceImpl
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/25 18:53
 * @Version 1.0
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }

    @Override
    @Transactional
    public void addUsers(User user1, User user2) {
        userMapper.addUser(user1);
        //测试事务手动添加的异常
        //int x = 1 / 0;
        userMapper.addUser(user2);

    }

    @Override
    public void deleteUserById(Long id) {
        userMapper.deleteUserById(id);
    }
}
