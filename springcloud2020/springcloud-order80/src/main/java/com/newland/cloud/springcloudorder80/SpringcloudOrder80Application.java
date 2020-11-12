package com.newland.cloud.springcloudorder80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudOrder80Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudOrder80Application.class, args);
    }

}
