package com.example.testspring.web;

import com.example.testspring.domain.Shop;
import com.example.testspring.mapper.ShopMapper;
import com.example.testspring.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.lang.NullPointerException;
import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ShopController {

    @Autowired
    private ShopService shopService;

    @GetMapping("shop.do")
    public ModelAndView test(HttpServletRequest req, HttpServletResponse res) throws Exception
    {
        ModelAndView mav = new ModelAndView("product_list");

        List<Shop> productList = shopService.getShopList();

        mav.addObject("productList", productList);

        return mav;
    }

    @PostMapping("shop.do")
    public ModelAndView test1(HttpServletRequest req, HttpServletResponse res,@RequestParam(value="clothes") String clothes
    ,@RequestParam(value="color") String color,@RequestParam(value="clothes_size") String clothes_size) throws Exception
    {
        Shop shop = new Shop();
        shop.setClothes(clothes);
        shop.setColor(color);
        shop.setClothesSize(clothes_size);

        shopService.insert_data(shop);
        ModelAndView mav = new ModelAndView("product_list");

        List<Shop> productList = shopService.getShopList();

        mav.addObject("productList", productList);

        return mav;
    }

}