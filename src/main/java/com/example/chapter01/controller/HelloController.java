package com.example.chapter01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // 谷歌浏览器对于http支持的默认端口号为80端口,若在application.properties中没有指定,
    // 则不能以http://localhost/hello(注:80端口访问)进行访问，必须以http://localhost:8080/hello进行访问
    @GetMapping("/hello")
    public String hello(){
        return "hello spring boot";
    }
}
