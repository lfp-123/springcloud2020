package com.newland.cloud.spirngcloudorderconsul.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ${linfengpeng}
 * @Title: OrderConfiguration
 * @ProjectName springcloud2020
 * @Description: TODO
 * @date 2020/11/16 11:21
 */
@Configuration
public class OrderConfiguration {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
