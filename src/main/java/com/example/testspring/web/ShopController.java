package com.example.testspring.web;

import com.example.testspring.domain.Shop;
import com.example.testspring.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.lang.NullPointerException;
import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ShopController {

    @Autowired
    private ShopService shopService;

    @GetMapping("shop.do" )
    public ModelAndView test(HttpServletRequest req, HttpServletResponse res){
        ModelAndView mav = new ModelAndView("product_list");

        List<Shop> productList = shopService.getShopList();

        mav.addObject("productList", productList);

        return mav;
    }

}
