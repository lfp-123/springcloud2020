package com.newland.cloud.springcloudorder80.controller;


import com.newland.cloud.springcloudcommons.pojo.CommentResult;
import com.newland.cloud.springcloudcommons.pojo.Payment;
import com.newland.cloud.springcloudorder80.service.BanlancedService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

/**
 * @author ${linfengpeng}
 * @Title: OrderController
 * @ProjectName springcloud2020
 * @Description: TODO
 * @date 2020/11/11 16:20
 */
@RestController
public class OrderController {
    private static final String URL = "http://CLOUD-PAYMENT-SERVICE";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private BanlancedService banlancedService;

    @Autowired
    private DiscoveryClient client;

    @GetMapping("/consumer/payment/create")
    public CommentResult<Payment> create(Payment payment){
        return restTemplate.postForObject(URL+"/payment/create/",payment,CommentResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommentResult<Payment> getPayment(@PathVariable("id") Long id){
        List<ServiceInstance> instances = client.getInstances("CLOUD-PAYMENT-SERVICE");
        if(instances.size() ==0 || instances ==null){
            return null;
        }
        ServiceInstance instances1 = banlancedService.instances(instances);
        URI url = instances1.getUri();
        return restTemplate.getForObject(url+"/payment/get/"+id,CommentResult.class);
    }


}
