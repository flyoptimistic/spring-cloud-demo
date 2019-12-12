package com.fly.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @program: spring-cloud-demo
 * @description:
 * @author: Mr.fly
 * @create: 2019-12-11 14:27
 **/

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/")
    public String hello(@RequestParam(value = "name") String name) {
        return "Hello   " + name + "   " + new Date();
    }

}

