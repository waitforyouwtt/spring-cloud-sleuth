package com.book.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 一点点
 * @Date: 2018/11/23 11:13
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/hi")
    public String hi(){
        return "hi how are you ";
    }

}
