package com.example.testspring.domain;

import java.util.Date;


public class ShopUser {
    public  int id_shop;
    public String username_shop;
    public int age_shop;
    public String dress;
    public String color;

    public ShopUser() {
    }

    public ShopUser(String username_shop, int age_shop, String dress) {
        this.username_shop = username_shop;
        this.age_shop = age_shop;
        this.dress = dress;
    }

    public String getUsername_shop() {
        return username_shop;
    }

    public void setUsername_shop(String username_shop) {
        this.username_shop = username_shop;
    }



    public void setAge_shop(int age_shop) {
        this.age_shop = age_shop;
    }

    public String getName_shop() {
        return username_shop;
    }
    public int getAge_shop() {
        return age_shop;
    }

    public String getDress() {
        return dress;
    }

    public String getColor() {
        return color;
    }
}