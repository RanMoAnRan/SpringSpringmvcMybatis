package com.jing.service;

import com.jing.pojo.User;

import java.util.List;

/**
 * @ClassName:IUserService
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/25 18:53
 * @Version 1.0
 */
public interface IUserService {
    List<User> queryUserList();

    //测试事务
    void addUsers(User user1, User user2);

    void deleteUserById(Long id);
}
