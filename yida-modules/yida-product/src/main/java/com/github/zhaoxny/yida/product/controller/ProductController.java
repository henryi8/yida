package com.github.zhaoxny.yida.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/productList")
    public String bat() throws Exception {
//        throw new Exception("cuowusssss");


        return "dddddd";
    }


}
