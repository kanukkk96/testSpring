package com.example.testspring.web;

import com.example.testspring.domain.ShopUser;
import com.example.testspring.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class ShopController {

    @Autowired
    private ShopService shopService;

    @GetMapping("shop.do" )
    public String test(HttpServletRequest req, HttpServletResponse res){
        ShopUser shopuser = shopService.getUserList_shop();
        return "white 사용자 정보 "+ shopuser.getName_shop();

    }

}