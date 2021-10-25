package com.example.testspring.service.impl;


import com.example.testspring.dao.UserDao;
import com.example.testspring.domain.User;
import com.example.testspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.NullPointerException;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao){
        this.userDao = userDao;
    }

    private Integer id;

    //public UserServiceImpl() {
    //}

    @Override
    public User getUserList() {
        List<User> userList =userDao.getUserById(id);

        for(User id:userList){
            System.out.println(String.format("이름:%s, 나이:%s",id.username,id.age));
        }


        //return getUserList();

        //for(int i=0;i<userList.size();i++){
        //    System.out.println(userList.get(i).getName());
        //    i++;

        //    return userList.get(i);
            //if(userList.get(i).getAge() == 14){
            //    return userList.get(i);
            //}
        //}

        return null;
    }

}