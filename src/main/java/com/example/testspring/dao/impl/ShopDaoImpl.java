package com.example.testspring.dao.impl;

import com.example.testspring.dao.ShopDao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import com.example.testspring.domain.ShopUser;

@Repository
public class ShopDaoImpl implements ShopDao {

    @Override
    public List<ShopUser> getUserById_shop(Integer id) {

        ShopUser s1 = new ShopUser();
        s1.username_shop = "kanuk";
        s1.age_shop = 27;
        s1.dress = "black";

        ShopUser s2 = new ShopUser();
        s2.username_shop = "geonwoo";
        s2.age_shop = 22;
        s2.dress = "white";

        ShopUser s3 = new ShopUser();
        s3.username_shop = "kanu";
        s3.age_shop = 26;
        s3.dress = "yellow";


        List<ShopUser> userList_shop = new ArrayList<ShopUser>();

        userList_shop.add(s1);
        userList_shop.add(s2);
        userList_shop.add(s3);

        return userList_shop;
    }

}