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

    public UserServiceImpl() {
    }

    @Override
    public User getUserList() {
        List<User> userList =userDao.getUserById(id);

        for(int i=0;i<userList.size();i++){
            System.out.println(userList.get(i).toString());
            //System.out.println(userList.get(i));
            //if(userList.get(i).getAge() == 26){
                //return userList.get(i);
            //}
        }

        return null;
    }

}