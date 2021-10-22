package com.example.testspring.dao;


import com.example.testspring.domain.User;
import java.util.List;

public interface UserDao {
    List<User> getUserById(Integer id);
}