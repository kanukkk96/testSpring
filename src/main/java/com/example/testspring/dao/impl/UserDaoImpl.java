package com.example.testspring.dao.impl;

;
import com.example.testspring.dao.UserDao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import com.example.testspring.domain.User;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public List<User> getUserById(Integer id) {
        List<User> userList = new ArrayList<User>();

        userList.add(new User("c",14));
        userList.add(new User("kanu",26));
        return userList;
    }

}