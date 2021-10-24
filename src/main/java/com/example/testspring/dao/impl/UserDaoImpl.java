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
        User u1 = new User();
        u1.username = "kanuk";
        u1.age = 27;

        User u2 = new User();
        u2.username = "geonwoo";
        u2.age = 22;

        User u3 = new User();
        u3.username = "kanu";
        u3.age = 26;

        User u4 = new User();
        u4.username = "capp";
        u4.age = 14;
        List<User> userList = new ArrayList<User>();

        userList.add(u1);
        userList.add(u2);
        userList.add(u3);
        userList.add(u4);

        return userList;
    }

}