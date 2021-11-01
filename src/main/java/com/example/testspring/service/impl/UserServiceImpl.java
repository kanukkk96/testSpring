package com.example.testspring.service.impl;

import com.example.testspring.dao.UserDao;
import com.example.testspring.domain.User;
import com.example.testspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    private Integer id;
    int i=0;

    public UserServiceImpl() {
    }

    @Override
    public List<User> getUserList() {
        List<User> userList =userDao.getUserById(id);
        assert userList != null;

        /*
        for(int i=0;i<userList.size();i++){
            System.out.println(userList.get(i).toString());
            //System.out.println(userList.get(i));

            if(userList.get(i) != null){
                return userList.get(i);
            }
        }
        */
        return userList;

    }

}