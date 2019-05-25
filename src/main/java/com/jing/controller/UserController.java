package com.jing.controller;

import com.jing.pojo.User;
import com.jing.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @ClassName:UserController
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/25 18:36
 * @Version 1.0
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * @Description //TODO 查询用户
     * @Date 19:35 2019/5/25
     * @param model
     * @return java.lang.String
     **/
    @RequestMapping("users")
    public String toUsers(Model model) {
        List<User> users = userService.queryUserList();
        model.addAttribute("users",users);
        return "users";
    }

    /**
     * @Description //TODO 删除用户
     * @Date 19:35 2019/5/25
     * @param id
     * @return java.lang.String
     **/
    @RequestMapping("deleteUserById")
    public String saveUser(@RequestParam("id")Long id){
        userService.deleteUserById(id);
        return "redirect:users";//删除后重新发送请求查询最新数据
    }

}
