package com.example.testspring.service;

import com.example.testspring.domain.Shop;
import com.example.testspring.domain.Tag;

import java.util.List;

public interface ShopService {

    List<Shop> getShopList() throws Exception;
    List<Shop> getMore(Shop paramData) throws Exception;
    void insert_data(Shop shop) throws Exception;
}