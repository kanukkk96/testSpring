package com.example.testspring.service;

import com.example.testspring.domain.Shop;

import java.util.List;

public interface ShopService {

    List<Shop> getShopList() throws Exception;
    void insert_data(Shop shop) throws Exception;
}