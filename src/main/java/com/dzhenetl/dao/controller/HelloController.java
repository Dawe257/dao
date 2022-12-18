package com.dzhenetl.dao.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @GetMapping("/hello")
//    public String hello() {
//        return "Hello!";
//    }

    @GetMapping("/hello")
    public String hello(Authentication auth) {
        System.out.println();
        return "Hello!";
    }
}
