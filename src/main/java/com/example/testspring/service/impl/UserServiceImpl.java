package com.example.testspring.service.impl;


import com.example.testspring.mapper.UserMapper;
import com.example.testspring.dao.UserDao;
import com.example.testspring.domain.Shop;
import com.example.testspring.domain.User;
import com.example.testspring.mapper.ShopMapper;
import com.example.testspring.service.ShopService;
import com.example.testspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() throws Exception{
        List<User> userList = userMapper.selectUser();
        return userList;

    }

}