package com.blog.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class BlogSwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogSwaggerApplication.class, args);
    }

}
