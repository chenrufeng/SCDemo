package com.example.svcprovider.service.impl;


import com.example.svcprovider.entity.User;
import com.example.svcprovider.mapper.UserMapper;
import com.example.svcprovider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User findUser(Integer id) {
        return this.userMapper.findUser(id);
    }

    @Override
    public int saveUser(User user) {
        this.userMapper.saveUser(user);
        return 1;
    }

    @Override
    public int deleteUser(Integer id) {
        this.userMapper.deleteUser(id);
        return 1;
    }

}
