//package com.example.testspring.dao.impl;
//
//import com.example.testspring.dao.ShopDao;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//import com.example.testspring.domain.Shop;
//
//@Repository
//public class ShopDaoImpl implements ShopDao {
//
//    @Override
//    public List<Shop> getShopById(Integer id) {
//        Shop s1 = new Shop();
//        s1.clothes = "black jacket";
//        s1.color = "black";
//        s1.clothes_size = "XL";
//
//        Shop s2 = new Shop();
//        s2.clothes = "white jacket";
//        s2.color = "white";
//        s2.clothes_size = "L";
//
//        Shop s3 = new Shop();
//        s3.clothes = "yellow pants";
//        s3.color = "yellow";
//        s3.clothes_size = "M";
//
//        Shop s4 = new Shop();
//        s4.clothes = "blue pants";
//        s4.color = "blue";
//        s4.clothes_size = "xl";
//
//        List<Shop> shopList = new ArrayList<Shop>();
//
//        shopList.add(s1);shopList.add(s4);
//
//        shopList.add(s2);
//        shopList.add(s3);
//
//        return shopList;
//    }
//
//}