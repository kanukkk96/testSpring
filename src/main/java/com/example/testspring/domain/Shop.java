package com.example.testspring.domain;

public class Shop {

    public int id;
    public String clothes;
    public String color;
    public String clothes_size;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getClothes_size() {
        return clothes_size;
    }

    public void setClothes_size(String clothes_size) {
        this.clothes_size = clothes_size;
    }
}

