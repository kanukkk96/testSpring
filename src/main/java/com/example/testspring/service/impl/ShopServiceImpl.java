package com.example.testspring.service.impl;

import com.example.testspring.dao.ShopDao;
import com.example.testspring.domain.Shop;
import com.example.testspring.mapper.ShopMapper;
import com.example.testspring.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopMapper shopMapper;

    @Override
    public List<Shop> getShopList() throws Exception{
        List<Shop> shopList = shopMapper.selectShopping();
        return shopList;
    }
    public List<Shop> getMore() throws Exception{
        List<Shop> moreDetail = shopMapper.more_detail();
        return moreDetail;
    }

    @Override
    public void insert_data(Shop shop) throws Exception {
        shopMapper.insert_data(shop);
    }

}