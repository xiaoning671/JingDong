package com.jd.controller;

import com.jd.enity.User_Info;
import com.jd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public boolean login(User_Info user){
        System.out.println(user);
        return userService.checkUser(user);

    }

//    @RequestMapping("/test")
//    public User_Info test(int i){
//        System.out.println(i);
//        return userService.test(i);
//    }
    @RequestMapping("/registered")
    public String registered(){
        return "注册界面";
    }
}
