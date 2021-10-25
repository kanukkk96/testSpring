package com.example.testspring.dao;

import com.example.testspring.domain.ShopUser;
import java.util.List;

public interface ShopDao {
    List<ShopUser> getUserById_shop(Integer id_shop);
}