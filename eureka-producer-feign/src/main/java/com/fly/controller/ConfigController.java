package com.fly.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @program: spring-cloud-demo
 * @description: 测试config配置
 * @author: Mr.fly
 * @create: 2019-12-13 16:57
 **/
@RestController
@RequestMapping("/config")
public class ConfigController {

    @Value("${info.profile:error}")
    private String profile;

    @GetMapping("/info")
    public Mono<String> config() {
        return Mono.justOrEmpty(profile);
    }

}

