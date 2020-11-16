package com.newland.cloud.spirngcloudorderconsul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ${linfengpeng}
 * @Title: OrderController
 * @ProjectName springcloud2020
 * @Description: TODO
 * @date 2020/11/16 11:20
 */
@RestController
public class OrderController {
    private static final  String URL="http://consul-service-payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String payment(){
        String forObject = restTemplate.getForObject(URL + "/payment/consul", String.class);
        return forObject;
    }
}
