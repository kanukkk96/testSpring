package com.example.testspring.web;

import com.example.testspring.domain.User;
import com.example.testspring.service.UserService;
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
public class TestController {

    @Autowired
    private UserService userService;

    @GetMapping("test.do" )
    public ModelAndView test(HttpServletRequest req, HttpServletResponse res)throws Exception{
        ModelAndView mav = new ModelAndView("consumer_list");

        List<User> consumerList = userService.getUserList();

        mav.addObject("consumerList", consumerList);

        return mav;
    }
}
