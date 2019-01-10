package com.example.svcprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SvcProviderApplication {

    // 添加默认引用
    @RequestMapping("/")
    public String home() {
        return "SvcProvider:Hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(SvcProviderApplication.class, args);
    }

}

