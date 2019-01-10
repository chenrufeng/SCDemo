package com.example.svcprovider.service;

import com.example.svcprovider.entity.User;

public interface UserService {

    User findUser(Integer id);

    int saveUser(User user);

    int deleteUser(Integer id);
}
