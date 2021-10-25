package com.example.testspring.service.impl;

import com.example.testspring.dao.ShopDao;
import com.example.testspring.domain.ShopUser;
import com.example.testspring.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopDao shopDao;

    private Integer id;

    public ShopServiceImpl() {
    }

    @Override
    public ShopUser getUserList_shop() {
        List<ShopUser> userList_shop =shopDao.getUserById_shop(id);

        for(int i=0;i<userList_shop.size();i++){
            System.out.println(userList_shop.get(i).getName_shop());
            if(userList_shop.get(i).getAge_shop() == 22){
                return userList_shop.get(i);
            }
            //System.out.println(userList_shop.get(i));
            return userList_shop.get(i);
        }

        return null;
    }

}