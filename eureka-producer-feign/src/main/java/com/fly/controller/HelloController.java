package com.fly.controller;

import com.fly.feign.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-cloud-demo
 * @description:
 * @author: Mr.fly
 * @create: 2019-12-11 15:02
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    @Qualifier("HelloRemoteHystrix")
    private HelloRemote helloRemote;

    @GetMapping("/{name}")
    public String hello(@PathVariable("name") String name) {
        String hello = helloRemote.hello(name);
        return hello + "!";
    }

    @GetMapping("/aaa")
    public String aaa() {
        String hello = "aaaa";
        return hello + "!";
    }


}

