package com.newland.cloud.springcloudalibabaorder90.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ${linfengpeng}
 * @Title: OrderCongfiguratioin
 * @ProjectName springcloud2020
 * @Description: TODO
 * @date 2020/11/18 15:42
 */
@Configuration
public class OrderCongfiguratioin {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
