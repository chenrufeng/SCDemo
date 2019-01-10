package com.example.svcprovider.controller;

import com.example.svcprovider.entity.User;
import com.example.svcprovider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 */

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/query/{id}")
    public User findByIdUser(@PathVariable("id") Integer id) {
        User us = userService.findUser(id);
        return us;
    }

    @RequestMapping(value = "/del/{id}")
    public String delUser(@PathVariable("id") Integer id) {
        int num = userService.deleteUser(id);
        return num == 1 ? "succ" : "err";
    }

    @RequestMapping(value = "/save/{uname}/{pwd}")
    public String delUser(@PathVariable("uname") String uname, @PathVariable("pwd") String pwd) {
        User user = new User();
        user.setPwd(pwd);
        user.setUname(uname);
        int num = userService.saveUser(user);
        return num == 1 ? "succ" : "err";
    }

}
