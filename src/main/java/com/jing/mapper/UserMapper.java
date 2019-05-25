package com.jing.mapper;

import com.jing.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName:UserMapper
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/25 17:14
 * @Version 1.0
 */
public interface UserMapper {
    User queryUserById(@Param("id") Long id);

    List<User> queryUserList();

    void deleteUserById(@Param("id") Long id);

    void addUser(User user);
}
