package com.example.testspring.dao;

import com.example.testspring.domain.Shop;
import java.util.List;

public interface ShopDao {
    List<Shop> getShopById(Integer id);
}