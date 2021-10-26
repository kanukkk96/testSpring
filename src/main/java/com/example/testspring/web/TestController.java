package com.example.testspring.web;

import com.example.testspring.domain.User;
import com.example.testspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.lang.NullPointerException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @GetMapping("test.do" )
    public String test(HttpServletRequest req, HttpServletResponse res){
        User user = userService.getUserList();

        while(user != null){
            if(user.isEmpty()){
                System.out.println(user.isEmpty());
            }
            else{
                System.out.println("not null");
                for(int i=0;i<user.size();i++){
                    System.out.print(user.getUsername()+ " " + user.getAge() + " " + user.getDress());

                }
            }
        }



        //return user.getName();



            //return user.getUsername()+ " " + user.getAge() + " " + user.getDress();

        return null;
    }

}
