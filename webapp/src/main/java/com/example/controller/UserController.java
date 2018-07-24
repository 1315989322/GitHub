package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/login")
    public String login(){
       List<User> users= userService.findAllUserList();
        System.out.println("users:"+users);
        return "login";
    }

}
