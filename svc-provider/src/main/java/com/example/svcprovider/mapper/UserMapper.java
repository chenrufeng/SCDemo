package com.example.svcprovider.mapper;


import com.example.svcprovider.entity.User;


public interface UserMapper {
    User findUser(Integer id);

    int saveUser(User user);

    int deleteUser(Integer id);
}
