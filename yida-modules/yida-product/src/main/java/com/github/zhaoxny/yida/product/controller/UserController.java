package com.github.zhaoxny.yida.product.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/add")
    public String add(){
        return "user:";
    }
}