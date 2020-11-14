package com.newland.cloud.springcloudpeyment9090;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class SpringcloudPeyment9090Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudPeyment9090Application.class, args);
    }

}
