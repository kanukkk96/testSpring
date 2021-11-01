package com.example.testspring.service.impl;

import com.example.testspring.dao.ShopDao;
import com.example.testspring.domain.Shop;
import com.example.testspring.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopDao shopDao;

    private Integer id;
    int i=0;

    public ShopServiceImpl() {
    }

    @Override
    public List<Shop> getShopList() {
        List<Shop> shopList =shopDao.getShopById(id);
        assert shopList != null;

        /*
        for(int i=0;i<userList.size();i++){
            System.out.println(userList.get(i).toString());
            //System.out.println(userList.get(i));

            if(userList.get(i) != null){
                return userList.get(i);
            }
        }
        */
        return shopList;

    }

}