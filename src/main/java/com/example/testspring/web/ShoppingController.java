package com.example.testspring.web;

import com.example.testspring.domain.User;
import com.example.testspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class ShoppingController {

    @Autowired
    private UserService userService;

    @GetMapping("shop.do" )
    public String test(HttpServletRequest req, HttpServletResponse res){
        User user = userService.getUserList();
        return "사용자 이름 : " + user.getName();
    }

}
