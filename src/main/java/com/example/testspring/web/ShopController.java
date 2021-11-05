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

    @GetMapping("shop.do") // 쇼핑리스트 (detail 제외)
    public ModelAndView test(HttpServletRequest req, HttpServletResponse res) throws Exception {
        ModelAndView mav = new ModelAndView("product_list");

        List<Shop> productList = shopService.getShopList();

        mav.addObject("productList", productList);

        return mav;
    }


    @RequestMapping("detail.do") // 쇼핑리스트 (detail 포함 - 각각 제품의 product_id를 이용해 불러냄)
    public ModelAndView test2(HttpServletRequest req, HttpServletResponse res,
                              @RequestParam(value="productId") int productId
                              ) throws Exception {
        ModelAndView mav = new ModelAndView("more_product");
        Shop paramData = new Shop();
        paramData.setProductId(productId);
        List<Shop> moreProduct = shopService.getMore(paramData);

        mav.addObject("moreProduct", moreProduct);

        return mav;
    }

    @GetMapping("save.do") // clothes_review까지 기록해 save
    public ModelAndView test1(HttpServletRequest req, HttpServletResponse res) throws Exception
    {
        ModelAndView mav = new ModelAndView("save_list");

        List<Shop> saveList = shopService.getShopList();

        mav.addObject("saveList", saveList);

        return mav;
    }
    @PostMapping("shop.do")
    public ModelAndView test1(HttpServletRequest req, HttpServletResponse res,
                              @RequestParam(value="clothes") String clothes,
                              @RequestParam(value="color") String color,
                              @RequestParam(value="clothes_size") String clothes_size,
                              @RequestParam(value="clothes_review") String clothes_review) throws Exception
    {
        Shop shop = new Shop();
        shop.setClothes(clothes);
        shop.setColor(color);
        shop.setClothesSize(clothes_size);
        shop.setClothesReview(clothes_review);

        shopService.insert_data(shop);
        ModelAndView mav = new ModelAndView("save_list");

        List<Shop> saveList = shopService.getShopList();

        mav.addObject("saveList", saveList);

        return mav;
    }


}