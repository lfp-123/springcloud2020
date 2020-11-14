package com.newland.cloud.springcloudorder80.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ${林锋鹏}
 * @Title: OrderConfiguration
 * @ProjectName springcloud-2020
 * @Description: TODO
 * @date 2020/11/11 22:12
 */
@Configuration
public class OrderConfiguration {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }
}
