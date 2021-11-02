package com.example.testspring.service;

import com.example.testspring.domain.Shop;
import com.example.testspring.domain.User;

import java.util.List;

public interface UserService {

    List<User> getUserList() throws Exception;
}