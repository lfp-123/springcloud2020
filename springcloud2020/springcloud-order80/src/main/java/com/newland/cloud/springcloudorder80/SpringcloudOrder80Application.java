package com.newland.cloud.springcloudorder80;

import com.newland.cloud.springcloudorder80.config.OrderConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClientName;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudOrder80Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudOrder80Application.class, args);
    }

}
