package com.example.testspring.domain;

public class Shop {

    public int productId;
    public String clothes;
    public String color;
    public String clothesSize;


    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
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

    public String getClothesSize() {
        return clothesSize;
    }

    public void setClothesSize(String clothesSize) {
        this.clothesSize = clothesSize;
    }

    @Override
    public String toString() {
        return "Shop{" +
                ", clothes='" + clothes + '\'' +
                ", color='" + color + '\'' +
                ", clothes_size='" + clothesSize + '\'' +
                '}';
    }
}

