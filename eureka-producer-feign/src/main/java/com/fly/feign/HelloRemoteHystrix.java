package com.fly.feign;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @program: spring-cloud-demo
 * @description:
 * @author: Mr.fly
 * @create: 2019-12-12 14:22
 **/
@Service("HelloRemoteHystrix")
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello(String name) {
        return "Hello World!";
    }

}

