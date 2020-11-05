package com.lxiaocode.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixiaofeng
 * @date 2020/10/31 下午2:39
 * @blog http://www.lxiaocode.com/
 */
@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient client;

    @GetMapping("/hello")
    public String index() {
        String services = "Services: " + client.getServices();
        System.out.println(services);
        return "Hello World";
    }
}