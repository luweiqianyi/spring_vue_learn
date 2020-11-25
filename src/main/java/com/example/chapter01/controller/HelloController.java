package com.example.chapter01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // 在浏览器中访问时需要指定端口号进行访问,端口号在application.properties文件中进行配置
    @GetMapping("/hello")
    public String hello(){
        return "hello spring boot";
    }
}
