package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class MainController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/findAll", headers = "Accept=application/json")
    List<User> findAll() {

        List<User> list = userService.findAll();
        return list;

    }



}
